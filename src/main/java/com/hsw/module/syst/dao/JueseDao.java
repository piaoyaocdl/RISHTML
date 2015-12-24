package com.hsw.module.syst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.syst.model.Juese;

public interface JueseDao extends JpaRepository<Juese, Long>,JpaSpecificationExecutor<Juese>
{

}
