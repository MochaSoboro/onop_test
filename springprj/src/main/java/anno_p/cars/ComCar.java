package anno_p.cars;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.ToString;

@Component
class Wheel {
	String name = "KL33";
	int cnt = 4;
	@Override
	public String toString() {
		return "Wheel [name=" + name + ", cnt=" + cnt + "]";
	}
	
	
}

@Component
class Buster {
	String name = "SF-24";
	int rpm = 15000;
	@Override
	public String toString() {
		return "Buster [name=" + name + ", rpm=" + rpm + "]";
	}
}

@Component
class Soundproof {
	String name = "유리";

	@Override
	public String toString() {
		return "Soundproof [name=" + name + "]";
	}
	
}

interface Trunk {
	
}

@Component
class TruckTrunk implements Trunk {
	int size = 1000;

	@Override
	public String toString() {
		return "TruckTrunk [size=" + size + "]";
	}
	
}
@Component
class F1Trunk implements Trunk {
	int size = 200;

	@Override
	public String toString() {
		return "F1Trunk [size=" + size + "]";
	}
	
}

@Data
// @ToString
@Component
class F1 {
	String name = "페라리 SF-24";
	int price = 80000;
	@Resource
	Wheel wheel;
	@Resource
	Buster buster;
	@Resource
	Trunk f1Trunk;
}

@Component
class Limousine {
	String name = "메르세데스-벤츠 S 클래스 L";
	int price = 20000;
	@Resource
	Wheel wheel;
	@Resource
	Soundproof soundproof;
	@Override
	public String toString() {
		return "Limousine\t[name=" + name + ", price=" + price + ", wheel=" + wheel + ", soundproof=" + soundproof + "]";
	}
}

@Component
class Truck {
	String name = "타타대우 더쎈";
	int price = 15000;
	@Resource
	Wheel wheel;
	@Resource
	Trunk truckTrunk;
	@Override
	public String toString() {
		return "Truck [name=" + name + ", price=" + price + ", wheel=" + wheel + ", TruckTrunk=" + truckTrunk + "]";
	}
}

public class ComCar {
	
}
