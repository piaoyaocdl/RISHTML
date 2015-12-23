package com.hsw.config.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Kafabangzhu
{
	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private void qiedian()
	{
	}

	@Before("qiedian()")
	public void doAccessCheck()
	{
		System.out.println("前置通知");
	}
}
