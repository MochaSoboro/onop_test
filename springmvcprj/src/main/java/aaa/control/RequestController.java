package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.mmm.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/req")		// 주소 req
public class RequestController {
	@GetMapping("getGo")	// 주소 /req/getGo의 get 방식으로 진입
	String form() {
		return "req/form";	// views/req/form.jsp 파일 실행
	}
	
	@GetMapping("mem")
	String mem1(HttpServletRequest req,
			@RequestParam(name = "pname", defaultValue = "성준수") String pn,
			@RequestParam(name="age", defaultValue="20") int aaa,	// 값이 없을 경우 기본값 설정 defaultValue="20"
			@RequestParam("marriage") boolean mmm,
			Model md	// requestAttrivute 설정할 수 있는 객체
			) {
		System.out.println("mem1: "+req.getParameter("pname")+", "+req.getParameter("age")+", "+req.getParameter("marriage"));
		System.out.println("mem1 @RequestParam: "+pn+", "+aaa+", "+mmm);
		
		md.addAttribute("pn", pn);	// request.setAttribute("pn", pn)과 같은 작업
		md.addAttribute("aaa", aaa);
		return "req/mem1";
	}
	@PostMapping("mem")
	String mem2(HttpServletRequest req,
			@RequestParam(name = "pname", defaultValue = "차은우") String pn,
			@RequestParam(name = "age", defaultValue = "27") int aaa,	// 값이 없을 경우 기본값 설정 defaultValue="20"
			@RequestParam(name = "marriage", defaultValue = "false") boolean mmm) {
		System.out.println("mem2: "+req.getParameter("pname")+", "+req.getParameter("age")+", "+req.getParameter("marriage"));
		System.out.println("mem2 @RequestParam: "+pn+", "+aaa+", "+mmm);
		return "req/mem1";
	}
	
	@RequestMapping(value="mem3", method=RequestMethod.GET)
	String mem31(@ModelAttribute("pname") String pn,		// parameter의 pname을 attribute로 인지
			@ModelAttribute(name = "age") int aaa			// 초기값을 줄 수 없다
//			@ModelAttribute("mmm") boolean mmm				parameter 이름을 맞춰줄 수 없다
			) {
		System.out.println("mem31 GET: "+pn+", "+aaa);
		return "req/mem3";
	}
	
	@RequestMapping(value="mem3", method=RequestMethod.POST)
	String mem32(
//			String pname	어노테이션 없이 기본 자료 형태 대입 불가
			Person pr	// 멤버 setter에 맞게 param 대입, attribute 이름은 클래스명
			) {
		System.out.println("mem32 POST: "+pr);
		return "req/mem4";
	}
	
	@RequestMapping(value="mem4", method=RequestMethod.POST)
	String mem4(@ModelAttribute("pr") Person pr	// 멤버 setter에 맞게 param 대입, attribute 설정
											// attribute 이름을 설정하지 않을 경우 클래스명
			) {
		System.out.println("mem4 POST: "+pr);
		return "req/mem4";
	}
}
