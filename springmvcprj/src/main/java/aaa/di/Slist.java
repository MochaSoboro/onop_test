package aaa.di;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import aaa.mmm.ContextStud;
import aaa.mmm.ContextStudData;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class Slist implements StudAction {

	@Override
	public Object execute(HttpServletRequest request, ContextStudData data) {

		ArrayList<ContextStud> res = new ArrayList<>();
		for (ContextStud st : data.sdata()) {
			res.add(st);
		}
		return res;
	}

}
