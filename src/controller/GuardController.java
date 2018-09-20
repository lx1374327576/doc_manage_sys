package controller;


import java.util.List;

import controller.Inquire2Controller.Information;
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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import model.Inquire;
import params.Parems;
import service.InquireService;

public class GuardController{
	
	private boolean flag = false;
	@FXML
	private Pane guard_stage;
	@FXML
	private TableColumn<Information, String> message;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	@FXML
	private Label name;
	@FXML
	private Label number;
	@FXML
	private Label building;
	@FXML
	private Label room_number;
	
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		Inquire mode = new Inquire();
		mode.setUsername(Parems.getUsername());
		mode.setStudent_number(Parems.getStudent_number());
		List<Inquire> list = new InquireService().g_student(mode);
		List<Inquire> list1 = new InquireService().stu_door(mode);
		name.setText(list1.get(0).getName());
		number.setText(list1.get(0).getStudent_number());
		building.setText(list1.get(0).getBuilding_number());
		room_number.setText(list1.get(0).getDom_number());
		for(int i=0;i<list.size();i++) {
			data.add(new Information(list.get(i).getDoor_info()));
			message.setCellValueFactory(cellData -> cellData.getValue().getMessage());
			table.setItems(data);
		}
		
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.789,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	
	
	
	public class Information {
		private final StringProperty message;
		
		public Information() {
			this(null);
		}
		
		public Information(String message) {
			this.message = new SimpleStringProperty(message);	
		}

		public StringProperty getMessage() {
			return message;
		}

		


	}


}
