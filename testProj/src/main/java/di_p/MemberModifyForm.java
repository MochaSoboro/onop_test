package di_p;

import db_p.MemDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.Action;

public class MemberModifyForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Object res = new MemDAO().detail(request.getParameter("id"));
		
		request.setAttribute("mainData", res);

	}

}
