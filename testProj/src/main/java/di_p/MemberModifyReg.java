package di_p;

import db_p.MemDAO;
import db_p.MemDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.Action;

public class MemberModifyReg implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemDTO dto = new MemDTO();
		dto.setMemid(request.getParameter("memid"));
		dto.setMname(request.getParameter("mname"));
		dto.setEmail(request.getParameter("email"));
		dto.setTel(Integer.parseInt(request.getParameter("tel")));
		dto.setAddr(request.getParameter("addr"));
		dto.setBirth(request.getParameter("birth"));
		
		new MemDAO().modify(dto);
		request.setAttribute("id", request.getParameter("memid"));

	}

}
