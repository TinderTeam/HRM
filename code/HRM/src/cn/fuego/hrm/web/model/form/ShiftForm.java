package cn.fuego.hrm.web.model.form;

import java.util.List;

import cn.fuego.util.datastructure.DateSegment;

/**
 * 加油站班次
* @ClassName: ShiftForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:47:20 
*
 */
public class ShiftForm
{
	private String shiftID; // 班号
	private String shiftName; // 班名
	private List<DateSegment> shiftTimeList; // 排班时间段
	private String shiftTimeString; // 排班时间段
	private float workingHours; // 工作时间
	private float avgEmploteesPerDay; // 日均每班次人数
	/**
	 * @return the shiftID
	 */
	public String getShiftID()
	{
		return shiftID;
	}
	/**
	 * @param shiftID the shiftID to set
	 */
	public void setShiftID(String shiftID)
	{
		this.shiftID = shiftID;
	}
	/**
	 * @return the shiftName
	 */
	public String getShiftName()
	{
		return shiftName;
	}
	/**
	 * @param shiftName the shiftName to set
	 */
	public void setShiftName(String shiftName)
	{
		this.shiftName = shiftName;
	}
	/**
	 * @return the shiftTimeList
	 */
	public List<DateSegment> getShiftTimeList()
	{
		return shiftTimeList;
	}
	/**
	 * @param shiftTimeList the shiftTimeList to set
	 */
	public void setShiftTimeList(List<DateSegment> shiftTimeList)
	{
		this.shiftTimeList = shiftTimeList;
	}
	/**
	 * @return the shiftTimeString
	 */
	public String getShiftTimeString()
	{
		return shiftTimeString;
	}
	/**
	 * @param shiftTimeString the shiftTimeString to set
	 */
	public void setShiftTimeString(String shiftTimeString)
	{
		this.shiftTimeString = shiftTimeString;
	}
	/**
	 * @return the workingHours
	 */
	public float getWorkingHours()
	{
		return workingHours;
	}
	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(float workingHours)
	{
		this.workingHours = workingHours;
	}
	/**
	 * @return the avgEmploteesPerDay
	 */
	public float getAvgEmploteesPerDay()
	{
		return avgEmploteesPerDay;
	}
	/**
	 * @param avgEmploteesPerDay the avgEmploteesPerDay to set
	 */
	public void setAvgEmploteesPerDay(float avgEmploteesPerDay)
	{
		this.avgEmploteesPerDay = avgEmploteesPerDay;
	}

}
