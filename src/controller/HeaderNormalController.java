package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import params.LoginRegisterParems;

public class HeaderNormalController {
	@FXML
	private Label username;
	
	@FXML
	private Label usertype;
	
	@FXML
	private Label quit;
	
	@FXML
	protected void quit_action(MouseEvent event) {
		System.out.println("×¢Ïú");
		LoginRegisterParems.setUser_login(false);
		LoginRegisterParems.setRegister_stage(false);
		LoginRegisterParems.setLogin_stage(true);
	}
}
