package co.company.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.company.spring.controller.Greeter;

//@Configuration
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer{
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	

	@Bean //스프링 컨테이너의 객체를 생성해서 등록하는것
	public Greeter greeter() {
		Greeter g = new Greeter(); // 그리터 생성
		g.setFormat("%s, 안녕하세요"); // 포멧 설정해주고
		return g;
	}

	
	
	
}

