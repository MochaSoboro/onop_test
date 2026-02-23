package aaa.mmm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
	String pname, pid, pw;
	int age;
	boolean marriage;
	Date birth;
	LocalDate reg_date;
	
	public Person(String pid, String pname, String pw) {
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(pid, other.pid) && Objects.equals(pw, other.pw);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid, pname, pw);
	}
	
}
