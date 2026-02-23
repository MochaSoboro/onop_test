package pac_1;

class CapAAA {
	int abc;
	private int efg;
	private boolean hij;
	public int getEfg() {
		return efg;
	}
	public void setEfg(int efg) {
		this.efg = efg;
	}
	public boolean isHij() {
		return hij;
	}
	public void setHij(boolean hij) {
		this.hij = hij;
	}
	
//	public int getEfg() {
//		return efg;
//	}
//	
//	public void setEfg(int efg) {
//		this.efg = efg;
//	}
}

public class CapsuleMain {

	public static void main(String[] args) {
		CapAAA ca = new CapAAA();
		System.out.println(ca.abc);
//		System.out.println(ca.efg);		// private
//		System.out.println(ca.hij);		// private
		ca.setEfg(1234);
		System.out.println(ca.getEfg());
		ca.setHij(true);
		System.out.println(ca.isHij());
		
	}

}
