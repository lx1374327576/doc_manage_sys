package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pop.PopWindow;
import model.Personal;
import service.PersonalService;
import params.Parems;

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
			Personal  model = new Personal();
			model.setUsername(Parems.getUsername());
			model.setEmail(mail.getText());
			model.setPhone(phone_number.getText());
			model.setDomitory_building(building.getText());
			model.setDomitory_number(building_number.getText());
			model.setOldpassword(old_password.getText());
			model.setNewpassword(new_password.getText());
			int result = new PersonalService().change(model);
			if(result==0) {
				new PopWindow().alert_informationDialog("修改错误提示!","原密码不正确!");
			}else if(result==1) {
				new PopWindow().alert_informationDialog("提示!","修改成功!");
				//页面跳转 
			}else {
				new PopWindow().alert_informationDialog("错误提示!","未知错误!");
			}
		}else {
			new PopWindow().alert_informationDialog("修改错误提示!","两次密码不一致!");
		}
		
		
		
		
	}
	
	

}

