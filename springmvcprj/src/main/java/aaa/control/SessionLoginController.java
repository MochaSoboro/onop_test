package aaa.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
public class SessionLoginController {
	
	List<Person> pers;
	
	public SessionLoginController() {
		pers = List.of(
				new Person("aaa", "장동건" ,  "1111"),
				new Person("bbb", "장서건" ,  "2222"),
				new Person("ccc", "박보검" ,  "3333"),
				new Person("ddd", "장남건" ,  "1111"),
				new Person("eee", "북두신건" , "3333"),
				new Person("fff", "차은우" , "5555")
		);
	}
	
	@RequestMapping("logMain")
	String logmain(HttpSession session) {
		String viewPage = "session/logForm";
		if (session.getAttribute("pid") != null) {
			viewPage = "session/logIn";
		}
		return viewPage;
	}
	
	@RequestMapping("logReg")
	String logreg(Model mm, Person reqP, HttpSession session) {
		Person res = pers.stream()
				.filter(pp -> pp.equals(reqP))
				.findFirst()
				.orElse(null);
		
		String msg = "로그인 실패";
		
		if (res != null) {
			msg = "("+res.getPid()+") "+res.getPname()+"님 로그인";
			session.setAttribute("pid", res.getPid());
			session.setAttribute("pname", res.getPname());
		}
		
		mm.addAttribute("msg", msg);
		
		return "session/logReg";
	}
	

	@RequestMapping("logout")
	String delete(Model mm, HttpSession session) {
		mm.addAttribute("msg", session.getAttribute("pname")+"님 로그아웃");
		session.invalidate();
		return "session/logReg";
	}
}
