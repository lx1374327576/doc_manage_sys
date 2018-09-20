package controller;

import javax.imageio.ImageTypeSpecifier;

import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class HeaderController {
	
	@FXML
	public static HBox navigation;
	@FXML
	protected void person_action(ActionEvent event) {
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.5786,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}

	@FXML
	//ѧ�����밴ť����¼�
	protected void stuApply_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.105,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//��Ա������ť����¼�
	protected void teachApply_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.157,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//ѯ��
	protected void question_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.263,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//ʰ��
	protected void lost_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.4734,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//Ѱ��
	protected void found_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.526,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//��ϵ����
	protected void contact_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.9468,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//��ѯ ѧ����ѯ
	protected void student_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.6312,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//��ѯ��ʦ��ѯ
	protected void teacher_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.789,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//��ѯ �Ž����
	protected void door_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.8416,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//��ѯ �޹ܲ�ѯ
	protected void dormitory_action(ActionEvent event) {
		

		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.7364,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//ע��
	protected void logout_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			LoginController.islogged=false;
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
}
