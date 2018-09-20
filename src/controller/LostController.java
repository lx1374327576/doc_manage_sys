package controller;


import java.util.ArrayList;
import java.util.List;

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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class LostController{
	
	private boolean flag = false;
	@FXML
	private Pane lost_stage;
	@FXML
	private TableColumn<Information, String> lost_people;
	@FXML
	private TableColumn<Information, String> lost_thing;
	@FXML
	private TableColumn<Information, String> room_number;
	@FXML
	private TableColumn<Information, String> connect_number;
	@FXML
	private TableColumn<Information, Button> delate;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	@FXML
	private TextArea put_number;
	@FXML
	private TextArea put_thing;
	
	
	List<Button> btnList = new ArrayList<Button>();
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		Button a = new Button();
		a.setText("É¾³ý");
		a.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("a");
				data.remove(0);
			}
			
		});
		btnList.add(a);
		data.add(new Information("a","12","123","1234",a));
		lost_people.setCellValueFactory(cellData -> cellData.getValue().getLost_people());
		lost_thing.setCellValueFactory(cellData -> cellData.getValue().getLost_thing());
		room_number.setCellValueFactory(cellData -> cellData.getValue().getRoom_number());
		connect_number.setCellValueFactory(cellData -> cellData.getValue().getConnect_number());
		delate.setCellValueFactory(cellData -> cellData.getValue().getDelate());
		table.setItems(data);
		flag = true;
	}

	
	@FXML
	protected void choice_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void put_action(ActionEvent event) {
		
	}

	
	
	public class Information {
		private final StringProperty lost_people;
		private final StringProperty lost_thing;
		private final StringProperty room_number;
		private final StringProperty connect_number;
		private final ObjectProperty<Button> delate;
		
		public Information() {
			this(null,null,null,null,null);
		}
		
		public Information(String lost_people,String lost_thing,String room_number,String connect_number,Button delate) {
			this.lost_people= new SimpleStringProperty(lost_people);	
			this.lost_thing= new SimpleStringProperty(lost_thing);	
			this.room_number = new SimpleStringProperty(room_number);	
			this.connect_number = new SimpleStringProperty(connect_number);	
			this.delate = new SimpleObjectProperty<Button>(delate);
			
		}

		public StringProperty getLost_people() {
			return lost_people;
		}

		public StringProperty getLost_thing() {
			return lost_thing;
		}

		public StringProperty getRoom_number() {
			return room_number;
		}

		public StringProperty getConnect_number() {
			return connect_number;
		}

		public ObjectProperty<Button> getDelate() {
			return delate;
		}
		
		
	}


}