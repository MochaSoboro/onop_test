package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")	// url-mapping 과 같음
	String home() {
		System.out.println("home 진입");
		
		return "index";		// template( view 파일로 진입 : forwarding ) :: application.yml의 spring에 영향을 받음
/*
 application.yml의 설정으로 view 페이지 진입을 결합하여 주소 결정
 "/views/"+"index"+".jsp" => 이 페이지로 진입 => /views/index.jsp
 src > main > webapp/views/index.jsp 파일이 존재해야 함
  
 spring :
    mvc :
        view :
            prefix : /views/
            suffix : .jsp
 */
	}
}
