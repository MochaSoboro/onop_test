package oops_p;

class SelfSum {
	
	int sum = 0;
	
	int multiple(int number) {
		if (number % 3 == 0) {
			sum += number;
		}
		if (number < 1) {
			return sum;
		}
		return multiple(number-1);
	}
}

public class SelfCallSumMain {

	public static void main(String[] args) {
		int rr = new SelfSum().multiple(17);
		System.out.println(rr);
	}

}
