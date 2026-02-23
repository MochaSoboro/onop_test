package aaa.control;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aaa.mmm.Person;

class MyEditorSupport extends PropertyEditorSupport {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		setValue(LocalDate.parse(text, dtf));
	}
}

@RestController
@RequestMapping("/initGo2")
public class InitController2 {

	@RequestMapping
	Person gogogo(Person per) {
		System.out.println("gogo 실행: "+per);
		return per;
	}
	
	@InitBinder
	void werwer(WebDataBinder binder) {
		System.out.println("werwer 실행: ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		binder.registerCustomEditor(LocalDate.class, "reg_date", new MyEditorSupport());
	}
}
