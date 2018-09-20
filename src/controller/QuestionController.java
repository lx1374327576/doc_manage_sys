package controller;


import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.QuestionAndAnswer;
import service.QuestionAndAnswerService;
import params.Parems;

public class QuestionController{
	
	private boolean flag = false;
	@FXML
	private Pane question_stage;
	@FXML
	private TableColumn<Information, String> reply_people;
	@FXML
	private TableColumn<Information, String> reply_content;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	@FXML
	private Label publish_people;
	@FXML
	private Label question_text;
	@FXML
	private TextArea detail_text;
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		detail_text.setEditable(false);
		if(flag) {
			return;
		}
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		model.setIn_question_id(Parems.getQuestion_id());
		List<QuestionAndAnswer> list = new QuestionAndAnswerService().get_other_reply(model);
		for(int i=0;i<list.size();i++) {
			
			data.add(new Information(list.get(i).getOut_person(),list.get(i).getOut_question()));
			reply_people.setCellValueFactory(cellData -> cellData.getValue().getReply_people());
			reply_content.setCellValueFactory(cellData -> cellData.getValue().getReply_content());
			table.setItems(data);
		}
		List<QuestionAndAnswer> list1 = new QuestionAndAnswerService().get_third(model);
//		publish_people.setText(list1.get(0).getOut_person());
//		question_text.setText(list1.get(0).getOut_question());
//		detail_text.setText(list1.get(0).getOut_info());
		
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		//页面跳转
	}
	
	@FXML
	protected void answer_action(ActionEvent event) {
		//页面跳转
	}

	

	
	
	public class Information {
		private final StringProperty reply_people;
		private final StringProperty reply_content;
		
		public Information() {
			this(null,null);
		}
		
		public Information(String reply_people,String reply_content) {
			this.reply_people = new SimpleStringProperty(reply_people);	
			this.reply_content = new SimpleStringProperty(reply_content);	
		}

		public StringProperty getReply_people() {
			return reply_people;
		}

		public StringProperty getReply_content() {
			return reply_content;
		}


	}


}