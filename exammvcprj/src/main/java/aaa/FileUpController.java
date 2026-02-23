package aaa;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import aaa.mmm.FileData;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/file")
public class FileUpController {
	
//	@RequestMapping("/")
//	String form() {
//		return "";
//	}

	@PostMapping("up")
	Object upload(@RequestParam("ff") MultipartFile ff, HttpServletRequest request) {
		System.out.println("파일 업로드 진입: "+ff+", "+ff.getOriginalFilename());
		List<String> arr = new ArrayList<>();
		arr.add(request.getParameter("pname"));
		arr.add(request.getParameter("age"));
		List<FileData> res = new ArrayList<>();
		res.add(new FileData(request.getParameter("pname"), Integer.parseInt(request.getParameter("age")), ff));
		
		if(!ff.isEmpty()) {
			fileSave(ff, request);
		}
		return "업로드 완료";
	}
	
	
	void fileSave(MultipartFile mf, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/fff");
		path = "C:\\Study\\java_work\\exammvcprj\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path, mf.getOriginalFilename());
		try {
			mf.transferTo(saveFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
