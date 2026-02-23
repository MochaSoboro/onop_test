package aaa.di;

import java.util.List;

import org.springframework.stereotype.Service;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertList implements ExamAction {

	@Resource
	ExamMapper mapper;
	
	@Override
	public Object execute(ExamDTO dto, PageInfo pInfo, HttpServletRequest request, HttpServletResponse response) {
		
		List<ExamDTO> arr =  List.of(
				new ExamDTO(1, "middle", "yyy", 83, 78, 76, "1111"),
				new ExamDTO(2, "middle", "yyy", 83, 73, 92, "1111"),
				new ExamDTO(1, "final", "aaa", 83, 62, 88, "1111")
				);
		
		int cnt = mapper.insertList(arr);
		System.out.println("ExamInsertList: "+cnt);
		return null;
	}
	
	

}
