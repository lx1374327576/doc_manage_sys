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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import model.Reply;
import service.ReplyService;
import params.Parems;

public class Reply1Controller {
	
	private boolean flag = false;
	@FXML
	private TableColumn<ReplyInformation, String> name;
	@FXML
	private TableColumn<ReplyInformation, String> number;
	@FXML
	private TableColumn<ReplyInformation, String> apply_time;
	@FXML
	private TableColumn<ReplyInformation, String> apply_type;
	@FXML
	private TableColumn<ReplyInformation, Button> edit;
	@FXML
	private TableView<ReplyInformation> table;
	private final ObservableList<ReplyInformation> data = FXCollections.observableArrayList();
	
	
//	for(int i=0;i<2;i++) {
//		Button a = new Button();
//		btnList.add(a);
//	}
//	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		Reply model = new Reply();
		model.setUsername(Parems.getUsername());
		List<Reply> list = new ReplyService().get_info(model);
		for(int i=0;i<list.size();i++) {
			Button btn = new Button();
			btn.setText("ÏêÇé");
			String id = list.get(i).getApply_id();
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println("a");
					Parems.setReply_id(id);
					//Ò³ÃæÌø×ª
				}
				
			});
			data.add(new ReplyInformation(list.get(i).getName(),list.get(i).getDom_number(),list.get(i).getApply_time(),list.get(i).getApply_type(),btn));
			name.setCellValueFactory(cellData -> cellData.getValue().getName());
			number.setCellValueFactory(cellData -> cellData.getValue().getNumber());
			apply_time.setCellValueFactory(cellData -> cellData.getValue().getApply_time());
			apply_type.setCellValueFactory(cellData -> cellData.getValue().getApply_type());
			edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
			table.setItems(data);
		}
		
		
		flag = true;
	}

	

	
	
	public class ReplyInformation {
		private final StringProperty name;
		private final StringProperty number;
		private final StringProperty apply_time;
		private final StringProperty apply_type;
		private final ObjectProperty<Button> edit;
		
		public ReplyInformation() {
			this(null,null,null,null,null);
		}
		
		public ReplyInformation(String name,String number,String apply_time,String apply_type,Button edit) {
			this.name = new SimpleStringProperty(name);	
			this.number = new SimpleStringProperty(number);	
			this.apply_time = new SimpleStringProperty(apply_time);	
			this.apply_type = new SimpleStringProperty(apply_type);	
			this.edit = new SimpleObjectProperty<Button>(edit);
			
		}
		
		public void setName(String name) {
			this.name.set(name);
		}
		public StringProperty getName() {
			this.name.set("aa");
			return name;
		}
		
		public void setNumber(String number) {
			this.number.set(number);
		}
		public StringProperty getNumber() {
			return number;
		}
		
		public void setApply_time(String apply_time) {
			this.apply_time.set(apply_time);
		}
		public StringProperty getApply_time() {
			return apply_time;
		}
		
		public void setApply_type(String apply_type) {
			this.apply_type.set(apply_type);
		}
		public StringProperty getApply_type() {
			return apply_type;
		}
		
		
		
		public ObjectProperty<Button> getEdit(){
			return edit;
		}
		
	}
	
	
}





