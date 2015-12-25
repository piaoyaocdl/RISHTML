package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao.JianceshenqingdanDao;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;

@Controller
@RequestMapping("/zuzhipeixing/linchuanghla")
public class JianceshenqingdanCtrl
{
	@Autowired
	JianceshenqingdanDao jianceshenqingdanDao;
	/**
	 * 到检测申请单主页面
	 */
	@RequestMapping("/jianceshenqingdan")
	public ModelAndView jianceshenqingdan()
	{
		ModelAndView re = new ModelAndView("zuzhipeixing/linchuanghla/jianceshenqingdan/jianceshenqingdan.jsp");
		return re;
	}

	/**
	 * 添加申请单
	 */
	@RequestMapping("/tianjiashenqingdan")
	public ModelAndView tianjiashenqingdan(Jianceshenqingdan jianceshenqingdan)
	{
		jianceshenqingdanDao.saveAndFlush(jianceshenqingdan);
		ModelAndView re = new ModelAndView("zuzhipeixing/linchuanghla/jianceshenqingdan/jianceshenqingdan.jsp");
		return re;
	}
}
