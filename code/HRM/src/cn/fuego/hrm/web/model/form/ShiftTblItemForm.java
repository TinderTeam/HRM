package cn.fuego.hrm.web.model.form;

import java.util.List;

/**
 * 排班表
 * 
* @ClassName: ShiftTblItemForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:47:33 
*
 */
public class ShiftTblItemForm
{
	private String name; // 姓名
	private String post; // 职位
	private List<String> shiftList; // 排班序列
	private int workingHours; // 累计工作时长
	private int holdyWorkingHours; // 法定假期工作时长
	private int overWorkingHours; // 超时工作时长
	private int workingDays; // 工作天数
	private int restDays; // 休息天数
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the post
	 */
	public String getPost()
	{
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post)
	{
		this.post = post;
	}
	/**
	 * @return the shiftList
	 */
	public List<String> getShiftList()
	{
		return shiftList;
	}
	/**
	 * @param shiftList the shiftList to set
	 */
	public void setShiftList(List<String> shiftList)
	{
		this.shiftList = shiftList;
	}
	/**
	 * @return the workingHours
	 */
	public int getWorkingHours()
	{
		return workingHours;
	}
	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(int workingHours)
	{
		this.workingHours = workingHours;
	}
	/**
	 * @return the holdyWorkingHours
	 */
	public int getHoldyWorkingHours()
	{
		return holdyWorkingHours;
	}
	/**
	 * @param holdyWorkingHours the holdyWorkingHours to set
	 */
	public void setHoldyWorkingHours(int holdyWorkingHours)
	{
		this.holdyWorkingHours = holdyWorkingHours;
	}
	/**
	 * @return the overWorkingHours
	 */
	public int getOverWorkingHours()
	{
		return overWorkingHours;
	}
	/**
	 * @param overWorkingHours the overWorkingHours to set
	 */
	public void setOverWorkingHours(int overWorkingHours)
	{
		this.overWorkingHours = overWorkingHours;
	}
	/**
	 * @return the workingDays
	 */
	public int getWorkingDays()
	{
		return workingDays;
	}
	/**
	 * @param workingDays the workingDays to set
	 */
	public void setWorkingDays(int workingDays)
	{
		this.workingDays = workingDays;
	}
	/**
	 * @return the restDays
	 */
	public int getRestDays()
	{
		return restDays;
	}
	/**
	 * @param restDays the restDays to set
	 */
	public void setRestDays(int restDays)
	{
		this.restDays = restDays;
	}

}
