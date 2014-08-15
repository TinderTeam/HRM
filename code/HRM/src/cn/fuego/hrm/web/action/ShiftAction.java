package cn.fuego.hrm.web.action;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import stub.cn.fuego.web.model.form.GasStationFormStub;

import com.opensymphony.xwork2.ActionContext;
import cn.fuego.hrm.service.ServiceContext;
import cn.fuego.hrm.service.ShiftService;
import cn.fuego.hrm.web.constant.ActionConstants;
import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.domain.po.SystemUser;
import cn.fuego.misp.service.OrgManageService;
import cn.fuego.misp.web.action.basic.MISPAction;
import cn.fuego.misp.web.constant.SessionAttrNameConst;
import cn.fuego.misp.web.model.user.UserModel;
import cn.fuego.util.format.date.DateService;

public class ShiftAction  extends MISPAction
{
	private static final long serialVersionUID = 2019491290108017482L;
	private Log log = LogFactory.getLog(ShiftAction.class);	
		
	//Service
	private ShiftService shiftService = ServiceContext.getInstance().getShiftService();
	private OrgManageService orgManageService = cn.fuego.misp.service.ServiceContext.getInstance().getOrgManageService();
	//Form
	private GasStationForm gasStationForm;
	
	//Model
	private String pageModel;
	private String dateMonth;
	private String orgID;
	
	
	
	
	
	public String execute()
	{   
		 ActionContext actionContext = ActionContext.getContext();
	     Map<String, Object> session = actionContext.getSession();
	    
	    
	     
	     /*          
		//check user
	     UserModel user = (UserModel)session.get(SessionAttrNameConst.LOGIN_USER);

	     pageModel= shiftService.shiftLogin(user);
	     
	     
	     //Test
	     pageModel=ShiftService.SHIFT_MODEL;
		 if(pageModel.equals(ShiftService.SHIFT_MODEL)){
			//加油站排班
			gasStationForm =  shiftService.getGasStationShiftByGasStationAndDate(orgManageService.getOrgByUserID(user.getUserID()),DateService.dateMonthStrToDate(dateMonth));
			return SUCCESS;
		 }else if(pageModel.equals(ShiftService.SEARCH_MODEL)||pageModel.equals(ShiftService.APPROVE_MODEL)){
			//查询排班信息 && 审批排班表
				gasStationForm = shiftService.searchGasStationShiftByGasStationAndDate(orgID,DateService.dateMonthStrToDate(dateMonth));
				return SUCCESS;
		 }else{
			return ActionConstants.PERMISSION_LIMITED;
		 }
		 */
	     
	     gasStationForm = GasStationFormStub.getTestGasStationForm();
	     log.debug(gasStationForm);
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


	public void setDateMonth(String dateMonth)
	{
		this.dateMonth = dateMonth;
	}


	public String getDateMonth()
	{
		return dateMonth;
	}

	



}
