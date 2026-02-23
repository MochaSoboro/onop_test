package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("company")
public class CompBoardTempController {

	@RequestMapping
	String main() {
		return "mmm/temp";
	}
	
	@RequestMapping("info")
	String info(Model mm) {
		mm.addAttribute("main", "회사소개");
		mm.addAttribute("aside", new String[] {"회사소개", "연혁", "오시는 길"});
		return "mmm/temp";
	}
	
	@RequestMapping("gallery")
	String gallery(Model mm) {
		mm.addAttribute("main", "갤러리");
		return "mmm/temp";
	}
	
	@RequestMapping("product")
	String product(Model mm) {
		mm.addAttribute("main", "제품소개");
		return "mmm/temp";
	}
	
	@RequestMapping("notice")
	String notice(Model mm) {
		mm.addAttribute("main", "공지사항");
		return "mmm/temp";
	}
}
