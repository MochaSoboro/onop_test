package anno_p.phone;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


class ConfigStud {
	
	String name;
	int kor;
	int eng;
	int mat;
	int tot, avg, rank = 1;	
	
	
	
	ConfigStud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		calc();
	}
	public int getAvg() {
		return avg;
	}
	public void calc() {
		tot = kor + eng + mat;
		avg = tot/3;
	}
	
	public void calcRank(ConfigStud studs) {
	
		if(studs.getAvg()>getAvg()) {
			rank++;
		}
		
	}
	
	@Override
	public String toString() {
		return "Stud [name=" + name + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
	
}

public class ConfigStudData {	
	
	ConfigStud [] arr = {
		new ConfigStud("AAA", 70, 70, 70),
		new ConfigStud("BBB", 82, 80, 80),
		new ConfigStud("CCC", 60, 60, 60),
		new ConfigStud("DDD", 60, 60, 70),
	};
	
	

	@Override
	public String toString() {
		for (ConfigStud stud : arr) {
			for (ConfigStud configStud : arr) {
				stud.calcRank(configStud);
			}
		}
		return "ConfigStudData [arr=" + Arrays.toString(arr) + "]";
	}
	

	
}
