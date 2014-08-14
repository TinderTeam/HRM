package cn.fuego.hrm.web.model.form;

/**
 * 排班综合表单
* @ClassName: GasStationForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:45:08 
*
 */
public class GasStationForm
{
	private String gasStationName; 				// 加油站名称
	private String businessDept; 				// 经管部名称
	private GasBusinessForm gasBufinessForm;	//加油站经营数据
	private GasShiftInfoForm gasShiftInfoForm;  //加油站排班信息表；
	private GasShiftStatsForm gasShiftStatsForm;//加油站班次统计表
	private ShiftForm shiftForm;				//加油站班次表
	private ShiftTblItemForm shiftTblItemForm;	//加油站排班表
	/**
	 * @return the gasStationName
	 */
	public String getGasStationName()
	{
		return gasStationName;
	}
	/**
	 * @param gasStationName the gasStationName to set
	 */
	public void setGasStationName(String gasStationName)
	{
		this.gasStationName = gasStationName;
	}
	/**
	 * @return the businessDept
	 */
	public String getBusinessDept()
	{
		return businessDept;
	}
	/**
	 * @param businessDept the businessDept to set
	 */
	public void setBusinessDept(String businessDept)
	{
		this.businessDept = businessDept;
	}
	/**
	 * @return the gasBufinessForm
	 */
	public GasBusinessForm getGasBufinessForm()
	{
		return gasBufinessForm;
	}
	/**
	 * @param gasBufinessForm the gasBufinessForm to set
	 */
	public void setGasBufinessForm(GasBusinessForm gasBufinessForm)
	{
		this.gasBufinessForm = gasBufinessForm;
	}
	/**
	 * @return the gasShiftInfoForm
	 */
	public GasShiftInfoForm getGasShiftInfoForm()
	{
		return gasShiftInfoForm;
	}
	/**
	 * @param gasShiftInfoForm the gasShiftInfoForm to set
	 */
	public void setGasShiftInfoForm(GasShiftInfoForm gasShiftInfoForm)
	{
		this.gasShiftInfoForm = gasShiftInfoForm;
	}
	/**
	 * @return the gasShiftStatsForm
	 */
	public GasShiftStatsForm getGasShiftStatsForm()
	{
		return gasShiftStatsForm;
	}
	/**
	 * @param gasShiftStatsForm the gasShiftStatsForm to set
	 */
	public void setGasShiftStatsForm(GasShiftStatsForm gasShiftStatsForm)
	{
		this.gasShiftStatsForm = gasShiftStatsForm;
	}
	/**
	 * @return the shiftForm
	 */
	public ShiftForm getShiftForm()
	{
		return shiftForm;
	}
	/**
	 * @param shiftForm the shiftForm to set
	 */
	public void setShiftForm(ShiftForm shiftForm)
	{
		this.shiftForm = shiftForm;
	}
	/**
	 * @return the shiftTblItemForm
	 */
	public ShiftTblItemForm getShiftTblItemForm()
	{
		return shiftTblItemForm;
	}
	/**
	 * @param shiftTblItemForm the shiftTblItemForm to set
	 */
	public void setShiftTblItemForm(ShiftTblItemForm shiftTblItemForm)
	{
		this.shiftTblItemForm = shiftTblItemForm;
	}
	





	
}
