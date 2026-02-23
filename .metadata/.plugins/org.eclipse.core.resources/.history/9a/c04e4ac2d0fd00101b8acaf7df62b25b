package aaa.di;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertReg implements ExamAction {

	@Resource
	ExamMapper mapper;
	
	@Override
	public Object execute(ExamDTO dto, PageInfo pInfo, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		dto.setFf(fileSave(dto.getUpff(), request));
		mapper.insert(dto);
		return mapper.maxId();
	}
	
	String fileSave(MultipartFile mf, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/fff");
		path = "C:\\Study\\java_work\\mybatis-1\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path, mf.getOriginalFilename());
		
		String newFileName = mf.getOriginalFilename();
		
		try {
			mf.transferTo(saveFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return newFileName;
	}

}
