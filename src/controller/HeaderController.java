package controller;

import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Duration;

public class HeaderController {
	@FXML
	//ѧ�����밴ť����¼�
	protected void stuApply_action(ActionEvent event) {
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.334,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	@FXML
	//��Ա������ť����¼�
	protected void teachApply_action(ActionEvent event) {
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 1,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
}
