package com.ezen.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		// 스프링 컨테이너 객체 생성            
		AbstractApplicationContext factory = 
				// 어떤 파일을 읽어서 스프링 컨테이너를 구동할지
				new GenericXmlApplicationContext("root-context.xml");
		
		// 2. DL과 DI
		// DL(Dependency Lookup): sTv라는 id를 가진 bean객체를 찾음
		// DI(Dependency Injection): DL에서 찾은 bean객체를 tv 의존성에 주입
		TV tv = (TV)factory.getBean("sTv"); // "sTv" 아이디만 바꿔주면 됨
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
		// 3. 스프링 컨테이너 종료
		factory.close();
		
	}

}
