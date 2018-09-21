package controller;



import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Reply;
import service.ReplyService;
import params.Parems;
import pop.PopWindow;

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
		Reply model = new Reply();
		model.setUsername(Parems.getUsername());
		model.setApply_id(Parems.getReply_id());
		System.out.println(Parems.getReply_id());
		int result = new ReplyService().agree(model);
		if(result == 0) {
			new PopWindow().alert_informationDialog("操作提示", "该操作已执行");
		}else if(result == 1) {
			new PopWindow().alert_informationDialog("操作提示", "操作成功");
		}else {
			new PopWindow().alert_informationDialog("错误提示", "未知错误");
		}
	}
	
	@FXML
	protected void refuse_action(ActionEvent event) {
		Reply model = new Reply();
		model.setUsername(Parems.getUsername());
		model.setApply_id(Parems.getReply_id());
		int result = new ReplyService().refuse(model);
		if(result == 0) {
			new PopWindow().alert_informationDialog("操作提示", "该操作已执行");
		}else if(result == 1) {
			new PopWindow().alert_informationDialog("操作提示", "操作成功");
		}else {
			new PopWindow().alert_informationDialog("错误提示", "未知错误");
		}
	}
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(Parems.isFlagReply()) {
			return;
		}
		
		message.setEditable(false);
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
	
		Reply model = new Reply();
		model.setUsername(Parems.getUsername());
		model.setApply_id(Parems.getReply_id());
		List<Reply> list = new ReplyService().get_info(model);
		name.setText(list.get(Parems.getRow()).getName());
		room.setText(list.get(Parems.getRow()).getDom_number());
		apply_time.setText(list.get(Parems.getRow()).getApply_time());
		apply_type.setText(list.get(Parems.getRow()).getApply_type());
		message.setText(list.get(Parems.getRow()).getInfo());
		String type =list.get(Parems.getRow()).getApply_type();
		
		if(type.equals("离校申请")) {
			
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

			
			leave.setVisible(true);
			leave_time.setVisible(true);
			comeback.setVisible(true);
			comeback_time.setVisible(true);
			number_name.setVisible(true);
			number.setVisible(true);
			
			leave_time.setText(list.get(Parems.getRow()).getLeave_time());
			comeback_time.setText(list.get(Parems.getRow()).getBack_time());
			number.setText(list.get(Parems.getRow()).getDom_number());
		}else if(type.equals("夜归申请")) {
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
			
			night.setVisible(true);
			night_time.setVisible(true);
			number_name.setVisible(true);
			number.setVisible(true);
			
			night_time.setText(list.get(Parems.getRow()).getLate_time());
			number.setText(list.get(Parems.getRow()).getDom_number());
		}else if(type.equals("宿舍长申请")) {
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
			
			
			number_name.setVisible(true);
			number.setVisible(true);
			
			number.setText(list.get(Parems.getRow()).getDom_number());
		}else if(type.equals("退换舍申请")) {
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
			
			
			number_name.setVisible(true);
			number.setVisible(true);
			new_number.setVisible(true);
			new_number_name.setVisible(true);
			
			number.setText(list.get(Parems.getRow()).getDom_number());
			new_number.setText(list.get(Parems.getRow()).getNew_dom_number());
		}else if(type.equals("报修申请")) {
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
			
			
			number_name.setVisible(true);
			number.setVisible(true);
			
			number.setText(list.get(Parems.getRow()).getDom_number());
		}
		
		
		
		Parems.setFlagReply(true);;
	}
	
	
	

}


