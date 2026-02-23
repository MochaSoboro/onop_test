package di_p;

import java.text.SimpleDateFormat;
import java.util.Date;

import db_p.MemDAO;
import db_p.MemDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import member.Action;

public class MemberInsertReg implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemDTO dto = new MemDTO();
		dto.setMemid(request.getParameter("mid"));
		dto.setMname(request.getParameter("mname"));
		dto.setEmail(request.getParameter("email"));
		dto.setTel(Integer.parseInt(request.getParameter("tel")));
		dto.setAddr(request.getParameter("addr"));
		dto.setBirth(request.getParameter("birth"));
		String dst = request.getServletContext().getRealPath("up")+"\\";
		dst = "C:\\Study\\java_work\\mvcprj\\src\\main\\webapp\\up\\";
		
		try {
			Part ff = request.getPart("ff");
			
			if (!ff.getSubmittedFileName().equals("")) {
				dto.setImg(ff.getSubmittedFileName());
				
				ff.write(dst+ff.getSubmittedFileName());
				
				ff.delete();
			}
			else {
				dto.setImg(null);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		new MemDAO().insert(dto);
		request.setAttribute("id", request.getParameter("mid"));
	}

}
