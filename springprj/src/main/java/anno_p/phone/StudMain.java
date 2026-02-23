package anno_p.phone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno/studarray.xml");
		
		context.getBean("studs",StudData.class).ppp();
		
		context.close();

	}

}
