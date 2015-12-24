package com.hsw.config.aop;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

	@AfterReturning(value = "qiedian()", returning = "re")
	public void AfterReturning(Object re)
	{
		System.out.println("***************************************");
		if (re instanceof ModelAndView)
		{
			ModelAndView fanhui = (ModelAndView) re;
			System.out.println("返回ModelAndView：" + fanhui.getViewName());
		}
		System.out.println("***************************************");
	}

	@Before("qiedian()")
	public void before()
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		Map<String, String[]> canshus = request.getParameterMap();
		System.out.println("***************************************");
		System.out.println("请求的URL：@RequestMapping(\"" + request.getRequestURI() + "\")");
		System.out.println("携带参数：");
		for (String key : canshus.keySet())
		{
继续
		}
		System.out.println("***************************************");
	}

}
