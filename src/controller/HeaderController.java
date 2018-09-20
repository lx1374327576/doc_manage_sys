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
	protected void mouse_entered(MouseEvent event) {//1学生 2导员 3宿管 4超管	5测试用户

		
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
	//学生申请按钮点击事件
	protected void stuApply_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.105,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//导员批复按钮点击事件
	protected void teachApply_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.157,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//询问
	protected void question_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.263,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//拾物
	protected void lost_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.4734,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML
	//寻物
	protected void found_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.526,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//联系我们
	protected void contact_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.9468,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//查询 学生查询
	protected void student_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.6312,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//查询老师查询
	protected void teacher_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.789,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//查询 门禁情况
	protected void door_action(ActionEvent event) {
		
		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.8416,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//查询 宿管查询
	protected void dormitory_action(ActionEvent event) {
		

		if(LoginController.islogged) {
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.7364,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}
	}
	@FXML//注销
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
