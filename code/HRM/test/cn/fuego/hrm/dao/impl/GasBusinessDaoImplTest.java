package cn.fuego.hrm.dao.impl;

import static org.junit.Assert.fail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import stub.cn.fuego.misp.domain.po.GasBusinessPoStub;
import cn.fuego.hrm.domain.po.GasBusiness;




public class GasBusinessDaoImplTest
{
	Log log = LogFactory.getLog(GasBusinessDaoImplTest.class);
	GasBusinessDaoImpl dao = new GasBusinessDaoImpl();
	 GasBusinessPoStub stub =new  GasBusinessPoStub();
	GasBusiness gas=stub.getGasBusinessPo();
	//@Test
	public void testCreate()
	{
	
		log.info("Test create:"+gas);
		dao.create(gas);	
	}

	@Test
	public void testSaveOrUpdate()
	{	
		GasBusiness gasUpdate=stub.getGasBusinessPo();
		gasUpdate.setCommoditySalesVoluem(2014f);
		log.info("Test SaveOrUpdate:"+gasUpdate);
		dao.saveOrUpdate(gasUpdate);	
	}

	//@Test
	public void testDelete()
	{
		log.info("Test delet:"+gas);
		dao.delete(gas);
	}

	//@Test
	public void testGetGasBusinessPoByMonth()
	{
		fail("Not yet implemented");
	}

	//@Test
	public void testGetGasBusinessPoByGasIDandDateMonth()
	{
		fail("Not yet implemented");
	}

}
