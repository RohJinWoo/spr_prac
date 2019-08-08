package com.spr.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {

	@Around("execution(* com.spr.index.controller..*.IndexController.*(..))")
	public Object logTest(ProceedingJoinPoint pjp) throws Throwable{
		long begin = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
	}
	
}
