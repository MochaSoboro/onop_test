package excep_p;

//import java.lang.ArithmeticException;

public class ExcepMain {

	public static void main(String[] args) {

		try {
			System.out.println("실행 1");
			
			int a = 10/2;	// 정상일 경우 catch로 진입 안함
							// Arithmetic 에러발생 -> 예외처리 catch 있는지 확인 
							// -> catch로 던지기 -> try 내 하위구문 실행 안함
			
			System.out.println("실행 2 : "+a);
			
			int [] arr = {11, 22, 33};
			System.out.println("실행 3 : "+arr[1]);
			
			String ttt = "oNOp";
			ttt = null;
			System.out.println("실행 3 : "+ttt+" , "+ttt.toLowerCase());
			
		}
		catch(ArithmeticException e) {
			System.out.println("수학적 예외처리 발생 : "+e.getMessage());
//			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			// 타 구간의 내부변수(지역변수) 접근 불가
//			System.out.println("배열 예외처리 발생 : "+e.getMessage()+a);
			System.out.println("배열 예외처리 발생 : "+e.getMessage());
			return;	// 메소드를 탈출할 때 사용 (탈출할 때 반환값을 가지고 나갈 수 있음)
		}
		catch (Exception e) {	// catch 다중 처리시 부모(상위)클래스가 하위클래스보다 뒤(밑)에 위치해야한다.
			System.out.println("일반적 예외처리 발생 : "+e.getMessage());
			
			try {	// 중첩 try~catch 가능
				System.out.println("catch > try 시작");
				
				int bb = 1234/0;
				
				System.out.println("catch > try 끝");
			} catch (Exception e2) {
				System.out.println("catch > catch 실행 : "+e2.getMessage());
			}
			
			
		}
		finally {	// 생략 가능, try~catch 구간 실행 후 마지막 구문 실행
			System.out.println("메인 종료");
		}
		
		
	}

}
