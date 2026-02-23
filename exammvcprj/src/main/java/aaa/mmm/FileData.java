package aaa.mmm;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileData {
	String pname;
	int age;
	
	MultipartFile ff;
	
}
