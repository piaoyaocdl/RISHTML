package com.hsw.config;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hsw.module.syst.dao.JichuidDao;
import com.hsw.module.syst.model.Jichuid;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao.JianceshenqingdanDao;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;

/**
 * 定时任务
 */
@Component
public class DingShiRenWu
{

	@Autowired
	JichuidDao jichuiddao;
	@Autowired
	JianceshenqingdanDao jianceshenqingdandao;

	/**
	 * 每天凌晨0：1分,执行
	 */
	@Scheduled(cron = "0 1 0 ? * *")
	public void zhixing_0_1()
	{
		//更新 zuzhipeixing_linchuanghla_jianceshenqingdan 的 bianhao 的基础ID
		Jichuid jichuid = jichuiddao.findByBiaomingAndLieming("zuzhipeixing_linchuanghla_jianceshenqingdan", "bianhao")
				.get(0);

		Calendar gengxinriqi = Calendar.getInstance();
		gengxinriqi.setTime(jichuid.getGengxinriqi());
		Calendar dangqianriqi = Calendar.getInstance();

		if (gengxinriqi.get(Calendar.YEAR) != dangqianriqi.get(Calendar.YEAR))
		{
			jichuid.setGengxinriqi(Calendar.getInstance().getTime());
			Calendar ls1 = Calendar.getInstance();
			ls1.set(dangqianriqi.get(Calendar.YEAR), 0, 1, 0, 0, 0);
			Jianceshenqingdan jianceshenqingdan = jianceshenqingdandao.findMaxId(ls1.getTime());
			if (jianceshenqingdan == null)
			{
				jichuid.setJichuid(0);
			} else
			{
				jichuid.setJichuid(jianceshenqingdan.getId());
			}
			jichuiddao.saveAndFlush(jichuid);
		}
	}
}