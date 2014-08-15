package cn.fuego.hrm.web.action;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import stub.cn.fuego.hrm.util.SystemConstants;
import stub.cn.fuego.web.model.form.GasStationFormStub;

import com.opensymphony.xwork2.ActionContext;
import cn.fuego.hrm.service.ServiceContext;
import cn.fuego.hrm.service.ShiftService;
import cn.fuego.hrm.web.constant.ActionConstants;
=======
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

>>>>>>> origin/dev
import cn.fuego.hrm.web.model.form.GasStationForm;
import cn.fuego.misp.web.action.basic.MISPAction;

public class ShiftAction  extends MISPAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2019491290108017482L;
<<<<<<< HEAD
	private Log log = LogFactory.getLog(ShiftAction.class);	
	//Result
	private String nextPage=SUCCESS;
	//Service
	private ShiftService shiftService = ServiceContext.getInstance().getShiftService();
	private OrgManageService orgManageService = cn.fuego.misp.service.ServiceContext.getInstance().getOrgManageService();
	//Form
	private GasStationForm gasStationForm;
	private List<String> shiftTypeList;
	//Model
	private String pageModel;
	private String dateMonth;
	private String orgID;
	
=======

	/**
	 * 
	 */
>>>>>>> origin/dev
	

	private Log log = LogFactory.getLog(ShiftAction.class);
	
	
<<<<<<< HEAD
	/*
	 * 加载与显示
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute()
	{   		
	     //PageTest
	     //pageTest();    
	     try{
	    	handle();
	     }catch(Exception ex){
	    	 log.error(ex);
	    	 nextPage=ActionConstants.SYSTEM_ERR;
	     }      
	     return nextPage;
	}

	private void handle()
	{
		 ActionContext actionContext = ActionContext.getContext();
	     Map<String, Object> session = actionContext.getSession();
		 UserModel user = (UserModel)session.get(SessionAttrNameConst.LOGIN_USER);
	     
	     log.debug(user.getUserFuctionList());
	     
	     
	     //加载页面属性
	     shiftTypeList=shiftService.getShiftTypeList();
	          
	     //验证登陆者身份
		 pageModel= shiftService.shiftLogin(user,orgID);	 
		 
		 if(pageModel.equals(ShiftService.SHIFT_MODEL)){
			//加油站排班
			gasStationForm =  shiftService.createShift(dateMonth,orgID);
			nextPage= SUCCESS;
		 }else if(pageModel.equals(ShiftService.SEARCH_MODEL)||pageModel.equals(ShiftService.APPROVE_MODEL)){
			//查询排班信息 && 审批排班表
			gasStationForm = shiftService.getShiftByDateAndOrg(dateMonth,orgID);
			nextPage= SUCCESS;
		 }else{
			 //非用工管理用户身份
			 nextPage= ActionConstants.PERMISSION_LIMITED;
		 }		 
	}

	/**
	 * 前端框架测试使用
	 */
	private void pageTest()
	{
		 //init page
	     shiftTypeList = SystemConstants.getShiftTypeListStub();
		// TODO Auto-generated method stub
	     gasStationForm = GasStationFormStub.getTestGasStationForm();
	     log.debug(gasStationForm);
	     nextPage=SUCCESS;
	}

	
	
=======
	private GasStationForm gasStationForm;
	
	public String execute()
	{   
		//load page;s
		return SUCCESS;
	}

	
>>>>>>> origin/dev
	/**** get and set ****/
	public void setGasStationForm(GasStationForm gasStationForm)
	{
		this.gasStationForm = gasStationForm;
	}

	public GasStationForm getGasStationForm()
	{
		return gasStationForm;
	}

<<<<<<< HEAD

	public void setDateMonth(String dateMonth)
	{
		this.dateMonth = dateMonth;
	}


	public String getDateMonth()
	{
		return dateMonth;
	}

	/**
	 * @return the log
	 */
	public Log getLog()
	{
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(Log log)
	{
		this.log = log;
	}

	/**
	 * @return the shiftService
	 */
	public ShiftService getShiftService()
	{
		return shiftService;
	}

	/**
	 * @param shiftService the shiftService to set
	 */
	public void setShiftService(ShiftService shiftService)
	{
		this.shiftService = shiftService;
	}

	/**
	 * @return the orgManageService
	 */
	public OrgManageService getOrgManageService()
	{
		return orgManageService;
	}

	/**
	 * @param orgManageService the orgManageService to set
	 */
	public void setOrgManageService(OrgManageService orgManageService)
	{
		this.orgManageService = orgManageService;
	}

	/**
	 * @return the shiftTypeList
	 */
	public List<String> getShiftTypeList()
	{
		return shiftTypeList;
	}

	/**
	 * @param shiftTypeList the shiftTypeList to set
	 */
	public void setShiftTypeList(List<String> shiftTypeList)
	{
		this.shiftTypeList = shiftTypeList;
	}

	/**
	 * @return the pageModel
	 */
	public String getPageModel()
	{
		return pageModel;
	}

	/**
	 * @param pageModel the pageModel to set
	 */
	public void setPageModel(String pageModel)
	{
		this.pageModel = pageModel;
	}

	/**
	 * @return the orgID
	 */
	public String getOrgID()
	{
		return orgID;
	}

	/**
	 * @param orgID the orgID to set
	 */
	public void setOrgID(String orgID)
	{
		this.orgID = orgID;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

=======
>>>>>>> origin/dev
	



}
