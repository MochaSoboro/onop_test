package anno_p.phone;

import org.springframework.context.annotation.Bean;

import lombok.Data;

@Data
class F1 {
	String wheel;
	String booster;
}
@Data
class Limousine {
	String wheel;
	String partition;
}
@Data
class Truck {
	String wheel;
	int trunk;
}

public class BeanCarInit {
	@Bean
	F1 f1() {
		F1 res = new F1();
		res.wheel = "한국타이어";
		res.booster = "아스라다";
		return res;
	}
	@Bean
	Limousine limousine() {
		Limousine res = new Limousine();
		res.wheel = "금호타이어";
		res.partition = "유리";
		return res;
	}
	@Bean
	Truck truck() {
		Truck res = new Truck();
		res.wheel = "금호타이어";
		res.trunk = 1000;
		return res;
	}
}
