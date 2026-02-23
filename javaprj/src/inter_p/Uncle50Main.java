package inter_p;

interface Teacher {
	String kind = "강사";
	void lecture();
	void answer();
}

interface Daddy {
	String kind = "아빠";
	void play();
	void answer();
	
}

interface Husband {
	String kind = "남편";
	void missionComplete(String job);
}

interface Uncle50 extends Teacher, Daddy, Husband {
	
}

class Uncle50Impl implements Uncle50 {
	String name;

	Uncle50Impl(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(name+" 놀아줘");
	}

	@Override
	public void lecture() {
		System.out.println(name+" 강의ㄱㄱ");
	}

	@Override
	public void answer() {
		System.out.println(name+" 대답ㄱㄱ");
	}

	@Override
	public void missionComplete(String job) {
		System.out.println(name+" "+job+" 완료");
	}
	
	
}

public class Uncle50Main {

	public static void main(String[] args) {
		Uncle50Impl u5 = new Uncle50Impl("아저씨");
		Daddy dd;
		Teacher tt;
		Husband hh;
		
		dd = u5;
		System.out.println(dd.kind);
		dd.answer();
		dd.play();
		System.out.println();
		
		tt = u5;
		System.out.println(tt.kind);
		tt.lecture();
		tt.answer();
		System.out.println();
		
		hh = u5;
		System.out.println(hh.kind);
		hh.missionComplete("장보기");
	}

}
