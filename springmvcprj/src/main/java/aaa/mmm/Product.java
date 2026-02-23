package aaa.mmm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // parameter 입력은 setter에 의해 가능 -> lombok.Data나 setter 메소드 필요
@NoArgsConstructor
public class Product {
	String pname;
	Integer price, cnt, tot;
	
	
	
	public void setPrice(Integer price) {
		this.price = price;
		if (price == null) {
			this.price = 0;
		}
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
		if (cnt == null) {
			this.cnt = 0;
		}
	}
	public Product(String pname, Integer price, Integer cnt) {
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
		tot = price * cnt;
	}
	
	
}
