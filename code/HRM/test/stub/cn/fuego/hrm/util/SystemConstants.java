package stub.cn.fuego.hrm.util;

import java.util.ArrayList;
import java.util.List;

public class SystemConstants
{
	public static List<String> getShiftTypeListStub(){
		List<String> list = new 	ArrayList<String>();
		
		list.add("三班两倒");
		list.add("五班三倒");
	
		
		return list;
		
	}
}
