package controller;

import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.util.Duration;
import model.Login;
import service.LoginService;
import pop.PopWindow;
import params.Parems;

public class LoginController {
	@FXML
	private Button sign_in;
	@FXML
	private Button sign_up;
	@FXML
	private TextField username_text;
	@FXML
	private PasswordField password_text;
	
	@FXML
	protected void sign_in_action(ActionEvent event) {
		System.out.println("a");
		Login text = new Login();
		text.setUsername(username_text.getText());
		text.setPassword(password_text.getText());
		Login islogin = new LoginService().sign_in(text);
		if (islogin.getIsSuccess().equals("1")) {
			System.out.println("1");
			Parems.setUser_grade(islogin.getAuth());
			Parems.setUsername(username_text.getText());
			KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.8942,Interpolator.EASE_OUT);
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
			timeline.play();
		}else {
			System.out.println("0");
			new PopWindow().alert_informationDialog("用户登录错误提示!","用户名或密码不正确!");
		}
	}
	
	@FXML
	protected void sign_up_action(ActionEvent event) {
		//点击
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.0526,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
		System.out.println("b");

		System.out.println("b");
	}
	
	
}
