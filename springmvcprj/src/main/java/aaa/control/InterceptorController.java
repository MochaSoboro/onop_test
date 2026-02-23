package aaa.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class InterceptorController {
	
	@RequestMapping("event/abc")
	String event1() {
		return "abc event";
	}
	@RequestMapping("event/efg")
	String event2() {
		return "efg event";
	}
	@RequestMapping("event/hij")
	String event3() {
		return "hij event";
	}
	
	@RequestMapping("expire")
	String expire() {
		return "이벤트종료";
	}
}
