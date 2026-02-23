package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Address;
import aaa.mmm.Product;

@Controller
@RequestMapping("/mmm")
public class ModelController {
	
	@ModelAttribute	// 현재 컨트롤러에 진입시 attribute 자동생성
					// return 자료형을 attribute 이름으로 사용 (여기서는 product)
	Object asdf() {
		System.out.println("asdf() 실행");
		return new Product("두쫀쿠", 6000, 3);
	}
	
	@ModelAttribute("pp1")	// 현재 컨트롤러에 진입시 attribute 자동생성
							// attribute 이름은 pp1
	Object bfhm() {
		return new Product("말랑뮤즈", 200000, 2);
	}
	
	@ModelAttribute("ad1")	// attribute name : ad1, address
	Object rfrf(Address ad) {
		return ad;
	}
	
	@ModelAttribute("ad2")	// attribute name : ad2, ad3, ad4
	Object vffr(Model mm, @ModelAttribute("ad3") Address ad) {
		mm.addAttribute("ad4", ad);
		
		ad.setZipcode("2468");
		ad.setAddr1("동대구");
		return ad;
	}
	
	@RequestMapping("hello")
	String hello(Model mm) {
		mm.addAttribute("mData", 1234);
		return "mmm/view";
	}
	
	@RequestMapping("history")
	String history(Model mm) {
		mm.addAttribute("mData", "아기상어");
		return "mmm/view";
	}
}
