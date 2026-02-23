package pac_1;

import java.util.Arrays;

import pac_2.PhonePart;

/*
 * 외부에서 패키지를 생성하고 사용
 * 
 * 외국 (대만제) 핸드폰 부품
 * - 카페라, 마이크, 배터리
 * 국내 (삼성) 핸드폰 생성
 * 만드는 회사 - 삼성
 * 핸드폰 - 갤럭시
 * 사진찍기, 전화하기, 터지기
 * */

class Ph {
	private String company = "삼성";
	private String model = "갤럭시";
	private String [] phoneFunc = {"사진찍기", "전화하기", "터지기"};
	
	String getCompany() {
		return company;
	}
	
	String getModel() {
		return model;
	}
	
	String[] getPhoneFunc() {
		return phoneFunc;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPhoneFunc(String[] phoneFunc) {
		this.phoneFunc = phoneFunc;
	}
}

public class PhoneMain {

	public static void main(String[] args) {
		Ph ph = new Ph();
		PhonePart pp = new PhonePart();
		
		System.out.println(Arrays.toString(pp.getPart()));
		System.out.println(ph.getCompany());
		System.out.println(ph.getModel());
		System.out.println(Arrays.toString(ph.getPhoneFunc()));
	}

}
