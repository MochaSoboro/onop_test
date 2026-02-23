package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.PersonValidator;
import aaa.mmm.Person;

@Controller
@RequestMapping("/val")
public class ValidateController {
	
	@GetMapping
	String form() {
		return "val/form";
	}
	@PostMapping
	String complete(Person pp, BindingResult res) {
		
		new PersonValidator().validate(pp, res);	// 결과는 res가 가지고 있음
		
		if (res.hasErrors()) {	// 에러가 존재하는지 확인
			// validate(pp, res)에서 errors.rejectValue가 실행되면
			return "val/form";	// form으로 view 페이지 변경
		}
		
		return "val/complete";
	}
}
