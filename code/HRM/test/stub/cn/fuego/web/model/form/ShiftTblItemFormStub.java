package stub.cn.fuego.web.model.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.fuego.hrm.web.model.form.ShiftTblItemForm;


public class ShiftTblItemFormStub
{
	
	public static List<ShiftTblItemForm> getTestShiftTblItemList()
	{
			List<ShiftTblItemForm> list = new ArrayList<ShiftTblItemForm>(); 
		String[] array = new String[]{
				"A","B",
				"A","B",
				"A","B",
				"A","B",
				"A","B",
				"A","B",
				"A","B"
				
		};
			for(int i=0;i<10;i++){
				ShiftTblItemForm  shiftTblItemForm= new ShiftTblItemForm();
				shiftTblItemForm.setName("测试员工"+i);
				shiftTblItemForm.setHoldyWorkingHours(3);
				shiftTblItemForm.setOverWorkingHours(2);
				shiftTblItemForm.setPost("营业员");
				shiftTblItemForm.setRestDays(3);
				shiftTblItemForm.setShiftList(Arrays.asList(array));
				shiftTblItemForm.setWorkingDays(10);
				shiftTblItemForm.setWorkingHours(5);
				list.add(shiftTblItemForm);
			}
		
		return list;
	}
}
