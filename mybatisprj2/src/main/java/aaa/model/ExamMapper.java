package aaa.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ExamMapper {
	
	@Select("SELECT * FROM exam")
	List<ExamDTO> list();
	
	@Select("SELECT * FROM exam WHERE id = #{id}")
	ExamDTO detail(ExamDTO dto);
	
	@Insert("INSERT INTO exam (hakgi, name, pid, kor, eng, mat, pw, ff, reg_date) "
			+ "VALUES (#{hakgi}, #{name}, #{pid}, #{kor}, #{eng}, #{mat}, #{pw}, #{ff}, now())")
	int insert(ExamDTO dto);
	
	@Select("SELECT MAX(id) AS id FROM exam")
	int maxId();
	
	@Delete("DELETE FROM exam WHERE id = #{id}")
	int delete(ExamDTO dto);
	
	@Update("UPDATE exam "
			+ "SET hakgi = #{hakgi}, name = #{name}, pid = #{pid}, kor = #{kor}, eng = #{eng}, mat = #{mat}, pw = #{pw} "
			+ "WHERE id = #{id}")
	int modify(ExamDTO dto);
}
