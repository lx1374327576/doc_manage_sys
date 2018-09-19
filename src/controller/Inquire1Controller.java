package controller;

import controller.QuestionController.Information;
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

public class Inquire1Controller {
	private boolean flag = false;
	@FXML
	private Pane inquire1_stage;	

	@FXML
	private TableColumn<Information, String> empty_room;
	@FXML
	private TableColumn<Information, String> empty_number;
	@FXML
	private TableView<Information> table1;
	private final ObservableList<Information> data1 = FXCollections.observableArrayList();
	
	@FXML
	private TableColumn<Information, String> roommate_name;
	@FXML
	private TableColumn<Information, String> roommate_number;
	@FXML
	private TableView<Information> table2;
	private final ObservableList<Information> data2 = FXCollections.observableArrayList();
	
	@FXML
	private TableColumn<Information, String> time;
	@FXML
	private TableView<Information> table3;
	private final ObservableList<Information> data3 = FXCollections.observableArrayList();
	
	
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
//		data.add(new Information("a","123"));
//		reply_people.setCellValueFactory(cellData -> cellData.getValue().getReply_people());
//		reply_content.setCellValueFactory(cellData -> cellData.getValue().getReply_content());
//		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void myapply_action(ActionEvent event) {
		
	}
	

	

	
	
	public class Information1 {
		private final StringProperty empty_room;
		private final StringProperty empty_number;
		
		public Information1() {
			this(null,null);
		}
		
		public Information1(String empty_room,String empty_number) {
			this.empty_room = new SimpleStringProperty(empty_room);	
			this.empty_number = new SimpleStringProperty(empty_number);	
		}

		public StringProperty getEmpty_room() {
			return empty_room;
		}

		public StringProperty getEmpty_number() {
			return empty_number;
		}

		
	}
	
	public class Information2 {
		private final StringProperty roommate_name;
		private final StringProperty roommate_number;
		
		public Information2() {
			this(null,null);
		}
		
		public Information2(String roommate_name,String roommate_number) {
			this.roommate_name = new SimpleStringProperty(roommate_name);	
			this.roommate_number = new SimpleStringProperty(roommate_number);	
		}

		public StringProperty getRoommate_name() {
			return roommate_name;
		}

		public StringProperty getRoommate_number() {
			return roommate_number;
		}

		
	}
	
	
	public class Information3 {
		private final StringProperty time;
		
		public Information3() {
			this(null);
		}
		
		public Information3(String time) {
			this.time = new SimpleStringProperty(time);	
		}

		public StringProperty getTime() {
			return time;
		}

	}
	
	
}
