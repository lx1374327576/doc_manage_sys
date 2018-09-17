package test;

import model.Login;
import service.LoginService;

public class LoginTest {
	public static void main(String []args) {
		Login login=new Login();
		LoginService loginService=new LoginService();
		login.setPassword("123456");
		login.setUsername("admin");
		System.out.println(loginService.sign_in(login));
	}
}
