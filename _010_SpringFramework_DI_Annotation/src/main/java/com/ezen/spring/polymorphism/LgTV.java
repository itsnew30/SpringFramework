package com.ezen.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("lTv")
public class LgTV implements TV {
	// 의존성 주입이 필요한 객체 위에 선언
		// Speaker 모양의 객체를 찾아서 의존성 주입
		// 스프링 컨테이너가 생성한 객체 중에서 Speaker모양의 객체를 찾아 의존성 주입
		// 어노테이션을 이용한 DI에서는 생성자와 세터함수를 이용하는 것이 불가능
		// @Autowired 사용시 문제점: 같은 모양의 객체가 두 개이상 존재할 때는 무조건 에러 발생
		// @Autowired
		// @Qualifier("sony")
		// @Resource = @Autowired + @Qualifier
		@Resource(name="apple")
		Speaker speaker;

	
	public LgTV() {
		System.out.println("▶▶ LG 티비 객체 생성");
	}
	@Override
	public void turnOn() {
		System.out.println("LgTV-- 전원 켜기");
	}
	@Override
	public void turnOff() {
		System.out.println("LgTV-- 전원 끄기");
	}
	@Override
	public void volumeUp() {
		// System.out.println("LgTV-- 소리 증가");
		
		// 의존성 주입
		speaker = new SonySpeaker();
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		// System.out.println("LgTV-- 소리 감소");
		// 의존성 주입
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
