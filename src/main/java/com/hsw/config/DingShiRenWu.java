package com.hsw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hsw.module.syst.dao.JichuidDao;

/**
 * 定时任务
 */
@Component
public class DingShiRenWu
{
	@Autowired
	JichuidDao jichuidao;
	/**
	 * 每天凌晨0：1分,执行
	 */
	//@Scheduled(cron = "0 1 0 ? * *")
	 @Scheduled(cron="0/5 * *  * * ? ")  
	public void zhixing_0_1()
	{
		System.out.println("每5秒执行一次  ");

	}
}