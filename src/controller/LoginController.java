package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import model.Login;
import service.LoginService;

public class LoginController {
	@FXML
	private Button sign_in;
	@FXML
	private Button sign_up;
	@FXML
	private TextField username_text;
	@FXML
	private PasswordField password_text;
	
	@FXML
	protected void sign_in_action(ActionEvent event) {
		System.out.println("a");
		Login text = new Login();
		text.setUsername(username_text.getText());
		text.setPassword(password_text.getText());
		int islogin = new LoginService().sign_in(text);
		if (islogin == 1) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
	}
	
	@FXML
	protected void sign_up_action(ActionEvent event) {
		System.out.println("b");
	}
	
	
}
