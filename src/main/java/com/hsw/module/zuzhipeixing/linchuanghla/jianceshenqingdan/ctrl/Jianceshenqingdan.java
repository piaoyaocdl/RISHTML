package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zuzhipeixing/linchuanghla")
public class Jianceshenqingdan
{
	/**
	 * 到检测申请单主页面
	 */
	@RequestMapping("/jianceshenqingdan")
	public ModelAndView jianceshenqingdan()
	{
		ModelAndView re = new ModelAndView("zuzhipeixing/linchuanghla/jianceshenqingdan/jianceshenqingdan.jsp");
		return re;
	}
}
