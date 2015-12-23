package com.hsw.config.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Component
@Aspect
public class Kafabangzhu
{
	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private void qiedian()
	{
	}

	@AfterReturning(value="qiedian()",returning="re")
	public void AfterReturning(Object re)
	{
		System.out.println("***************************************");
		if (re instanceof ModelAndView)
		{
			ModelAndView fanhui = (ModelAndView)re;
			System.out.println("返回ModelAndView："+fanhui.getViewName());
		}
		System.out.println("***************************************");

	}

	@Before("qiedian()")
	public void before()
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		System.out.println("***************************************");
		System.out.println("请求的URL：" + request.getRequestURI());
		System.out.println("***************************************");
	}

}
