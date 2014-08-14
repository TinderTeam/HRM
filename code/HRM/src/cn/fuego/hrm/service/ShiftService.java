package cn.fuego.hrm.service;

import cn.fuego.misp.domain.po.SystemUser;

public interface  ShiftService
{
	/**
	 * 排班服务账户验证
	 * @param  user
	 * SystemUser 登录用户 
	 * @return true/false
	 */
	public boolean shiftLogin(SystemUser user);
}
