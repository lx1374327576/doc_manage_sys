package controller;


import java.util.List;

import controller.LostController.Information;
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
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.LostAndFound;
import params.Parems;
import pop.PopWindow;
import service.LostAndFoundService;

public class FoundController{
	
	private boolean flag = false;
	@FXML
	private Pane found_stage;
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
	private TextArea pull_number;
	@FXML
	private TextArea pull_thing;
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		LostAndFound found = new LostAndFound();
		found.setUsername(Parems.getUsername());
		found.setLandf("1");
		LostAndFoundService lostService = new LostAndFoundService();
		List<LostAndFound> list = lostService.show(found);
		for (int i=0;i<list.size();i++) {
			Button btn = new Button();
			btn.setText("ɾ��");
			String id = list.get(i).getLandf_id();
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					LostAndFound delate = new LostAndFound();
					delate.setUsername(Parems.getUsername());
					delate.setLandf_id(id);
					delate.setIsdelete("1");
					int result = lostService.delete(delate);
					if(result==1) {
						new PopWindow().alert_informationDialog("��ʾ", "�����ɹ�");
					}else if(result==0) {
						new PopWindow().alert_informationDialog("��ʾ", "����ʧ��");
					}else {
						new PopWindow().alert_informationDialog("������ʾ", "δ֪����");
					}
				}
				
			});
			data.add(new Information(list.get(i).getName(),list.get(i).getInfo(),list.get(i).getNumber(),list.get(i).getPhone(),btn));
			lost_people.setCellValueFactory(cellData -> cellData.getValue().getLost_people());
			lost_thing.setCellValueFactory(cellData -> cellData.getValue().getLost_thing());
			room_number.setCellValueFactory(cellData -> cellData.getValue().getRoom_number());
			connect_number.setCellValueFactory(cellData -> cellData.getValue().getConnect_number());
			delate.setCellValueFactory(cellData -> cellData.getValue().getDelate());
			table.setItems(data);
		}
		flag = true;
	}

	
	@FXML
	protected void choice_action(ActionEvent event) {
		LostAndFound found = new LostAndFound();
		found.setUsername(Parems.getUsername());
		found.setLandf("1");
		LostAndFoundService lostService = new LostAndFoundService();
		List<LostAndFound> list = lostService.my_show(found);
		for (int i=0;i<list.size();i++) {
			Button btn = new Button();
			btn.setText("ɾ��");
			String id = list.get(i).getLandf_id();
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					LostAndFound delate = new LostAndFound();
					delate.setUsername(Parems.getUsername());
					delate.setLandf_id(id);
					delate.setIsdelete("1");
					int result = lostService.delete(delate);
					if(result==1) {
						new PopWindow().alert_informationDialog("��ʾ", "�����ɹ�");
					}else if(result==0) {
						new PopWindow().alert_informationDialog("��ʾ", "����ʧ��");
					}else {
						new PopWindow().alert_informationDialog("������ʾ", "δ֪����");
					}
				}
				
			});
			data.add(new Information(list.get(i).getName(),list.get(i).getInfo(),list.get(i).getNumber(),list.get(i).getPhone(),btn));
			lost_people.setCellValueFactory(cellData -> cellData.getValue().getLost_people());
			lost_thing.setCellValueFactory(cellData -> cellData.getValue().getLost_thing());
			room_number.setCellValueFactory(cellData -> cellData.getValue().getRoom_number());
			connect_number.setCellValueFactory(cellData -> cellData.getValue().getConnect_number());
			delate.setCellValueFactory(cellData -> cellData.getValue().getDelate());
			table.setItems(data);
		}
	}
	
	@FXML
	protected void pull_action(ActionEvent event) {
		LostAndFound found = new LostAndFound();
		found.setUsername(Parems.getUsername());
		found.setLandf("1");
		found.setInfo(pull_thing.getText());
		found.setPhone(pull_number.getText());
		new LostAndFoundService().submit(found);
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