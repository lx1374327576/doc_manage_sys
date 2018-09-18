package test;

import model.Register;
import service.RegisterService;

public class RegisterTest {
	public static void main(String []args) {
		
		RegisterService registerService=new RegisterService();
		Register register=new Register();
		register.setName("lx");
		register.setNumber("2016211876");
		register.setPassword("lx85090066");
		register.setSex("1");
		register.setUsername("lx1374327576");
		register.setUsertype("1");
		System.out.println(registerService.confim(register));
	}
}
