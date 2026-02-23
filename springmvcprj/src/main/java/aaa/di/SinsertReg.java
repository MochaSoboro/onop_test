package aaa.di;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import aaa.mmm.ContextStud;
import aaa.mmm.ContextStudData;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class SinsertReg implements StudAction {

	@Override
	public Object execute(HttpServletRequest request, ContextStudData data) {
		System.out.println("추가 id: "+request.getParameter("pid"));
		int id = Integer.parseInt(request.getParameter("pid"));
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		ContextStud [] arr = new ContextStud[data.getStud().length+1];
		for (int i=0; i<data.getStud().length; i++) {
			arr[i] = data.getStud()[i];
		}
		arr[data.getStud().length] = new ContextStud(id, kor, eng, mat);
		data.setStud(arr);
		return data;
	}

}
