package controller;

import java.util.List;

import controller.QuestionController.Information;
import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import model.Inquire;
import params.Parems;
import service.InquireService;


public class Inquire1Controller {
	private boolean flag = false;
	@FXML
	private Pane inquire1_stage;	

	@FXML
	private TableColumn<Information1, String> empty_room;
	@FXML
	private TableColumn<Information1, String> empty_number;
	@FXML
	private TableView<Information1> table1;
	private final ObservableList<Information1> data1 = FXCollections.observableArrayList();
	
	@FXML
	private TableColumn<Information2, String> roommate_name;
	@FXML
	private TableColumn<Information2, String> roommate_number;
	@FXML
	private TableView<Information2> table2;
	private final ObservableList<Information2> data2 = FXCollections.observableArrayList();
	
	@FXML
	private TableColumn<Information3, String> time;
	@FXML
	private TableView<Information3> table3;
	private final ObservableList<Information3> data3 = FXCollections.observableArrayList();
	
	
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		Inquire model1 = new Inquire();
		model1.setUsername(Parems.getUsername());
		List<Inquire> list1 = new InquireService().dom(model1);
		for(int i=0;i<list1.size();i++) {
			data1.add(new Information1(list1.get(i).getBuilding_number(),list1.get(i).getBed_number()));
			empty_room.setCellValueFactory(cellData -> cellData.getValue().getEmpty_room());
			empty_number.setCellValueFactory(cellData -> cellData.getValue().getEmpty_number());
			table1.setItems(data1);
		}
		
		Inquire model2 = new Inquire();
		model2.setUsername(Parems.getUsername());
		List<Inquire> list2 = new InquireService().roommate(model2);
		for(int i=0;i<list2.size();i++) {
			data2.add(new Information2(list2.get(i).getName(),list2.get(i).getRoommate_phone()));
			roommate_name.setCellValueFactory(cellData -> cellData.getValue().getRoommate_name());
			roommate_number.setCellValueFactory(cellData -> cellData.getValue().getRoommate_number());
			table2.setItems(data2);
		}
		
		Inquire model3 = new Inquire();
		model3.setUsername(Parems.getUsername());
		List<Inquire> list3 = new InquireService().cardtime(model3);
		for(int i=0;i<list3.size();i++) {
			data3.add(new Information3(list3.get(i).getCard_time_info()));
			time.setCellValueFactory(cellData -> cellData.getValue().getTime());
			table3.setItems(data3);
		}
		
//		data.add(new Information("a","123"));
//		reply_people.setCellValueFactory(cellData -> cellData.getValue().getReply_people());
//		reply_content.setCellValueFactory(cellData -> cellData.getValue().getReply_content());
//		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void myapply_action(ActionEvent event) {
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(),0.6838,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
		Parems.setFlagReply(false);
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
