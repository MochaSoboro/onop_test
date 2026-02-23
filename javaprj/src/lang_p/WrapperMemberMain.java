package lang_p;

//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
//파일명이 부서명, 회원 이름, 입사일이 될 것
//입사년도는 숫자만 입력토록 함(8자리만 가능)
//호봉수를 계산할 것 (년도단위에서 절삭)
//성명은 2-4자만 기록 가능 

class FileCK {
	String [] filename;
	String ext, year;
	public FileCK(String name) {
		filename = name.split("[_.]");
		ext = filename[3].toLowerCase();
		year = filename[2].substring(0, 4);
		ckExt();
	}
	void ckExt() {
		if (ext.equals("jpg") || ext.equals("bmp") || ext.equals("gif")) {
			System.out.println("이미지 파일 확인");
			calcYear();
		}
		else {
			System.out.println("잘못된 형식의 파일");
		}
	}
	void calcYear() {
		System.out.println("입사일: "+Integer.parseInt(year));
		System.out.println("호봉: "+(2025-Integer.parseInt(year)));
	}
}

public class WrapperMemberMain {

	public static void main(String[] args) {
		FileCK [] fck = {
				new FileCK("영업_홍길동_20110823.png"),
				new FileCK("인사_홍길동_20150823.GIF"),
		};
		
	}

}
