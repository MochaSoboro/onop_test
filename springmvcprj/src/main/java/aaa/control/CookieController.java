package aaa.control;

import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/coo")
public class CookieController {
	
	@RequestMapping("make")
	String make(HttpServletResponse response) {
		response.addCookie(new Cookie("pid", "aaa"));
		response.addCookie(new Cookie("pname", "말랑말랑"));
		return "쿠키 생성";
	}
	
	@RequestMapping("view")
	Object view(
			@CookieValue(value = "pid") String pid,
			@CookieValue(value = "pname") String pname,
			// 없는 쿠키를 보려고 하면 오류 발생 -> default 값을 주어서 오류 해결
			@CookieValue(value = "nick", defaultValue = "아기상어") String nick,
			@CookieValue(value = "age", defaultValue = "0") int age
			) {
		return Map.of(
				"pid", pid,
				"pname", pname,
				"nick", nick,
				"age", age);
	}
	
	@RequestMapping("modify")
	String modify(HttpServletResponse response) {
		response.addCookie(new Cookie("pid", "bbb"));	// key가 같은 Cookie는 value 값이 수정됨
		response.addCookie(new Cookie("age", "29"));
		return "쿠키 수정";
	}
	
	@RequestMapping("delete")
	String delete(HttpServletResponse response) {
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("nick", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("age", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		return "쿠키 삭제";
	}
}
