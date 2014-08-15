package cn.fuego.hrm.service.impl;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/dev
import cn.fuego.hrm.service.ShiftService;
import cn.fuego.misp.domain.po.SystemUser;

public class ShiftServiceImpl implements ShiftService
{

	@Override
<<<<<<< HEAD
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
=======
	public boolean shiftLogin(SystemUser user)
>>>>>>> origin/dev
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public GasStationForm createShift(String dateMonth, String orgID)
	{
		// TODO Auto-generated method stub
		return null;
	}


}
