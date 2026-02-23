package aaa.di;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import aaa.mmm.RegPerson;

public class RegValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		RegPerson per = (RegPerson)target;
		
		if (per.getPid() == null || per.getPid().equals("")) {			
			errors.rejectValue("pid", "invalid.pid", "ID를 입력하세요");
		}
		
		if (per.getPassword() == null || per.getPassword().equals("")) {			
			errors.rejectValue("password", "invalid.password", "비밀번호를 입력하세요");
		}
		
		if (per.getPname() == null || !Pattern.matches("[가-힣]{2,5}", per.getPname()) || per.getPname().equals("")) {			
			errors.rejectValue("pname", "invalid.pname", "이름을 다시 입력");
		}
		
		if (per.getAge() > 100 || per.getAge() < 0) {			
			errors.rejectValue("age", "invalid.age", "age가 null");
		}
		
		if (per.getBirth() == null || per.getBirth().equals("") || per.getBirth().length() != 8) {			
			errors.rejectValue("birth", "invalid.birth", "birth가 null");
		}
		
		if (per.getEmail() == null || per.getEmail().equals("")) {				
			errors.rejectValue("email", "invalid.email", "email가 null");
		}
		
		if (!per.getEmail().contains("@") || per.getEmail().lastIndexOf(".com") == -1) {
			errors.rejectValue("email", "invalid.email", "잘못된 형식입니다.");
		}
		
		if (per.getTel().length() != 11) {			
			errors.rejectValue("tel", "invalid.tel", "전화번호 다시 입력");
		}
		
	}

}
