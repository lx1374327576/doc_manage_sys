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
		data.add(new Information("a"));
		message.setCellValueFactory(cellData -> cellData.getValue().getMessage());
		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		
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
