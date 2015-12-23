package com.hsw.module.syst.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Denglu
{
	@RequestMapping("/")
	public ModelAndView denglu()
	{
		ModelAndView re = new ModelAndView("syst/denglu.jap");
		return re;
	}
}
