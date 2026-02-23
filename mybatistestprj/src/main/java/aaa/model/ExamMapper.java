package aaa.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ExamMapper {

	@Select("select * from exam")
	List<ExamDTO> list();
	
	@Select("select * from exam where id = #{id}")
	ExamDTO detail(ExamDTO dto);
	
	@Insert("insert into exam (hakgi, name) values (#{hakgi}, #{name})")
	int insert(ExamDTO dto);
	
	@Select("select max(id) as id from exma")
	int maxId();
	
	@Delete("delete from exam where id = #{id}")
	int delete(ExamDTO dto);
	
	@Update("update exam set hakgi = #{hakgi}, name = #{name} where id = #{id}")
	int modify(ExamDTO dto);
}
