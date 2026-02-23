package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.Student;

@Controller
@RequestMapping("/req/exam")
public class RequestExamController {
	@GetMapping("insert")	// 주소 /req/exam/insert의 get 방식으로 진입
	String form() {
		return "req/exam/form";	// views/req/exam/form.jsp 파일 실행
	}
	
	@GetMapping("examReq")
	String res(Student st, Model md) {
		st.setTot(st.getKor()+st.getEng()+st.getMat());
		st.setAvg(st.getTot()/3);
		int avg = st.getAvg();
		if (avg >= 90) {
			st.setRank(1);
		} else if (avg >= 80) {
			st.setRank(2);
		} else if (avg >= 70) {
			st.setRank(3);
		} else if (avg >= 60) {
			st.setRank(4);
		} else {
			st.setRank(5);
		}
		
		System.out.println("시험 결과: "+st);
		return "req/exam/req";
	}
}
