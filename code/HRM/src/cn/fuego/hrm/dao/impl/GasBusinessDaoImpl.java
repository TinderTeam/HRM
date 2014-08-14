package cn.fuego.hrm.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import cn.fuego.hrm.dao.GasBusinessDao;
import cn.fuego.hrm.domain.po.GasBusiness;
import cn.fuego.misp.dao.hibernate.util.HibernateUtil;


/**
 * 
* @ClassName: GasBusinessDaoImpl 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-12 下午05:52:39 
*
 */
public class GasBusinessDaoImpl implements GasBusinessDao
{
	Log log = LogFactory.getLog(GasBusinessDaoImpl.class);
	

	public void create(GasBusiness gasBusiness) {
		log.debug("[DAO] Create a gasBusiness:" + gasBusiness.toString());
		try
		{
			HibernateUtil.add(gasBusiness);
		} catch (RuntimeException re)
		{
			throw re;
		} finally
		{
			HibernateUtil.closeSession();
		}
		log.debug("[DAO] Success! -Create a gasBusiness:" + gasBusiness.toString());

	}

	/* (non-Javadoc)
	 * @see cn.fuego.misp.dao.UserGroupDao#saveOrUpdate(cn.fuego.misp.domain.po.UserGroup)
	 */
	public void saveOrUpdate(GasBusiness gasBusiness) {
		log.debug("[DAO] Save a gasBusiness:" + gasBusiness.toString());			
		try
		{
				delete(gasBusiness);
				create(gasBusiness);
		} catch (RuntimeException re)
		{
			throw re;
		} finally
		{
			HibernateUtil.closeSession();
		}
		log.debug("[DAO] Success! -update a gasBusiness:" + gasBusiness.toString());
	}

	
	public void delete(GasBusiness gasBusiness) 
	{
		
		log.debug("Delete the gasBusiness:" + gasBusiness);

		Session session = null;
		Transaction tx = null;
		String hql = null;

		try
		{
			session = HibernateUtil.getSession();

			tx = session.beginTransaction();

			hql = "delete from GasBusiness where gasID=? and dateMonth = ?";
			Query query = session.createQuery(hql);
			query.setString(0, gasBusiness.getGasID());
			query.setDate(1,gasBusiness.getDateMonth());

			query.executeUpdate();

			tx.commit();
		} catch (RuntimeException re)
		{
			throw re;
		} finally
		{
			if(null != session)
			{
				session.close();
			}
		}

		log.debug("[DAO] Success!Delete the gasBusiness:" + gasBusiness);

	} 
	/* (non-Javadoc)
	 * @see cn.fuego.misp.dao.SystemMenuDao#getMenuByParentID(int)
	 */
	public List<GasBusiness> getGasBusinessPoByMonth(Date dateMonth)
	{
		
		log.debug("get the Org by gasBusiness:" + dateMonth);
		Session s = null;
		List<GasBusiness> hasBusinessPoList;
		try
		{
			s = HibernateUtil.getSession();
			Criteria c = s.createCriteria(GasBusiness.class);
			c.add(Restrictions.eq("dateMonth", dateMonth));
			hasBusinessPoList =c.list();
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

		return hasBusinessPoList;		

	}
	
	/* (non-Javadoc)
	 * @see cn.fuego.misp.dao.SystemMenuDao#getMenuByParentID(int)
	 */
	public GasBusiness getGasBusinessPoByGasIDandDateMonth(String gasID,Date dateMonth)
	{

		log.debug("get the GasBusinessPo by GasIDandDateMonth:" +  gasID+","+ dateMonth);
		Session s = null;
		GasBusiness gasBusinessPo;
		try
		{
			s = HibernateUtil.getSession();
			Criteria c = s.createCriteria(GasBusiness.class);
			c.add(Restrictions.eq("gasID", gasID));
			c.add(Restrictions.eq("dateMonth", dateMonth));
			gasBusinessPo =(GasBusiness) c.uniqueResult();
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
		return gasBusinessPo;		
	}
}
