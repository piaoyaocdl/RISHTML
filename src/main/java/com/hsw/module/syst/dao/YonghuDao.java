package com.hsw.module.syst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.syst.model.Yonghu;
import java.lang.String;
import java.util.List;

public interface YonghuDao extends JpaSpecificationExecutor<Yonghu>, JpaRepository<Yonghu, Long>
{
	List<Yonghu> findByZhanghao(String zhanghao);
}
