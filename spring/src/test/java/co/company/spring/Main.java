package co.company.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.company.spring.config.MvcConfiguration;
import co.company.spring.controller.Greeter;
public class Main {
/*	//원래라면 기존에 쓰던 방식
	public static void main(String[] args) {
		// new를 할필요 없고 컨테이너에서 가져와서 쓸수있다	Greeter g = new Greeter(); //객체생성 해서 사용하였다.
		//g.setFormat("%s, 안녕하세요");
		String msg = g.greet("스프링");
		System.out.println(msg);
		
	}*/
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(MvcConfiguration.class);
		Greeter g = ctx.getBean(Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
	}
}