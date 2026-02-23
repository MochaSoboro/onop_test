package di_p;

class MainPower {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MainPower [name=" + name + "]";
	}
}

class Mouse {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + "]";
	}
}

class Moniter {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Moniter [name=" + name + "]";
	}
}

class Keyboard {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Keyboard [name=" + name + "]";
	}
}

class Laptop {
	MainPower mp;
	Mouse mm;
	
	
	public void setMp(MainPower mp) {
		this.mp = mp;
	}
	
	public void setMm(Mouse mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "Laptop [본체=" + mp + ", 마우스=" + mm + "]";
	}
	
	
}

public class Computer {
	MainPower mp;
	Moniter mo;
	Keyboard kk;
	Mouse mm;
	
	public void setMp(MainPower mp) {
		this.mp = mp;
	}
	
	public void setMo(Moniter mo) {
		this.mo = mo;
	}
	
	public void setKk(Keyboard kk) {
		this.kk = kk;
	}
	
	public void setMm(Mouse mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "Computer [본체=" + mp + ", 모니터=" + mo + ", 키보드=" + kk + ", 마우스=" + mm + "]";
	}
	
	
}

