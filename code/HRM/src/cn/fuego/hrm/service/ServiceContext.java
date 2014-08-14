package cn.fuego.hrm.service;

import cn.fuego.hrm.service.impl.ShiftServiceImpl;

public class ServiceContext
{
	private static ServiceContext instance;
	private ShiftService shiftService=null;
  
	private ServiceContext()
	{
		
	}
	public static synchronized ServiceContext getInstance()
	{
		if (null == instance)
		{
			instance = new ServiceContext();
		}
		return instance;
	}
	public synchronized  ShiftService getShiftService() {
		if (null == shiftService)
		{
			shiftService = new ShiftServiceImpl();
		}
		return shiftService;
	}

}
