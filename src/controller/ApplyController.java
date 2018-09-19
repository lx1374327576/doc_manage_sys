package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Apply;
import params.Parems;
import service.ApplyService;

public class ApplyController {
	private String type = "0";
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
		
		type = "1";
		
		apply_type.setText("¿Î–£");
		
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
		
		type = "2";
		
		apply_type.setText("“ππÈ");
		
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
		
		type = "3";
		apply_type.setText("Àﬁ…·≥§…Í«Î");
		
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
		
		type = "4";
		apply_type.setText("ªª«ﬁ");
		
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
		
		type = "5";
		apply_type.setText("±®–ﬁ");
		
		number_name.setVisible(true);
		number.setVisible(true);
		report.setVisible(true);
		report_time.setVisible(true);
	}
	
	
	
	@FXML
	protected void  put_action(ActionEvent event){
		if(type.equals("0")) {
			message.clear();
			return;
		}
		Apply apply = new Apply();
		apply.setInfo(message.getText());
		apply.setDom_number(number.getText());
		apply.setNew_dom_number(new_number.getText());
		if(type.equals("5")) {
			apply.setLeave_time(report.getText());
		}else if(type.equals("1")){
			apply.setLeave_time(leave_time.getText());
		}
		if(type.equals("1")) {
			apply.setBack_time(comeback_time.getText());
		}else if(type.equals("2")) {
			apply.setBack_time(night_time.getText());
		}
		apply.setBack_time(comeback_time.getText());
		apply.setUsername(Parems.getUsername());
		apply.setApply_type(type);
		
		ApplyService a = new ApplyService();
		a.submit(apply);
		
		
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
		
		//“≥√ÊÃ¯◊™
		
		
	}
	
	

}

