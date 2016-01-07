package com.hsw.module.syst.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(uniqueConstraints =
{ @UniqueConstraint(columnNames =
		{ "biaoming", "lieming" }) })
public class Jichuid
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String biaoming;
	private String lieming;
	private String gengxinpinlv;
	@Temporal(TemporalType.DATE)
	private Date gengxinriqi;
	private long jichuid;
	private String cifenlei;
}
