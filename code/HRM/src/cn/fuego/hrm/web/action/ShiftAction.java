package cn.fuego.hrm.web.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.web.action.basic.MISPAction;

public class ShiftAction  extends MISPAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2019491290108017482L;

	/**
	 * 
	 */
	

	private Log log = LogFactory.getLog(ShiftAction.class);
	
	
	private GasStationForm gasStationForm;
	
	public String execute()
	{   
		//load page;s
		return SUCCESS;
	}

	
	/**** get and set ****/
	public void setGasStationForm(GasStationForm gasStationForm)
	{
		this.gasStationForm = gasStationForm;
	}

	public GasStationForm getGasStationForm()
	{
		return gasStationForm;
	}

	



}
