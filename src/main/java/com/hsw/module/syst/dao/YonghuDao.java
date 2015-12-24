package com.hsw.module.syst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.syst.model.Yonghu;

public interface YonghuDao extends JpaSpecificationExecutor<Yonghu>,JpaRepository<Yonghu, Long>
{

}
