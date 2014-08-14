package cn.fuego.hrm.dao;

import cn.fuego.hrm.dao.impl.GasBusinessDaoImpl;
import cn.fuego.misp.dao.impl.OrgDaoImpl;
import cn.fuego.misp.dao.impl.SystemFunctionSetDaoImpl;
import cn.fuego.misp.dao.impl.SystemIDTypeDaoImpl;
import cn.fuego.misp.dao.impl.SystemMenuDaoImpl;
import cn.fuego.misp.dao.impl.SystemMetaDataDaoImpl;
import cn.fuego.misp.dao.impl.SystemUserDaoImpl;
import cn.fuego.misp.dao.impl.UserExtAttrDaoImpl;
import cn.fuego.misp.dao.impl.UserGroupDaoImpl;
import cn.fuego.misp.dao.impl.UserGroupMapFunctionDaoImpl;
import cn.fuego.misp.dao.impl.UserMapGroupDaoImpl;


/**
 * 
* @ClassName: DaoContext 
* @Description: TODO
* @author Nan Bowen
* @date 2014-3-23 下午11:27:41 
* 
 */
public class DaoContext
{
	private static DaoContext instance;
	private GasBusinessDao gasBusinessDao=null;
	

	

	private DaoContext()
	{

	}

	public static synchronized DaoContext getInstance()
	{
		if (null == instance)
		{
			instance = new DaoContext();
		}
		return instance;
	}

	
	public synchronized GasBusinessDao getGasBusinessDao() 
	{
		if (null == gasBusinessDao)
		{
			gasBusinessDao = new GasBusinessDaoImpl();
		}
		return gasBusinessDao;
	}
}
