package aaa.di;

import org.springframework.stereotype.Service;

import aaa.model.ExamDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertForm implements ExamAction {

	@Override
	public Object execute(ExamDTO dto, PageInfo pInfo, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
