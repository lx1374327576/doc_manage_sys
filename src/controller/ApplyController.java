package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ApplyController {
	@FXML
	private TextArea message;	
	@FXML
	private MenuButton apply_type;
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
	private TextField report_time;
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
	private Label report;
	
	@FXML
	protected void leave_action(ActionEvent event) {
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		
		
		leave.setVisible(true);
		leave_time.setVisible(true);
		comeback.setVisible(true);
		comeback_time.setVisible(true);
		number_name.setVisible(true);
		number.setVisible(true);
	}
	
	@FXML
	protected void night_action(ActionEvent event) {
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		
		night.setVisible(true);
		night_time.setVisible(true);
		number_name.setVisible(true);
		number.setVisible(true);
	}
	
	@FXML
	protected void team_action(ActionEvent event) {
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		number_name.setVisible(true);
		number.setVisible(true);
	}
	
	@FXML
	protected void change_action(ActionEvent event) {
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		
		number_name.setVisible(true);
		number.setVisible(true);
		new_number.setVisible(true);
		new_number_name.setVisible(true);
	}
	
	@FXML
	protected void report_action(ActionEvent event) {
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		
		number_name.setVisible(true);
		number.setVisible(true);
		report.setVisible(true);
		report_time.setVisible(true);
	}
	
	
	
	@FXML
	protected void  put_action(ActionEvent event){
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
		report.setVisible(false);
		report_time.setVisible(false);
		message.clear();
		
		
	}
	
	

}

