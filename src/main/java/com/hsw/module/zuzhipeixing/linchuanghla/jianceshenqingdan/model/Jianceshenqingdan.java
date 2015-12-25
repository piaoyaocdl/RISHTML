package com.hsw.module.zuzhipeixing.linchuanghla.jianceshenqingdan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jianceshenqingdan
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String shenqingdanbianhao;
	private String huanzhexinging;
	private String xingbie;
	@Temporal(TemporalType.DATE)
	private Date chushengriqi;
	
	@Override
	public String toString()
	{
		return "Jianceshenqingdan [id=" + id + ", shenqingdanbianhao=" + shenqingdanbianhao + ", huanzhexinging="
				+ huanzhexinging + ", xingbie=" + xingbie + ", chushengriqi=" + chushengriqi + "]";
	}
	
	

}
