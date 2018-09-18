package controller;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import params.LoginRegisterParems;

public class RegisterController {
	@FXML
	private Label username_hint;
	@FXML
	private Label password_hint;
	@FXML
	private Label password_again_hint;
	@FXML
	private TextField username_text;
	@FXML
	private PasswordField password_text;
	@FXML
	private PasswordField password_again_text;
	@FXML
	private Label register_label;
	
	@FXML
	protected void register_label_action(MouseEvent event) {
		if (username_text.getText() == null || username_text.getText().isEmpty()) {
			username_hint.setText("�û�������Ϊ��!^|^");
			username_hint.setTextFill(Color.rgb(210, 39, 30));
		}else if(username_text.getText().equals("aaa")) {
			username_hint.setText("�û����Ѿ�����!^|^");
			username_hint.setTextFill(Color.rgb(210, 39, 30));
		}else if(password_text.getText() == null || password_text.getText().isEmpty()) {
			username_hint.setText("");
			password_hint.setText("���벻��Ϊ��!^|^");
			password_hint.setTextFill(Color.rgb(210, 39, 30));
		}else if(password_again_text.getText() == null || password_again_text.getText().isEmpty()) {
			password_hint.setText("");
			password_again_hint.setText("����ȷ��������Ϊ��!^|^");
			password_again_hint.setTextFill(Color.rgb(210, 39, 30));
		}else if(!(password_again_text.getText().equals(password_text.getText()))) {
			password_again_hint.setText("������������벻һ��!^|^");
			password_again_hint.setTextFill(Color.rgb(210, 39, 30));
		}else {
			password_again_hint.setText("ע��ɹ�^-^");
			System.out.println("Register");
			LoginRegisterParems.setLogin_stage(true);
			LoginRegisterParems.setRegister_stage(false);
		}
		
	}
}
