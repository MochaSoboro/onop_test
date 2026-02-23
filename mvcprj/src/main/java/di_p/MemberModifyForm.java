package di_p;

import db_p.MemDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.Action;

public class MemberModifyForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainData", new MemDAO().detail(request.getParameter("id")));
	}

}
