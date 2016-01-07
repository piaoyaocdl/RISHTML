package com.hsw.module.syst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsw.module.syst.model.Jichuid;
import java.lang.String;
import java.util.List;

public interface JichuidDao extends JpaRepository<Jichuid, Long>, JpaSpecificationExecutor<Jichuid>
{
	List<Jichuid> findByBiaomingAndLieming(String biaoming, String lieming);
}
