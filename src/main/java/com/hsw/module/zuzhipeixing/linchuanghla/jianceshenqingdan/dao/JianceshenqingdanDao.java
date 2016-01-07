package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;

public interface JianceshenqingdanDao
		extends JpaRepository<Jianceshenqingdan, Long>, JpaSpecificationExecutor<Jianceshenqingdan>
{
	//查找指定日期前的最大ID，用来设置基础ID
	@Query("select shenqingdan from  zuzhipeixing_linchuanghla_jianceshenqingdan shenqingdan where  shenqingdan.id=(select  max(s.id) from  zuzhipeixing_linchuanghla_jianceshenqingdan s where s.tianjiariqi < :riqi )")
	Jianceshenqingdan findMaxId(@Param("riqi") Date riqi);
}
