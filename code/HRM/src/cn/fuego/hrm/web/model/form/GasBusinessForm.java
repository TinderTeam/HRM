package cn.fuego.hrm.web.model.form;

/**
 * 加油站经营参数
* @ClassName: GasBusinessForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:46:28 
*
 */
public class GasBusinessForm
{
	private float cardProportion ; // 加油站持卡比例
	private float oilSalesVolume; // 油站销量（吨/月）
	private float commoditySalesVolume; // 非油销量（元/月）
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
	 * @return the commoditySalesVolume
	 */
	public float getCommoditySalesVolume()
	{
		return commoditySalesVolume;
	}
	/**
	 * @param commoditySalesVolume the commoditySalesVolume to set
	 */
	public void setCommoditySalesVolume(float commoditySalesVolume)
	{
		this.commoditySalesVolume = commoditySalesVolume;
	}
}
