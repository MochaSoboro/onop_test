package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/coo")
public class CookieLoginController {

	@RequestMapping("login")
	String login(
			@CookieValue(value = "pname", defaultValue = "") String pname,
			HttpServletResponse response,
			HttpServletRequest request) {
		
		String res = null;
		if (pname.equals("") || pname.equals("로그인 실패")) {
			res = "cookie/login";
		}
		else {
			res = "cookie/loginres";
		}
		return res;
	}
	
	@PostMapping("view")
	String view(
			HttpServletResponse response,
			HttpServletRequest request,
			@RequestParam("pid") String pid,
			@RequestParam("pw") String pw
			) {
		String pname = null;
		boolean login = false;
		String res = null;
		if (pid.equals("aaa") && pw.equals("1111")) {
			pname = "장동건";
			login = true;
		}
		else if (pid.equals("bbb") && pw.equals("2222")) {
			pname = "장서건";
			login = true;
		}
		else if (pid.equals("ccc") && pw.equals("3333")) {
			pname = "차은우";
			login = true;
		}
		else if (pid.equals("ddd") && pw.equals("1111")) {
			pname = "장남건";
			login = true;
		}
		else if (pid.equals("eee") && pw.equals("3333")) {
			pname = "북두신건";
			login = true;
		}
		if (!login) {
			System.out.println(pid+", "+pw);
			request.setAttribute("pname", "로그인 실패");
			return "cookie/login";
		}
		response.addCookie(new Cookie("pname", pname));
		request.setAttribute("pid", pid);
		request.setAttribute("pname", pname);
		response.addCookie(new Cookie("pid", pid));
		response.addCookie(new Cookie("pw", pw));
		
		return "cookie/loginres";
	}
	
	@RequestMapping("logout")
	String logout(
			@CookieValue(value = "pname", defaultValue = "") String pname,
			HttpServletResponse response,
			HttpServletRequest request) {
		request.setAttribute("pname", pname);
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pw", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		return "cookie/logout";
	}
	

}
