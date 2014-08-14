package cn.fuego.hrm.dao;

import java.util.Date;
import java.util.List;

import cn.fuego.hrm.domain.po.GasBusiness;

public interface GasBusinessDao
{

		public void create(GasBusiness gasBusiness) ;

		public void delete(GasBusiness gasBusiness) ;

		public void saveOrUpdate(GasBusiness gasBusiness) ;
		
		public List<GasBusiness> getGasBusinessPoByMonth(Date dateMonth);
		
		public GasBusiness getGasBusinessPoByGasIDandDateMonth(String gasID,Date dateMonth);
	
}
