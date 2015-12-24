package com.hsw.module.syst.ctrl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hsw.util.Gongju;

@Controller
public class Denglu
{

	/**
	 * 到登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView denglu()
	{
		ModelAndView re = new ModelAndView("syst/denglu.jsp");
		return re;
	}	
	
	/**
	 * 到主窗体
	 * @return
	 */
	@RequestMapping("/daozhuchuangti")
	public ModelAndView daozhuchuangti()
	{
		ModelAndView re = new ModelAndView("syst/zhuchuangti.jsp");
		return re;
	}

	/**
	 * 登录验证
	 * 
	 * @return
	 */
	@RequestMapping("/dengluyanzheng")
	public ModelAndView denglu(String zhanghao, String mima, String jizhuwo)
	{
		UsernamePasswordToken token = new UsernamePasswordToken(zhanghao, Gongju.jiami_mima(mima));
		Subject currentUser = SecurityUtils.getSubject();
		ModelAndView re = new ModelAndView();
		try
		{
			// 登陆
			currentUser.login(token);
			currentUser.getSession().setAttribute("yonghuming", zhanghao);
			if ("on".equals(jizhuwo))
			{
				token.setRememberMe(true);
			}
			re.setViewName(Gongju.重定向+ "/daozhuchuangti");
		} catch (Exception uae)
		{
			re.setViewName("syst/denglu.jsp");
			re.addObject("cuowuxinxi", "帐号或者密码错误！");
		}
		return re;
	}
	
	/**
	 * 登出
	 * @return
	 */
	@RequestMapping("/dengchu")
	public ModelAndView dengchu()
	{
		SecurityUtils.getSubject().logout();
		ModelAndView re=new ModelAndView("syst/denglu.jsp");
		return  re;
	}

}
