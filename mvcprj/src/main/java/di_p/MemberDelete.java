package di_p;

import java.io.File;

import db_p.MemDAO;
import db_p.MemDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.Action;

public class MemberDelete implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemDTO dto = new MemDTO();
		dto.setMemid(request.getParameter("id"));
		
		MemDTO delDto = new MemDAO().detail(dto.getMemid());
		
		String dst = request.getServletContext().getRealPath("up")+"\\";
		dst = "C:\\Study\\java_work\\testProj\\src\\main\\webapp\\up\\";
		
		if(delDto.getImg() != null && !delDto.equals("")) {
			new File(dst+delDto.getImg()).delete();
		}
		
		new MemDAO().delete(dto);
	}

}
