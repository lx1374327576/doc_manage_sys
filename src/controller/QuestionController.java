package controller;


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
		data.add(new Information("a","123"));
		reply_people.setCellValueFactory(cellData -> cellData.getValue().getReply_people());
		reply_content.setCellValueFactory(cellData -> cellData.getValue().getReply_content());
		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void answer_action(ActionEvent event) {
		
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