package controller;


import java.util.List;

import controller.Inquire1Controller.Information1;
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

public class ProgressController{
	
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
		if(Parems.isFlagProgress()) {
			return;
		}
		Inquire model = new Inquire();
		model.setUsername(Parems.getUsername());
		List<Inquire> list = new InquireService().apply(model);
		for(int i=0;i<list.size();i++) {
			String ispass = "通过";
			if(list.get(i).getIspass().equals("0")) {
				ispass="不通过";
			}
			data.add(new Information(list.get(i).getApply_time(),list.get(i).getApply_type(),ispass));
			apply_time.setCellValueFactory(cellData -> cellData.getValue().getApply_time());
			apply_type.setCellValueFactory(cellData -> cellData.getValue().getApply_type());
			isagree.setCellValueFactory(cellData -> cellData.getValue().getIsagree());
			table.setItems(data);
		}
		Parems.setFlagProgress(true);
	}
	
	@FXML
	protected void back_action(ActionEvent event) {
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.6312,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
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