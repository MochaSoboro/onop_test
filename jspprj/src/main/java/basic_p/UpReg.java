package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

/**
 * Servlet implementation class UpReg
 */
@WebServlet("/UpReg")
@MultipartConfig(maxFileSize = 1024*1024*20)	// 1MB = 1024×1024 byte

public class UpReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpReg() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet 실행");
		
		// 일반 input 가져옴 - 파라미터를 문자열로 받음
		System.out.println("pname: "+request.getParameter("pname"));
		// file type은 null로 들어옴
		System.out.println("ff1: "+request.getParameter("ff1"));
		
		System.out.println("getPart----------------------------------");
		Part ff1 = request.getPart("ff1");
		System.out.println("getName: "+ff1.getName());	// 파라미터 이름
		System.out.println("getContentType: "+ff1.getContentType());	// 파일 종류
		System.out.println("getSize: "+ff1.getSize());	// 파일 크기
		System.out.println("getSubmittedFileName: "+ff1.getSubmittedFileName());	// 업로드 파일명
													// 파일이 없을 경우 getSubmittedFileName() == ""
		
		// 저장할 폴더 위치
		// 배포시
		String dst = request.getServletContext().getRealPath("up")+"\\";
		// 이클립스 작업시
		// dst = "C:\\Study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
		System.out.println("dst: "+dst);

		// 파일이 업로드 되었다면
		if (!ff1.getSubmittedFileName().equals("")) {
			
			// 파일 쓰기 --> 저장
			ff1.write(dst+ff1.getSubmittedFileName());
			
			// 임시폴더에 업로드된 파일 삭제
			ff1.delete();
		}
		
		
		
		// 파라미터들을 객체로 받음
		// multiple(파일 여러개 업로드) 처리 가능
		System.out.println("getParts----------------------------------");
		Collection<Part> pps = request.getParts();
		for (Part part : pps) {
			System.out.println(part.getName()+"\t"+part.getContentType()+"\t"+part.getSize()+"\t"+part.getSubmittedFileName());
			
			// ff2만 저장, 업로드 파일 존재시 저장
			if(part.getName().equals("ff2") && !part.getSubmittedFileName().equals("")) {
				System.out.println("ff2 저장");
				
				
				// 파일 쓰기 --> 저장
				part.write(dst+part.getSubmittedFileName());
				
				
				// 임시폴더에 업로드된 파일 삭제
				part.delete();
			}
		}
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter()
		.append("UpReg 진입")
		.append("<script>")
		.append("alert('파일저장')")
		.append("</script>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
