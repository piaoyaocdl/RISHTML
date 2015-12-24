package com.hsw.config;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.hsw.module.syst.dao.YonghuDao;
import com.hsw.module.syst.model.Juese;
import com.hsw.module.syst.model.Quanxian;
import com.hsw.module.syst.model.Yonghu;

/**
 * 
 * SHIRO Realm , 这个类涉及用户的身份验证、权限验证。
 * 
 * @author HSW
 *
 */
@Component
public class ShiroRealm extends AuthorizingRealm
{

	@Autowired
	private YonghuDao yonghudao;

	/**
	 * 获得用户权限
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals)
	{
		String username = (String) principals.fromRealm(getName()).iterator().next();

		if (username == null)
		{
			return null;
		}

		List<Yonghu> yonghu = yonghudao.findAll(new Specification<Yonghu>()
		{

			@Override
			public Predicate toPredicate(Root<Yonghu> root, CriteriaQuery<?> query, CriteriaBuilder cb)
			{
				Predicate ls = cb.equal(root.get("zhanghao").as(String.class), username);
				return query.where(ls).getRestriction();
			}
		});
		if (yonghu.size() != 1)
		{
			return null;
		}

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Yonghu weiyiyonghu = yonghu.get(0);
		for (Juese jueSe : weiyiyonghu.getJueses())
		{
			info.addRole(jueSe.getJueseming());
			for (Quanxian quanXian : jueSe.getQuanxians())
			{
				info.addStringPermission(quanXian.getQuanxianming());
			}
		}

		return info;

	}

	/**
	 * 验证用户身份
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException
	{
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		if (username == null || username.trim().equals(""))
		{
			return null;
		}
		
		List<Yonghu> account = yonghudao.findAll(new Specification<Yonghu>()
		{

			@Override
			public Predicate toPredicate(Root<Yonghu> root, CriteriaQuery<?> query, CriteriaBuilder cb)
			{
				Predicate ls = cb.equal(root.get("zhanghao").as(String.class), username);
				return query.where(ls).getRestriction();
			}
		});
		
		if (account.size() != 1)
		{
			return null;
		}
		Yonghu yonghu = account.get(0);
		return new SimpleAuthenticationInfo(yonghu.getZhanghao(), yonghu.getMima(), getName());
	}

}