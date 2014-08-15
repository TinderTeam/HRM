package cn.fuego.hrm.service;

import java.util.Date;

import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.domain.po.SystemUser;
import cn.fuego.misp.web.model.user.UserModel;

public interface  ShiftService
{
	public static final String SHIFT_MODEL = "shift" ;
	public static final String SEARCH_MODEL = "search" ;
	public static final String APPROVE_MODEL = "approve" ;
	/**
	 * 排班服务账户验证
	 * @param  user
	 * SystemUser 登录用户 
	 * @return String
	 * 用户模式
	 */
	public String shiftLogin(UserModel user);

	/**
	 * 加油站获取或者创建排班信息
	 * <p>通过加油站ID 和 年月获取加油站的排班信息
	 * <p>如果数据库中没有该信息则生成一个
	 * <p>其中基本信息和班次信息等加载上月默认值
	 * @param orgID
	 * 组织机构
	 * @param dateMonth
	 * 时间月份
	 * @return
	 */
	public GasStationForm getGasStationShiftByGasStationAndDate(String orgID,Date dateMonth);

	/**
	 * 查询排班信息
	 * @param orgID
	 * @param dateMonthStrToDate
	 * @return
	 */
	public GasStationForm searchGasStationShiftByGasStationAndDate(
			String orgID, Date dateMonthStrToDate);

	/**
	 * 检查 审批账户权限
	 * @param user
	 * @param orgID
	 * @return
	 */
	public boolean checkSearchPermission(SystemUser user, String orgID);

}
