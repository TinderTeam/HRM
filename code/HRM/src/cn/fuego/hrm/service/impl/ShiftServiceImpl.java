package cn.fuego.hrm.service.impl;

import java.util.Date;

import cn.fuego.hrm.service.ShiftService;
import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.domain.po.SystemUser;
import cn.fuego.misp.web.model.user.UserModel;

public class ShiftServiceImpl implements ShiftService
{

	@Override
	public GasStationForm getGasStationShiftByGasStationAndDate(String orgID,
			Date dateMonth)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasStationForm searchGasStationShiftByGasStationAndDate(
			String orgID, Date dateMonthStrToDate)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkSearchPermission(SystemUser user, String orgID)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String shiftLogin(UserModel user)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
