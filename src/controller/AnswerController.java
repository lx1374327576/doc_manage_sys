package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AnswerController {
	
	private boolean flag = false;
	@FXML
	private Pane answer_stage;
	@FXML
	private Label questioner_text;
	@FXML
	private Label question_text;
	@FXML
	private TextArea my_answer;
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void reply_action(ActionEvent event) {
		
	}

	
}