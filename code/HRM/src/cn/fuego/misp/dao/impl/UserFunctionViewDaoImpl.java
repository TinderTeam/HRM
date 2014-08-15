package cn.fuego.misp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import cn.fuego.misp.dao.UserFunctionViewDao;
import cn.fuego.misp.dao.hibernate.util.HibernateUtil;
import cn.fuego.misp.domain.view.UserFunctionView;

public class UserFunctionViewDaoImpl implements UserFunctionViewDao
{

	@Override
	public List<UserFunctionView> getFunctionByUserID(String userID)
	{
	
		Session s = null;
		List<UserFunctionView> list;
		try
		{
			s = HibernateUtil.getSession();
			Criteria c = s.createCriteria(UserFunctionView.class);
			c.add(Restrictions.eq("userID", userID));
			list =c.list();
		} catch (RuntimeException re)
		{
			throw re;
		} finally
		{
			// HibernateUtil.closeSession();
			if (s != null)
			{
				s.close();
			}
		}
		return list;
	}
	

}
