package com.ezen.spring.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	// 매개변수로 JoinPoint 받아주기
	public void beforeMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] methodArgs = jp.getArgs();
		
		System.out.println("[사전 처리]" + methodName + "() 메소드 ARGS 정보: " + methodArgs[0].toString());
	}
}
