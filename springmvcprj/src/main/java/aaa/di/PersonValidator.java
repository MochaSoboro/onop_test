package aaa.di;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import aaa.mmm.Person;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate 진입: "+target);
		
		Person per = (Person)target;
		if (per.getPid() == null || per.getPid().equals("")) {			
			// 에러 상태 추가
			// 강제로 에러 발생	  에러필더, 	에러코드, 		에러 메시지
			errors.rejectValue("pid", "invalid.pid", "ID가 null");
		}
		
		if (per.getPw() == null || per.getPw().equals("")) {			
			// 에러 상태 추가
			// 강제로 에러 발생	  에러필더, 	에러코드, 		에러 메시지
			errors.rejectValue("pw", "invalid.pw", "PASSWORD가 null");
		}

	}

}
