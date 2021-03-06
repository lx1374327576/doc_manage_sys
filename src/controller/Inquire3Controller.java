package controller;


import java.util.ArrayList;
import java.util.List;

import controller.Inquire1Controller.Information1;
import controller.Inquire1Controller.Information2;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.Inquire;
import params.Parems;
import service.InquireService;

public class Inquire3Controller {
	
	private boolean flag = false;
	@FXML
	private Pane inquire3_stage;
	
	
	@FXML
	private TableColumn<Information1, String> name;
	@FXML
	private TableColumn<Information1, String> room_number;
	@FXML
	private TableColumn<Information1, String> isroom;
	@FXML
	private TableView<Information1> table1;
	private final ObservableList<Information1> data1 = FXCollections.observableArrayList();
	
	
	@FXML
	private TableColumn<Information2, String> report_time;
	@FXML
	private TableColumn<Information2, String> report_room;
	@FXML
	private TableColumn<Information2, String> report_detail;
	@FXML
	private TableColumn<Information2, CheckBox> edit;
	@FXML
	private TableView<Information2> table2;
	private final ObservableList<Information2> data2 = FXCollections.observableArrayList();
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		
		Inquire model1 = new Inquire();
		model1.setUsername(Parems.getUsername());
		List<Inquire> list1 = new InquireService().in_dom(model1);
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).getIs_in_dom()==null) {
				continue;
			}
			String a = "��";
			if(list1.get(i).getIs_in_dom().equals("0")) {
				a = "��";
			}
			data1.add(new Information1(list1.get(i).getName(),list1.get(i).getDom_number(),a));
			name.setCellValueFactory(cellData -> cellData.getValue().getName());
			room_number.setCellValueFactory(cellData -> cellData.getValue().getRoom_number());
			isroom.setCellValueFactory(cellData -> cellData.getValue().getIsroom());
			table1.setItems(data1);
			
		}
		
		Inquire model2 = new Inquire();
		model2.setUsername(Parems.getUsername());
		List<Inquire> list2 = new InquireService().repair(model2);
		for(int i=0;i<list2.size();i++) {
			CheckBox btn = new CheckBox();
			
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
				}
				
			});
			data2.add(new Information2(list2.get(i).getRepair_time(),list2.get(i).getDom_number(),list2.get(i).getRepair_info(),btn));
			report_time.setCellValueFactory(cellData -> cellData.getValue().getReport_time());
			report_room.setCellValueFactory(cellData -> cellData.getValue().getReport_room());
			report_detail.setCellValueFactory(cellData -> cellData.getValue().getReport_detail());
			edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
			table2.setItems(data2);
		}
		flag = true;
	}

	

	
	
	public class Information1 {
		private final StringProperty name;
		private final StringProperty room_number;
		private final StringProperty isroom;
		
		public Information1() {
			this(null,null,null);
		}
		
		public Information1(String name,String room_number,String isroom) {
			this.name = new SimpleStringProperty(name);	
			this.room_number = new SimpleStringProperty(room_number);	
			this.isroom = new SimpleStringProperty(isroom);	
			
		}

		public StringProperty getName() {
			return name;
		}

		public StringProperty getRoom_number() {
			return room_number;
		}

		public StringProperty getIsroom() {
			return isroom;
		}

		
		
		
	}
	
	public class Information2 {
		private final StringProperty report_time;
		private final StringProperty report_room;
		private final StringProperty report_detail;
		private final ObjectProperty<CheckBox> edit;
		
		public Information2() {
			this(null,null,null,null);
		}
		
		public Information2(String report_time,String report_room,String report_detail,CheckBox edit) {
			this.report_time = new SimpleStringProperty(report_time);	
			this.report_room = new SimpleStringProperty(report_room);	
			this.report_detail = new SimpleStringProperty(report_detail);	
			this.edit = new SimpleObjectProperty<CheckBox>(edit);
			
		}

		public StringProperty getReport_time() {
			return report_time;
		}

		public StringProperty getReport_room() {
			return report_room;
		}

		public StringProperty getReport_detail() {
			return report_detail;
		}

		public ObjectProperty<CheckBox> getEdit() {
			return edit;
		}
		
		
		
	}
	
	
}






