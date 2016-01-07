package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "zuzhipeixing_linchuanghla_jianceshenqingdan")
@Getter
@Setter
public class Jianceshenqingdan
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(unique = true)
	private String bianhao;
	private String yangbenleixing;
	private String huanzhexingming;
	private String xingbie;
	@Temporal(TemporalType.DATE)
	private Date chushengriqi;
	private String shenfenzhenghao;
	private String shenqingyiyuan;
	private String shenqingyisheng;
	private String tongxundizhi;
	private String youbian;
	private String lianxidianhua;
	private String beizhu;
	@Temporal(TemporalType.DATE)
	private Date tianjiariqi;
}
