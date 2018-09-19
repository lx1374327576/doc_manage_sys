package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Reply2Controller {
	private boolean flag = false;
	@FXML
	private TextArea message;	
	@FXML
	private TextField leave_time; 	
	@FXML
	private TextField comeback_time;
	@FXML
	private TextField night_time;
	@FXML
	private TextField number;
	@FXML
	private TextField new_number;
	@FXML
	private Label leave;
	@FXML
	private Label comeback;
	@FXML
	private Label night;
	@FXML
	private Label number_name;
	@FXML
	private Label new_number_name;
	@FXML
	private TextField name;
	@FXML
	private TextField room;
	@FXML
	private TextField apply_time;
	@FXML
	private TextField apply_type;

	
	@FXML
	protected void agree_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void refuse_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		leave.setVisible(false);
		leave_time.setVisible(false);
		comeback.setVisible(false);
		comeback_time.setVisible(false);
		number_name.setVisible(false);
		number.setVisible(false);
		night.setVisible(false);
		night_time.setVisible(false);
		new_number.setVisible(false);
		new_number_name.setVisible(false);
		message.clear();
		
		flag = true;
	}
	
	@FXML
	protected void  put_action(ActionEvent event){
		
		
		
	}
	
	

}


