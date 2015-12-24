package com.hsw.module.syst.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Yonghu
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String zhanghao;
	private String mima;

	@ManyToMany(mappedBy = "yonghus")
	private Set<Juese> jueses;
}
