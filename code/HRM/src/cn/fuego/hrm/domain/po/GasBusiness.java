package cn.fuego.hrm.domain.po;

import java.io.Serializable;
import java.util.Date;

public class GasBusiness implements Serializable
{
	private String gasID; //组织机构ID
	private Date dateMonth; //时间（月）
	private float cardProportion; //加油站持卡比例
	private float oilSalesVolume; //油站销量（吨/月）
	private float commoditySalesVoluem; //非油销量（元/月）
	
	/**
	 * @return the gasID
	 */
	public String getGasID()
	{
		return gasID;
	}
	
	/**
	 * @param gasID the gasID to set
	 */
	public void setGasID(String gasID)
	{
		this.gasID = gasID;
	}
	
	/**
	 * @return the dateMonth
	 */
	public Date getDateMonth()
	{
		return dateMonth;
	}
	
	/**
	 * @param dateMonth the dateMonth to set
	 */
	public void setDateMonth(Date dateMonth)
	{
		this.dateMonth = dateMonth;
	}
	
	/**
	 * @return the cardProportion
	 */
	public float getCardProportion()
	{
		return cardProportion;
	}
	
	/**
	 * @param cardProportion the cardProportion to set
	 */
	public void setCardProportion(float cardProportion)
	{
		this.cardProportion = cardProportion;
	}
	
	/**
	 * @return the oilSalesVolume
	 */
	public float getOilSalesVolume()
	{
		return oilSalesVolume;
	}
	/**
	 * @param oilSalesVolume the oilSalesVolume to set
	 */
	public void setOilSalesVolume(float oilSalesVolume)
	{
		this.oilSalesVolume = oilSalesVolume;
	}
	/**
	 * @return the commoditySalesVoluem
	 */
	public float getCommoditySalesVoluem()
	{
		return commoditySalesVoluem;
	}
	/**
	 * @param commoditySalesVoluem the commoditySalesVoluem to set
	 */
	public void setCommoditySalesVoluem(float commoditySalesVoluem)
	{
		this.commoditySalesVoluem = commoditySalesVoluem;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "GasBusinessPo [gasID=" + gasID + ", dateMonth=" + dateMonth
				+ ", cardProportion=" + cardProportion + ", oilSalesVolume="
				+ oilSalesVolume + ", commoditySalesVoluem="
				+ commoditySalesVoluem + "]";
	}



}
