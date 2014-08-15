package cn.fuego.hrm.service.impl;

import java.util.List;

import cn.fuego.hrm.service.ShiftService;
import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.domain.po.SystemUser;
import cn.fuego.misp.web.model.user.UserModel;

public class ShiftServiceImpl implements ShiftService
{

	@Override
	public String shiftLogin(UserModel user, String orgID)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasStationForm getShiftByDateAndOrg(String date, String org)
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
	public List<String> getShiftTypeList()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasStationForm createShift(String dateMonth, String orgID)
	{
		// TODO Auto-generated method stub
		return null;
	}


}
