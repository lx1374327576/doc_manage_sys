package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pop.PopWindow;

public class PersonalController {
	@FXML
	private Label name;
	@FXML
	private Label male;
	@FXML
	private Label number;
	@FXML
	private TextField mail;
	@FXML
	private TextField phone_number;
	@FXML
	private TextField building;
	@FXML
	private TextField building_number;
	@FXML
	private PasswordField old_password;
	@FXML
	private PasswordField new_password;
	@FXML
	private PasswordField new_password_sure;
	@FXML
	private Label is_team;
	
	@FXML
	protected void  sure_action(ActionEvent event){
		if(new_password.getText().equals(new_password_sure.getText())){
			//页面跳转 或者信息修改
		}else {
			new PopWindow().alert_informationDialog("修改错误提示!","两次密码不一致!");
		}
		
		if(false) {
			new PopWindow().alert_informationDialog("修改错误提示!","原密码不正确!");
		}
		
		
	}
	
	

}

