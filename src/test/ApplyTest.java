package test;

import model.Apply;
import service.ApplyService;

public class ApplyTest {
	public static void main(String []args) {
		Apply apply=new Apply();
		ApplyService applyService=new ApplyService();
		apply.setApply_type("5");
		apply.setBack_time("9.19");
		apply.setDom_number("618");
		apply.setInfo("test");
		apply.setLeave_time("9.20");
		apply.setNew_dom_number("618");
		apply.setUsername("lx1374327576");
		applyService.submit(apply);
	}
}
