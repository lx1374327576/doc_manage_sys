package controller;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import params.LoginRegisterParems;

public class LoginController {
	@FXML
	private Label sign_in;
	@FXML
	private Label sign_up;
	@FXML
	private Label username_hint;
	@FXML
	private Label password_hint;
	@FXML
	private TextField username_text;
	@FXML
	private PasswordField password_text;
	
	@FXML
	protected void sign_in_action(MouseEvent event) {
		System.out.println(username_text.getText());
		System.out.println(password_text.getText());
		if(username_text.getText() == null || username_text.getText().isEmpty()) {
			username_hint.setText("用户名不能为空!^|^");
			username_hint.setTextFill(Color.rgb(210, 39, 30));
		}
		else {
			username_hint.setText("");
			if(password_text.getText() == null || password_text.getText().isEmpty()) {
				password_hint.setText("密码不能为空!^|^");
				password_hint.setTextFill(Color.rgb(210, 39, 30));
			}else if(password_text.getText().equals("123")) {
				password_hint.setText("密码输入正确 ^-^");
				password_hint.setTextFill(Color.rgb(21, 117, 84));
				LoginRegisterParems.setUser_login(true);
			}else {
				password_hint.setText("密码输入错误!^|^");
				password_hint.setTextFill(Color.rgb(210, 39, 30));
			}
		}
	}
	
	@FXML
	protected void sign_up_action(MouseEvent event) {
		System.out.println("Register");
		LoginRegisterParems.setLogin_stage(false);
		LoginRegisterParems.setRegister_stage(true);
	}
	
	
}
