package com.hsw.config;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.hsw.module.syst.dao.JichuidDao;
import com.hsw.module.syst.dao.YonghuDao;
import com.hsw.module.syst.model.Jichuid;
import com.hsw.module.syst.model.Yonghu;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao.JianceshenqingdanDao;
import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;
import com.hsw.util.Gongju;

/**
 * @author HSW 工程初始化运行
 */
@Component
public class ChuShiHua implements ApplicationListener<ApplicationReadyEvent>
{

	@Autowired
	YonghuDao yonghudao;

	@Autowired
	JichuidDao jichuiddao;
	@Autowired
	JianceshenqingdanDao jianceshenqingdandao;

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
		List<Yonghu> yonghus = new ArrayList<>();
		Yonghu yonghu = null;

		yonghus = yonghudao.findByZhanghao("ceshi");
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

		// 基础ID数据
		List<Jichuid> jichuids = new ArrayList<>();
		Jichuid jichuid = null;

		jichuids = jichuiddao.findByBiaomingAndLieming("zuzhipeixing_linchuanghla_jianceshenqingdan", "bianhao");

		if (jichuids.size() >= 1)
		{
			jichuid = jichuids.get(0);

			Calendar gengxinriqi = Calendar.getInstance();
			gengxinriqi.setTime(jichuid.getGengxinriqi());
			Calendar dangqianriqi = Calendar.getInstance();

			if (gengxinriqi.get(Calendar.YEAR) != dangqianriqi.get(Calendar.YEAR))
			{
				jichuid.setGengxinriqi(Calendar.getInstance().getTime());
				System.err.println("11111111111111111111111111111111111111");
				Calendar ls1 = Calendar.getInstance();
				ls1.set(dangqianriqi.get(Calendar.YEAR), 1, 1, 0, 0, 0);
				Jianceshenqingdan jianceshenqingdan = jianceshenqingdandao.findMaxId(ls1.getTime());

				System.err.println("11111111111111111111111111111111111111");
				if (jianceshenqingdan == null)
				{
					jichuid.setJichuid(0);
				} else
				{
					jichuid.setJichuid(jianceshenqingdan.getId());
				}
				jichuiddao.saveAndFlush(jichuid);
			}
		} else
		{
			jichuid = new Jichuid();
			jichuid.setBiaoming("zuzhipeixing_linchuanghla_jianceshenqingdan");
			jichuid.setLieming("bianhao");
			jichuid.setGengxinpinlv("year");
			jichuid.setJichuid(0);
			jichuid.setGengxinriqi(Calendar.getInstance().getTime());
			jichuiddao.saveAndFlush(jichuid);
		}

		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("数据库初始化完成！");
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("");
		System.err.println("");

	}

}
