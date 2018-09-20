package controller;


import java.util.List;

import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import model.QuestionAndAnswer;
import service.QuestionAndAnswerService;
import params.Parems;


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
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		model.setIn_question_id(Parems.getQuestion_id());
		List<QuestionAndAnswer> list = new QuestionAndAnswerService().get_second(model);
//		questioner_text.setText(list.get(0).getOut_person());
//		question_text.setText(list.get(0).getOut_question());
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		//Ò³ÃæÌø×ª
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.263,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	
	@FXML
	protected void reply_action(ActionEvent event) {
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		model.setIn_question_id(Parems.getQuestion_id());
		model.setIn_info(my_answer.getText());
		new QuestionAndAnswerService().submit_reply(model);
		
		my_answer.clear();
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.316,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}

	
}