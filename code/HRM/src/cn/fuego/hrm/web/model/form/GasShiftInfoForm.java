package cn.fuego.hrm.web.model.form;

/**
 * 加油站排班参数
* @ClassName: GasShiftInfoForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:46:42 
*
 */
public class GasShiftInfoForm
{
	private String openTime; // 营业时段
	private int openHours =0; // 营业时间长度
	private String shiftType; // 排班方式
	private int employeesLimit = 0; // 编制人数
	/**
	 * @return the openTime
	 */
	public String getOpenTime()
	{
		return openTime;
	}
	/**
	 * @param openTime the openTime to set
	 */
	public void setOpenTime(String openTime)
	{
		this.openTime = openTime;
	}
	/**
	 * @return the openHours
	 */
	public int getOpenHours()
	{
		return openHours;
	}
	/**
	 * @param openHours the openHours to set
	 */
	public void setOpenHours(int openHours)
	{
		this.openHours = openHours;
	}
	/**
	 * @return the shiftType
	 */
	public String getShiftType()
	{
		return shiftType;
	}
	/**
	 * @param shiftType the shiftType to set
	 */
	public void setShiftType(String shiftType)
	{
		this.shiftType = shiftType;
	}
	/**
	 * @return the employeesLimit
	 */
	public int getEmployeesLimit()
	{
		return employeesLimit;
	}
	/**
	 * @param employeesLimit the employeesLimit to set
	 */
	public void setEmployeesLimit(int employeesLimit)
	{
		this.employeesLimit = employeesLimit;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "GasShiftInfoForm [openTime=" + openTime + ", openHours="
				+ openHours + ", shiftType=" + shiftType + ", employeesLimit="
				+ employeesLimit + "]";
	}

}
