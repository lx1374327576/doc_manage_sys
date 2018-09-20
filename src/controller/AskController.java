package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.QuestionAndAnswer;
import service.QuestionAndAnswerService;
import params.Parems;

public class AskController{
	
	@FXML
	private Pane ask_stage;
	@FXML
	private TextField publish_people;
	@FXML
	private TextField question;
	@FXML
	private TextArea detail_text;
	
	
	@FXML
	protected void back_action(ActionEvent event) {
		//Ò³ÃæÌø×ª
	}
	
	@FXML
	protected void publish_action(ActionEvent event) {
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		model.setIn_question(question.getText());
		model.setIn_info(detail_text.getText());
		model.setOut_person(publish_people.getText());
		new QuestionAndAnswerService().submit_question(model);
		detail_text.clear();
	}

	

	
	




}