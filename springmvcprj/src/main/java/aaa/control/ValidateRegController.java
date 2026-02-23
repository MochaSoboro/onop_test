package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.RegValidator;
import aaa.mmm.RegPerson;

@Controller
@RequestMapping("/val")
public class ValidateRegController {
	
	@GetMapping("reg")
	String regform() {
		return "val/regform";
	}
	
	@PostMapping("register")
	String complete(RegPerson pp, BindingResult res) {
		System.out.println(pp.getEmail().lastIndexOf(".com"));
		new RegValidator().validate(pp, res);
		if (res.hasErrors()) {
			return "val/regform";
		}
		return "val/complete";
	}

}