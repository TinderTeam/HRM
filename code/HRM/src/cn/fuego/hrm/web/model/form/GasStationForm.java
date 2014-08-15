package cn.fuego.hrm.web.model.form;

import java.util.ArrayList;
import java.util.List;

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
	
	private GasBusinessForm gasBusinessForm=new GasBusinessForm();	//加油站经营数据
	private GasShiftInfoForm gasShiftInfoForm=new GasShiftInfoForm();  //加油站排班信息表
	private GasShiftStatsForm gasShiftStatsForm=new GasShiftStatsForm();//加油站班次统计表
	
	private List<ShiftForm> shiftForm=new ArrayList<ShiftForm>();				//加油站班次表
	private List<ShiftTblItemForm> shiftTblItemForm=new ArrayList<ShiftTblItemForm>();	//加油站排班表
	
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
	public GasBusinessForm getGasBusinessForm()
	{
		return gasBusinessForm;
	}
	/**
	 * @param gasBufinessForm the gasBufinessForm to set
	 */
	public void setGasBusinessForm(GasBusinessForm gasBufinessForm)
	{
		this.gasBusinessForm = gasBufinessForm;
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
	public List<ShiftForm> getShiftForm()
	{
		return shiftForm;
	}
	/**
	 * @param shiftForm the shiftForm to set
	 */
	public void setShiftForm(List<ShiftForm> shiftForm)
	{
		this.shiftForm = shiftForm;
	}
	/**
	 * @return the shiftTblItemForm
	 */
	public List<ShiftTblItemForm> getShiftTblItemForm()
	{
		return shiftTblItemForm;
	}
	/**
	 * @param shiftTblItemForm the shiftTblItemForm to set
	 */
	public void setShiftTblItemForm(List<ShiftTblItemForm> shiftTblItemForm)
	{
		this.shiftTblItemForm = shiftTblItemForm;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "GasStationForm [gasStationName=" + gasStationName
				+ ", businessDept=" + businessDept + ", gasBusinessForm="
				+ gasBusinessForm + ", gasShiftInfoForm=" + gasShiftInfoForm
				+ ", gasShiftStatsForm=" + gasShiftStatsForm + ", shiftForm="
				+ shiftForm + ", shiftTblItemForm=" + shiftTblItemForm + "]";
	}

	





	
}
