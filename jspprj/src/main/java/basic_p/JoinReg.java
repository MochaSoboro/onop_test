package basic_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

/**
 * Servlet implementation class JoinReg
 */
@WebServlet("/JoinReg")
@MultipartConfig(maxFileSize = 1024*1024*20)
public class JoinReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet실행");
		// 저장할 폴더 위치
		// 배포시
		String dst = request.getServletContext().getRealPath("up")+"\\";
		// 이클립스 작업시
		dst = "C:\\Study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
		System.out.println("dst: "+dst);
	
		String img = null;
		System.out.println("getParts----------------------------------");
		Collection<Part> pps = request.getParts();
		for (Part part : pps) {
			System.out.println(part.getName()+"\t"+part.getContentType()+"\t"+part.getSize()+"\t"+part.getSubmittedFileName());
	
			if(part.getName().equals("img") && !part.getSubmittedFileName().equals("")) {
				System.out.println("img 저장");
						
				// 파일 쓰기 --> 저장
				part.write(dst+part.getSubmittedFileName());
				img = part.getSubmittedFileName();
				request.setAttribute("img", part.getSubmittedFileName());
						
				// 임시폴더에 업로드된 파일 삭제
				part.delete();
			}
			
		}
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("birth", request.getParameter("birth"));
		request.setAttribute("addr", request.getParameter("addr"));
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/file/joinReg.jsp");
		dispatcher.forward(request, response);
				
//		response.setContentType("text/html; charset=UTF-8");
//		response.getWriter()
//		.append("이름: ")
//		.append(request.getParameter("name"))
//		.append("<br/>")
//		.append("생년월일: ")
//		.append(request.getParameter("birth"))
//		.append("<br/>")
//		.append("주소: ")
//		.append(request.getParameter("addr"))
//		.append("<br/>")
//		.append("사진: ")
//		.append("<img src='up/"+img+"' width='500px' />")
//		.append("<br/>")
//		.append("<script>")
//		.append("alert('이력서 업로드 완료')")
//		.append("</script>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
