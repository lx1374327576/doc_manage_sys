package controller;


import java.util.List;

import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Inquire2Controller{
	
	private boolean flag = false;
	@FXML
	private Pane inquire2_stage;
	@FXML
	private TableColumn<Information, String> name;
	@FXML
	private TableColumn<Information, String> building;
	@FXML
	private TableColumn<Information, String> room_number;
	@FXML
	private TableColumn<Information, String> isroom;
	@FXML
	private TableColumn<Information, Button> edit;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		Button a = new Button();
		a.setText("ฯ๊ว้");
		
		a.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.8416,Interpolator.EASE_OUT);
				Timeline timeline=new Timeline();
				timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
				timeline.play();
				System.out.println("a");
			}
			
		});
		data.add(new Information("a","123","222","2",a));
		name.setCellValueFactory(cellData -> cellData.getValue().getName());
		building.setCellValueFactory(cellData -> cellData.getValue().getBuilding());
		room_number.setCellValueFactory(cellData -> cellData.getValue().getRoom_number());
		isroom.setCellValueFactory(cellData -> cellData.getValue().getIsroom());
		edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
		table.setItems(data);
		flag = true;
	}
	
	
	
	public class Information {
		private final StringProperty name;
		private final StringProperty building;
		private final StringProperty room_number;
		private final StringProperty isroom;
		private final ObjectProperty<Button> edit;
		
		public Information() {
			this(null,null,null,null,null);
		}
		
		public Information(String name,String building,String room_number,String isroom,Button edit) {
			this.name = new SimpleStringProperty(name);	
			this.building = new SimpleStringProperty(building);
			this.room_number = new SimpleStringProperty(room_number);	
			this.isroom = new SimpleStringProperty(isroom);
			this.edit = new SimpleObjectProperty<Button>(edit);
		}


		public StringProperty getName() {
			return name;
		}

		public StringProperty getBuilding() {
			return building;
		}

		public StringProperty getRoom_number() {
			return room_number;
		}

		public StringProperty getIsroom() {
			return isroom;
		}


		public ObjectProperty<Button> getEdit() {
			return edit;
		}

		


	}


}