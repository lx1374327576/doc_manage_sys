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

public class ProgressController{
	
	private boolean flag = false;
	@FXML
	private Pane progress_stage;
	@FXML
	private TableColumn<Information, String> apply_time;
	@FXML
	private TableColumn<Information, String> apply_type;
	@FXML
	private TableColumn<Information, String> isagree;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flag) {
			return;
		}
		data.add(new Information("a","123","b"));
//		reply_people.setCellValueFactory(cellData -> cellData.getValue().getReply_people());
//		reply_content.setCellValueFactory(cellData -> cellData.getValue().getReply_content());
		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		
	}
	

	
	
	public class Information {
		private final StringProperty apply_time;
		private final StringProperty apply_type;
		private final StringProperty isagree;
		
		public Information() {
			this(null,null,null);
		}
		
		public Information(String apply_time,String apply_type,String isagree) {
			this.apply_time = new SimpleStringProperty(apply_time);	
			this.apply_type = new SimpleStringProperty(apply_type);	
			this.isagree = new SimpleStringProperty(isagree);
		}

		public StringProperty getApply_time() {
			return apply_time;
		}

		public StringProperty getApply_type() {
			return apply_type;
		}

		public StringProperty getIsagree() {
			return isagree;
		}

		


	}


}