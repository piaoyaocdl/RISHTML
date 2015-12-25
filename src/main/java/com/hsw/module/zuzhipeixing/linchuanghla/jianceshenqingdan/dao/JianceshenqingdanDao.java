package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model.Jianceshenqingdan;

public interface JianceshenqingdanDao extends JpaRepository<Jianceshenqingdan, Long>,JpaSpecificationExecutor<Jianceshenqingdan>
{

}
