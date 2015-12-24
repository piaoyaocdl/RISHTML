package com.hsw.module.syst.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Denglu
{
	
	/**
	 * 到登录页面
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView denglu()
	{
		ModelAndView re = new ModelAndView("syst/denglu.jsp");
		return re;
	}
	
	/**
	 * 登录验证
	 * @return 
	 */
	@RequestMapping("/dengluyanzheng")
	public ModelAndView dengluyanzheng()
	{
		ModelAndView re=new ModelAndView("syst/zhuchuangti.jsp");
		return re;
	}

}
