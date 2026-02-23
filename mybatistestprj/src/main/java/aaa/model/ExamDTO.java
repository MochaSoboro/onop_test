package aaa.model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ExamDTO {
	Integer id, hakgi, kor, eng, mat;
	String name, pid, ff, pw;
	Date reg_date;
	MultipartFile upff;
}
