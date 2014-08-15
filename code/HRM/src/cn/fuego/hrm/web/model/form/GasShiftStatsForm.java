package cn.fuego.hrm.web.model.form;

/**
 * 加油站统计参数
* @ClassName: GasShiftStatsForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:46:56 
*
 */
public class GasShiftStatsForm
{
	private int employeesNum; // 用工人数
	private float avgRestEmployeesPerDay; // 平均每日休息员工数
	private float avgRestDaysPerMonth; // 月均休息人数
	/**
	 * @return the employeesNum
	 */
	public int getEmployeesNum()
	{
		return employeesNum;
	}
	/**
	 * @param employeesNum the employeesNum to set
	 */
	public void setEmployeesNum(int employeesNum)
	{
		this.employeesNum = employeesNum;
	}
	/**
	 * @return the avgRestEmployeesPerDay
	 */
	public float getAvgRestEmployeesPerDay()
	{
		return avgRestEmployeesPerDay;
	}
	/**
	 * @param avgRestEmployeesPerDay the avgRestEmployeesPerDay to set
	 */
	public void setAvgRestEmployeesPerDay(float avgRestEmployeesPerDay)
	{
		this.avgRestEmployeesPerDay = avgRestEmployeesPerDay;
	}
	/**
	 * @return the avgRestDaysPerMonth
	 */
	public float getAvgRestDaysPerMonth()
	{
		return avgRestDaysPerMonth;
	}
	/**
	 * @param avgRestDaysPerMonth the avgRestDaysPerMonth to set
	 */
	public void setAvgRestDaysPerMonth(float avgRestDaysPerMonth)
	{
		this.avgRestDaysPerMonth = avgRestDaysPerMonth;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "GasShiftStatsForm [employeesNum=" + employeesNum
				+ ", avgRestEmployeesPerDay=" + avgRestEmployeesPerDay
				+ ", avgRestDaysPerMonth=" + avgRestDaysPerMonth + "]";
	}

}
