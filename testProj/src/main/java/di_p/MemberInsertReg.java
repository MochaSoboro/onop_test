package di_p;

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
		dto.setMemid(request.getParameter("memid"));
		dto.setMname(request.getParameter("mname"));
		dto.setEmail(request.getParameter("email"));
		dto.setTel(Integer.parseInt(request.getParameter("tel")));
		dto.setAddr(request.getParameter("addr"));
		dto.setBirth(request.getParameter("birth"));
		
		String dst = request.getServletContext().getRealPath("up")+"\\";
		dst = "C:\\Study\\java_work\\testProj\\src\\main\\webapp\\up\\";
		
		try {
			Part img = request.getPart("img");
			
			if (!img.getSubmittedFileName().equals("")) {
				dto.setImg(img.getSubmittedFileName());
				
				img.write(dst+img.getSubmittedFileName());
				img.delete();
				
			}
			else {
				dto.setImg(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		new MemDAO().insert(dto);
		request.setAttribute("id", request.getParameter("memid"));

	}

}
