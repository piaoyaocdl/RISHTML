package com.hsw.config;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.hsw.module.syst.dao.YonghuDao;
import com.hsw.module.syst.model.Yonghu;
import com.hsw.util.Gongju;

/**
 * @author HSW 工程初始化运行
 */
@Component
public class ChuShiHua implements ApplicationListener<ApplicationReadyEvent>
{

	@Autowired
	YonghuDao yonghudao;

	@Override
	@Transactional
	public void onApplicationEvent(ApplicationReadyEvent event)
	{
		/*********************************************************************************
		 * 
		 * 数据库初始化
		 * 
		 *********************************************************************************/

		// 用户数据
		List<Yonghu> yonghus = yonghudao.findByZhanghao("ceshi");
		Yonghu yonghu = null;
		if (yonghus.size() >= 1)
		{
			yonghu = yonghus.get(0);
		} else
		{
			yonghu = new Yonghu();
		}

		yonghu.setZhanghao("ceshi");
		yonghu.setMima(Gongju.jiami_mima("ceshi"));
		yonghudao.saveAndFlush(yonghu);

		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("数据库初始化完成！");
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("");
		System.err.println("");

	}

}
