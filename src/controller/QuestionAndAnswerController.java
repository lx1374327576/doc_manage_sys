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
import javafx.scene.layout.Pane;

public class QuestionAndAnswerController {
	
	private boolean flag = false;
	@FXML
	private Pane question_and_answer_stage;
	@FXML
	private TableColumn<Information, String> publish_people;
	@FXML
	private TableColumn<Information, String> publish_time;
	@FXML
	private TableColumn<Information, String> question;
	@FXML
	private TableColumn<Information, Button> edit;
	@FXML
	private TableView<Information> table;
	private final ObservableList<Information> data = FXCollections.observableArrayList();
	
	List<Button> btnList = new ArrayList<Button>();
	
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
		Button a = new Button();
		a.setText("ฯ๊ว้");
		a.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("a");
			}
			
		});
		btnList.add(a);
		data.add(new Information("a","123","1234",a));
		publish_people.setCellValueFactory(cellData -> cellData.getValue().getPublish_people());
		publish_time.setCellValueFactory(cellData -> cellData.getValue().getPublish_time());
		question.setCellValueFactory(cellData -> cellData.getValue().getQuestion());
		edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
		table.setItems(data);
		flag = true;
	}
	
	@FXML
	protected void ask_action(ActionEvent event) {
		
	}
	
	@FXML
	protected void myproblem_action(ActionEvent event) {
		
	}

	

	
	
	public class Information {
		private final StringProperty publish_people;
		private final StringProperty publish_time;
		private final StringProperty question;
		private final ObjectProperty<Button> edit;
		
		public Information() {
			this(null,null,null,null);
		}
		
		public Information(String publish_people,String publish_time,String question,Button edit) {
			this.publish_people = new SimpleStringProperty(publish_people);	
			this.publish_time = new SimpleStringProperty(publish_time);	
			this.question = new SimpleStringProperty(question);	
			this.edit = new SimpleObjectProperty<Button>(edit);
		}

		public StringProperty getPublish_people() {
			return publish_people;
		}

		public StringProperty getPublish_time() {
			return publish_time;
		}

		public StringProperty getQuestion() {
			return question;
		}

		public ObjectProperty<Button> getEdit() {
			return edit;
		}
		
	}
	
	
}






