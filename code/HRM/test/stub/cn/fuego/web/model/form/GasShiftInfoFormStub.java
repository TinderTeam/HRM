package stub.cn.fuego.web.model.form;

import cn.fuego.hrm.web.model.form.GasShiftInfoForm;


public class GasShiftInfoFormStub
{
	public static GasShiftInfoForm getTestGasShiftInfoForm()
	{
		GasShiftInfoForm  gasShiftInfoForm= new GasShiftInfoForm();
		gasShiftInfoForm.setEmployeesLimit(15);
		gasShiftInfoForm.setOpenHours(24);
		gasShiftInfoForm.setOpenTime("00:00-00:00");
		gasShiftInfoForm.setShiftType("三班两倒");
		return gasShiftInfoForm;
	}
}
