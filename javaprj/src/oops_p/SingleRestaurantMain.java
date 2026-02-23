package oops_p;

////음식점 자리를 구현하세요
/// 음식점 자리 4인석 - 2개 , 2인석 -3개
/// 일행의 인원수 보다 작은 자리는 일행이 앉을 수 없다
/// 빈자리에만 앉을 수 있다.

class SingleRestaurant {
	int [] tables = {2, 2, 2, 4, 4};
	int [] tablelist = {0, 0, 0, 0, 0};
	private static SingleRestaurant table = null;
	
	private SingleRestaurant() {
		System.out.println("손님 입장");
	}
	
	static SingleRestaurant getInstance() {
		if (table == null) {
			table = new SingleRestaurant();
		}
		return table;
	}
}

class RestaurantCustomer {
	int person = 0;
	int seat = 0;
	int seat_num = 0;
	SingleRestaurant arr = SingleRestaurant.getInstance();

	RestaurantCustomer(int person) {
		this.person = person;
	}
	
	void seatTable() {
		for (int i=0; i<arr.tables.length; i++) {
			
			if (person <= arr.tables[i] && arr.tablelist[i] == 0) {
				seat = arr.tables[i];
				arr.tablelist[i] = 1;
				seat_num = i+1;
				System.out.println(seat+"인석 자리 착석");
				return;
			}
		}
		if (seat_num == 0) {
			System.out.println("자리 없음");
		}
	}
	
	void outTable() {
		arr.tablelist[seat_num-1] = 0;
		seat_num = 0;
		System.out.println(seat+"인석 자리 빔");
	}
	
}

public class SingleRestaurantMain {

	public static void main(String[] args) {
		RestaurantCustomer [] pp = {
			new RestaurantCustomer(1),	
			new RestaurantCustomer(2),	
			new RestaurantCustomer(3),	
			new RestaurantCustomer(5),	
			new RestaurantCustomer(1),	
			new RestaurantCustomer(2),	
			new RestaurantCustomer(2),	
		};
		pp[0].seatTable();
		pp[1].seatTable();
		pp[2].seatTable();
		pp[3].seatTable();
		pp[4].seatTable();
		pp[5].seatTable();
		pp[6].seatTable();
		pp[5].outTable();
	}

}
