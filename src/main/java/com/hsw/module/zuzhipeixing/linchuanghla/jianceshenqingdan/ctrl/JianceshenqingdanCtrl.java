package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.ctrl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsw.module.syst.dao.JichuidDao;
import com.hsw.module.syst.model.Jichuid;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao.JianceshenqingdanDao;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;

@Controller
@RequestMapping("/zuzhipeixing/linchuanghla")
public class JianceshenqingdanCtrl
{
	@Autowired
	JianceshenqingdanDao jianceshenqingdanDao;
	@Autowired
	JichuidDao jichuiddao;

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
	 * 到添加申请单页面
	 */
	@RequestMapping("/daotianjiayemian")
	public ModelAndView daotianjiayemian()
	{
		ModelAndView re = new ModelAndView("zuzhipeixing/linchuanghla/jianceshenqingdan/tianjiajianceshenqingdan.jsp");
		return re;
	}

	/**
	 * 添加申请单
	 */
	@RequestMapping("/tianjiashenqingdan")
	public ModelAndView tianjiashenqingdan(Jianceshenqingdan shenqingdan)
	{
		shenqingdan.setTianjiariqi(Calendar.getInstance().getTime());
		jianceshenqingdanDao.save(shenqingdan);
		Jichuid ls = jichuiddao.findByBiaomingAndLieming("zuzhipeixing_linchuanghla_jianceshenqingdan", "bianhao")
				.get(0);
		String fuzu = (shenqingdan.getId() - ls.getId()) + "";
		String bianhao = "000000".substring(fuzu.length()) + fuzu;
		shenqingdan.setBianhao(shenqingdan.getYangbenleixing() + Calendar.getInstance().get(Calendar.YEAR) + bianhao);
		jianceshenqingdanDao.save(shenqingdan);

		ModelAndView re = new ModelAndView("zuzhipeixing/linchuanghla/jianceshenqingdan/jianceshenqingdan.jsp");
		List<Jianceshenqingdan> shenqingdans = new ArrayList<>();
		shenqingdans.add(shenqingdan);
		re.addObject("shenqingdans", shenqingdans);
		return re;
	}

}
