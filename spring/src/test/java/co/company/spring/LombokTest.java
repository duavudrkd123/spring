package co.company.spring;

import co.company.spring.controller.MemberVo;
import lombok.Builder;
public class LombokTest {
	public static void main(String[] args) {
		MemberVo Member = MemberVo.builder().id("id").pw("pw").name("name").build();
	}
}
