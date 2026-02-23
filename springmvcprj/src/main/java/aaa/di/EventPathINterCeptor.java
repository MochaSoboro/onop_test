package aaa.di;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class EventPathINterCeptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("EventPathINterCeptor 진입");
		
		if (request.getSession().getAttribute("pid") == null || (request.getSession().getAttribute("pid") != null && !request.getSession().getAttribute("pid").equals("aaa"))) {
			response.sendRedirect("/");
			return false;
		}
		
		return true;
	}
}
