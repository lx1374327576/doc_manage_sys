package controller;


import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
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
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.263,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
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
		question.clear();
		publish_people.clear();
	}

	

	
	




}