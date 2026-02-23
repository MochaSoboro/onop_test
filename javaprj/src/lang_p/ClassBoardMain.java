package lang_p;

interface ClaBoardService {
	void execute(String id);
}

class ClaBList implements ClaBoardService {
	@Override
	public void execute(String id) {
		System.out.println("목록입니다.");
	}
}
class ClaBDetail implements ClaBoardService {
	@Override
	public void execute(String id) {
		System.out.println("상세입니다.");
	}
}
class ClaBInsert implements ClaBoardService {
	@Override
	public void execute(String id) {
		System.out.println("추가입니다.");
	}
}
class ClaBModify implements ClaBoardService {
	@Override
	public void execute(String id) {
		System.out.println("수정입니다.");
	}
}
class ClaBDelete implements ClaBoardService {
	@Override
	public void execute(String id) {
		System.out.println("삭제입니다.");
	}
}

public class ClassBoardMain {
	
	static ClaBoardService serviceGo(String service) throws Exception {
		return (ClaBoardService)Class.forName("lang_p.ClaB"+service).newInstance();
	}

	public static void main(String[] args) {
		
		try {
			
			serviceGo("List").execute("123");
			serviceGo("Detail").execute("123");
			serviceGo("Insert").execute("123");
			serviceGo("Modify").execute("123");
			serviceGo("Delete").execute("123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
