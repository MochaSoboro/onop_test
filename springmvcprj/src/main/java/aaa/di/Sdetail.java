package aaa.di;

import org.springframework.stereotype.Service;

import aaa.mmm.ContextStud;
import aaa.mmm.ContextStudData;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class Sdetail implements StudAction {

	@Override
	public Object execute(HttpServletRequest request, ContextStudData data) {
		ContextStud res = data.sddata(Integer.parseInt(request.getParameter("id")));
		
		return res;
	}

}
