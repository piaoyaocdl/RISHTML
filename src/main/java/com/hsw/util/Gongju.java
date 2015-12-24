package com.hsw.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Gongju
{
	/**
	 * Spring MVC 的重定向
	 */
	public static final String 重定向 = "redirect:";

	/**
	 * 密码加密函数
	 * 
	 * @param yuanmima
	 *            原密码
	 * @return 加密后密码
	 */
	public static String jiami_mima(String yuanmima)
	{
		return new Md5Hash(yuanmima, "!@#$&^").toString();
	}

}
