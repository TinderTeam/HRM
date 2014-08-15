package stub.cn.fuego.web.model.form;

import cn.fuego.hrm.web.model.form.GasBusinessForm;

/**
 * 加油站经营参数
* @ClassName: GasBusinessForm 
* @Description: TODO
* @author Nan Bowen
* @date 2014-8-13 下午05:46:28 
*
 */
public class GasBusinessFormStub
{
	public static GasBusinessForm getTestGasBusinessForm()
	{
		GasBusinessForm  gasBusinessForm= new GasBusinessForm();
		gasBusinessForm.setCardProportion(0.50f);
		gasBusinessForm.setCommoditySalesVolume(30.23f);
		gasBusinessForm.setOilSalesVolume(30.12f);
		return gasBusinessForm;
	}
}
