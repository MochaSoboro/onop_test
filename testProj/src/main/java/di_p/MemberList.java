package di_p;

import db_p.MemDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.Action;

public class MemberList implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Object res = new MemDAO().list();
		
		request.setAttribute("mainData", res);

	}

}
