package anno_p.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.Resource;

public class Camera {
	String name;
	int pixel;
	
	Camera() {
		System.out.println("Camera Constructor");
	}
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setPixel(int pixel) {
		this.pixel = pixel;
	}



	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
}

class Battery {
	String name;
	boolean remoeable;
	
	Battery() {
		System.out.println("Battery Constructor");
	}
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setRemoeable(boolean remoeable) {
		this.remoeable = remoeable;
	}



	@Override
	public String toString() {
		return "Battery [name=" + name + ", remoeable=" + remoeable + "]";
	}
}

class HandPhone {
	String name;
	int price;
	
//	@Resource	// 멤버변수 선언에 설정
				// 우선순위 존재 : byName > byType
//	@Qualifier("bbq")	// 결합하려는 bean 지정
	@Resource(name = "bbq")
	Camera fc;
	
	Camera bc;
	
	Battery bat;
	
	HandPhone() {
		System.out.println("HandPhone Constructor");
	}
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setPrice(int price) {
		this.price = price;
	}



//	public void setFc(Camera fc) {
//		this.fc = fc;
//	}



//	public void setBc(Camera bc) {
//		this.bc = bc;
//	}


	@Resource	// required 불가
	public void setBat(Battery bat) {
		this.bat = bat;
	}



	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", price=" + price + ", fc=" + fc + ", bc=" + bc + ", bat=" + bat + "]";
	}
}