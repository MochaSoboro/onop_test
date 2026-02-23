package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.MyProvider;
import aaa.di.StudAction;
import aaa.mmm.ContextStudData;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/stud/{service}")
public class StudContextController {
	
	ContextStudData studdata = new ContextStudData();
	
	@Resource
	MyProvider provider;
	
	@ModelAttribute("mData")
	Object mainData(@PathVariable("service") String service,
			HttpServletRequest request) {
		StudAction action = provider.getContext().getBean(service, StudAction.class);
		return action.execute(request, studdata);
	}
	
	@RequestMapping
	String view(@PathVariable("service") String service) {
		return "contextstud/"+service;
	}
}
