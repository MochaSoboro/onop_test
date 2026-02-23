package aaa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {

	@RequestMapping("studInfo")
	Object studs() {
		List<Stud> res = new ArrayList<>();
		res.add(new Stud("AAA", 51, 50, 57));
		res.add(new Stud("BBB", 62, 68, 60));
		res.add(new Stud("CCC", 73, 76, 75));
		res.add(new Stud("DDD", 84, 82, 87));
		res.add(new Stud("EEE", 93, 92, 90));
		return res;
	}
}
