package controller;



import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.util.Duration;
import model.Register;
import service.RegisterService;

public class RegisterController {
	@FXML
	private TextField name;
	@FXML
	private TextField number;
	@FXML
	private TextField username_text;
	@FXML
	private PasswordField password;
	@FXML
	private PasswordField password_repeat;
	@FXML
	private TextField male;
	@FXML
	private TextField type;
	
	@FXML
	protected void  comeback_action(ActionEvent event){
		//点击“返回”跳转初始页面
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	
	@FXML
	protected void  sure_action(ActionEvent event){
		String sex = null;
		String usertype = null;
		//点击“确定”跳转初始页面
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
		if(!(password.getText().equals(password_repeat.getText()))) {
			System.out.println("lose");
			return;
		}
		if(male.getText().equals("男")) {
			sex = "1";
		}else if(male.getText().equals("女")) {
			sex = "2";
		}else {
			System.out.println("1");
			return;
		}
		if(type.getText().equals("学生")) {
			usertype = "1";
		}else if(type.getText().equals("宿管")) {
			usertype = "2";
		}else if(type.getText().equals("导员")){
			usertype = "3";
		}else {
			System.out.println("2");
			return;
		}
		Register register = new Register();
		register.setName(username_text.getText());
		register.setNumber(number.getText());
		register.setPassword(password.getText());
		register.setSex(sex);
		register.setUsername(name.getText());
		register.setUsertype(usertype);
		System.out.println("3");
		int result = new RegisterService().confim(register);
		System.out.println(result);
		
		
		
	}
	
	
}
