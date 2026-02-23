package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		int i = new Integer(123);
		
		System.out.println(i);
		
		Integer i2 = 345;
		System.out.println(i2);
		
		i = i2;
		System.out.println(i);
		
//		i = null;
		i2 = null;
		
		i = 789;
		i2 = i;
		System.out.println(i2);
		
		i2 = Integer.parseInt("135");
		System.out.println(i2);
		i2 = Integer.parseInt("101");
		System.out.println(i2);
		i2 = Integer.parseInt("101", 2);  // 2진수
		System.out.println(i2);
		i2 = Integer.parseInt("13", 8);
		System.out.println(i2);
		i2 = Integer.parseInt("13", 16);
		System.out.println(i2);
		
		byte bb = Byte.parseByte("123");
		System.out.println(bb);
		short ss = Short.parseShort("123", 8);
		System.out.println(ss);
		long ll = Long.parseLong("12345678909987");
		System.out.println(ll);
		
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		double dd = Double.parseDouble("987.654");
		System.out.println(dd);
		
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
//		char ch = Character.parseCharacter("A");	없음
		char ch = "A".charAt(0);
		System.out.println(ch);
		
//		Integer.parseInt("123.456");
		Integer.parseInt("123");
		Double.parseDouble("456");
//		Double.parseDouble("456.as43");
	}

}
