package oops_p;
/*
 * 사원 명잔 출력하기
 * 멤버는 클래스로 정의
 * 클래스 요소는 부서마다 다름
 * 총무부 - 사원명, 사원번호, 연봉
 * 웹부 - 사원명, 사원번호, 연봉, 특기
 * 영업부 - 사원명, 사원번호, 실적건수
 * 오버로딩으로 출력
 * */

class Member {
	String [] arr1;
	
	void add(String member) {
		String [] arr2 = new String[arr1.length+1];
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[arr1.length] = member;
		arr1 = arr2;
	}
	
	void ppp() {
		for (String i : arr1) {
			System.out.println(i);
		}
	}
}

class Sawon{
	String depart, name, specialty, salary, ttt;
	int sawonnumber, number;
	
	Member mm = new Member();
	
	void depart(String name, int sawonnumber, String salary) {
		// 총무부
		depart = "총무부";
		this.name = name;
		this.sawonnumber = sawonnumber;
		this.salary = salary;
		ttt = "총무부"+"\t"+name+"\t"+sawonnumber+"\t"+salary;
		mm.add(ttt);
//		System.out.println("총무부"+"\t"+name+"\t"+sawonnumber+"\t"+salary);
	}
	void depart(String name, int sawonnumber, String salary, String specialty) {
		// 웹부
		depart = "웹부";
		this.name = name;
		this.sawonnumber = sawonnumber;
		this.salary = salary;
//		System.out.println("웹부"+"\t"+name+"\t"+sawonnumber+"\t"+specialty);
	}
	void depart(String name, int sawonnumber, int number) {
		// 영업부
		depart = "영업";
		this.name = name;
		this.sawonnumber = sawonnumber;
		this.number = number;
//		System.out.println("영업부"+"\t"+name+"\t"+sawonnumber+"\t"+number);
	}
}

public class OverSawonMain {
	
	public static void main(String[] args) {
		Sawon ss = new Sawon();
		ss.depart("AAA", 123123, "30,000,000원");
	}

}
