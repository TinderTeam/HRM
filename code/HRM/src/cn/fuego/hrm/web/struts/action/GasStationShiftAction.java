package cn.fuego.hrm.web.struts.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.fuego.hrm.web.struts.model.form.GasStationForm;
import cn.fuego.misp.web.action.basic.MISPAction;
import cn.fuego.misp.web.model.group.GroupManageModel;

public class GasStationShiftAction  extends MISPAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2805709026024727108L;

	private Log log = LogFactory.getLog(GasStationShiftAction.class);
	
	//private UserGroupManageService groupService = ServiceContext.getInstance().getUserGroupManageService();
	
	private GasStationForm gasStationForm;
	
	
	public String execute()
	{   
		//load page;
		
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
