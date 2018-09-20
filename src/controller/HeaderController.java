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
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class HeaderController {
	@FXML
	private HBox nagivation;
	@FXML 
	 private MenuItem student_apply;
	
	@FXML 
	 private MenuItem teacher_reply;
	@FXML 
	 private MenuItem student_found;
	@FXML 
	 private MenuItem door;
	@FXML 
	 private MenuItem teacher_found;
	@FXML 
	 private MenuItem suguan;
	
	@FXML
	protected void mouse_entered(MouseEvent event) {//1ѧ�� 2��Ա 3�޹� 4����	5�����û�

		
		if(params.Parems.getUser_grade().equals("0")) {
			nagivation.setDisable(true);
			System.out.println(params.Parems.getUser_grade());
		}
		if(params.Parems.getUser_grade().equals("1")) {
			nagivation.setDisable(false);
			student_apply.setVisible(true);
			student_found.setVisible(true);
			
		}
		if(params.Parems.getUser_grade().equals("2")) {
			nagivation.setDisable(false);
			teacher_reply.setVisible(true);
			teacher_found.setVisible(true);
			door.setVisible(true);
		}
		if(params.Parems.getUser_grade().equals("3")) {
			nagivation.setDisable(false);
			suguan.setVisible(true);
		}
		if(params.Parems.getUser_grade().equals("4")) {
			nagivation.setDisable(false);
			student_apply.setVisible(true);
			student_found.setVisible(true);
			teacher_reply.setVisible(true);
			teacher_found.setVisible(true);
			door.setVisible(true);
			suguan.setVisible(true);
			door.setVisible(true);
		}

	}
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
			params.Parems.setUser_grade("0");
		}
		student_apply.setVisible(false);
		student_found.setVisible(false);
		teacher_found.setVisible(false);
		teacher_reply.setVisible(false);
		door.setVisible(false);
		suguan.setVisible(false);
		nagivation.setDisable(false);
	}
}
