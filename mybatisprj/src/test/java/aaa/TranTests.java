package aaa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;

@SpringBootTest
public class TranTests {
	@Resource	// @Resource를 사용하기 위해서는 @SpringBootTest 필요
	ExamMapper mapper;
	
	// @Transactional - 없으면 rollback하지 않는다
	
	@Test
	void tt1() {
		
		mapper.insert(new ExamDTO(1, "쪽지", "sss", 71, 78, 63, "1111"));
	}
	
	@Transactional	// 테스트 후 무조건 rollback
	@Test
	void tt2() {
		
		mapper.insert(new ExamDTO(2, "학력", "aaa", 91, 78, 63, "1111"));
	}
}
