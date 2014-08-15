package stub.cn.fuego.web.model.form;

import cn.fuego.hrm.web.model.form.GasStationForm;


public class GasStationFormStub
{
		public static GasStationForm getTestGasStationForm()
		{
			GasStationForm  gasStationForm= new GasStationForm();
			gasStationForm.setBusinessDept("测试经营管理部");
			gasStationForm.setGasStationName("测试加油站");		
			
			gasStationForm.setGasBusinessForm(GasBusinessFormStub.getTestGasBusinessForm());
			gasStationForm.setGasShiftInfoForm(GasShiftInfoFormStub.getTestGasShiftInfoForm());
			gasStationForm.setGasShiftStatsForm(GasShiftStatsFormStub.getTestGasShiftStatsForm());
			gasStationForm.setShiftForm(ShiftFormStub.getTestShiftForm());
			return gasStationForm;
		}
}
