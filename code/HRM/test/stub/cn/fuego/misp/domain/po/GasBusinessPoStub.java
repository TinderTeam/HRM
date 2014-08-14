package stub.cn.fuego.misp.domain.po;

import java.sql.Date;

import cn.fuego.hrm.domain.po.GasBusiness;


public class GasBusinessPoStub
{
	public GasBusiness getGasBusinessPo(){
		GasBusiness a =new GasBusiness();
		a.setCardProportion(0.13F);
		a.setCommoditySalesVoluem(0.23F);
		a.setOilSalesVolume(0.34F);
		a.setDateMonth(new Date(System.currentTimeMillis()));
		a.setGasID("123456");
		return a;
	
	}
}
