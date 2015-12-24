package com.hsw.module.syst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.syst.model.Quanxian;

public interface QuanxianDao extends JpaSpecificationExecutor<QuanxianDao>,JpaRepository<Quanxian, Long>
{

}
