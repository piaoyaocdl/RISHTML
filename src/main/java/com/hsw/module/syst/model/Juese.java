package com.hsw.module.syst.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Juese
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String jueseming;
	
	@ManyToMany
	private Set<Yonghu> yonghus;
	
	@ManyToMany(mappedBy="jueses")
	private Set<Quanxian> quanxians;
}
