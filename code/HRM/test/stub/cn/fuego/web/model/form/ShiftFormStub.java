package stub.cn.fuego.web.model.form;

import java.util.ArrayList;
import java.util.List;

import cn.fuego.hrm.web.model.form.GasShiftInfoForm;
import cn.fuego.hrm.web.model.form.ShiftForm;
import cn.fuego.util.datastructure.DateSegment;

/**
 * 加油站班次
* @ClassName: ShiftForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:47:20 
*
 */
public class ShiftFormStub
{
	
	static String[] shiftID = new String[]{
			"A",
			"B",
			"C",
			"D",
			"E",
			"F",
			"G",
			"H",
			"I"		
	};
	public static ShiftForm getTestShiftForm()
	{
		ShiftForm  shiftForm= new ShiftForm();
		shiftForm.setAvgEmploteesPerDay(0.32f);
		shiftForm.setShiftID("A");
		shiftForm.setShiftName("早班");
		shiftForm.setShiftTimeList(new ArrayList<DateSegment>());
		shiftForm.setShiftTimeString("07:00 -13:00");
		shiftForm.setWorkingHours(8.2f);
		return shiftForm;
	}
	
	public static List<ShiftForm> getTestShiftFormList()
	{
		List<ShiftForm> list = new ArrayList<ShiftForm>(); 
		
		for(String id:shiftID){
			ShiftForm  shiftForm= new ShiftForm();
			shiftForm.setAvgEmploteesPerDay(0.32f);
			shiftForm.setShiftID(id);
			shiftForm.setShiftName("id班");
			shiftForm.setShiftTimeList(new ArrayList<DateSegment>());
			shiftForm.setShiftTimeString("07:00 -13:00");
			shiftForm.setWorkingHours(8.2f);
			list.add(shiftForm);			
		}
		return list;
	}
}
