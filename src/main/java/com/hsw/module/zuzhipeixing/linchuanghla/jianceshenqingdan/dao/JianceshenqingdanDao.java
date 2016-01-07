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
	@Query("select shenqingdan from (select ss from Jianceshenqingdan ss where ss.tianjiariqi < :riqi ) shenqingdan where shenqingdan.tianjiariqi=MAX(shenqingdan.tianjiariqi)")
	Jianceshenqingdan findMaxId(@Param("riqi") Date riqi);
}
