package controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class RegisterController {
	
	
	
	@FXML
	private Pane regist;
	
	@FXML
	private Button callback;
	
	@FXML
	private Button test;
	
	TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000),test);
	
	@FXML
	protected void callbackaction(ActionEvent event) {
		translateTransition.setFromX(translateTransition.getFromX());
		translateTransition.setToX(100);
	}

}
