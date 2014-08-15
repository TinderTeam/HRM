package stub.cn.fuego.web.model.form;

import cn.fuego.hrm.web.model.form.GasShiftStatsForm;

public class GasShiftStatsFormStub
{
	public static GasShiftStatsForm getTestGasShiftStatsForm()
	{
		GasShiftStatsForm  gasShiftStatsForm= new GasShiftStatsForm();
		gasShiftStatsForm.setAvgRestDaysPerMonth(3.25f);
		gasShiftStatsForm.setAvgRestEmployeesPerDay(2.13f);
		gasShiftStatsForm.setEmployeesNum(10);
		return gasShiftStatsForm;
	}
}
