package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import params.LoginRegisterParems;

public class HeaderController {
	
	@FXML
	private Label login;
	
	@FXML
	private Label register;
	
	@FXML
	protected void loginAction(MouseEvent event) {
		System.out.println("LOGIN");
		LoginRegisterParems.setRegister_stage(false);
		LoginRegisterParems.setLogin_stage(true);
	}
	
	@FXML
	protected void registerAction(MouseEvent event) {
		System.out.println("REGISTER");
		LoginRegisterParems.setLogin_stage(false);
		LoginRegisterParems.setRegister_stage(true);
	}

}