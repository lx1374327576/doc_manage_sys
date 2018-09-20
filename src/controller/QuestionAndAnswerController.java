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
import model.QuestionAndAnswer;
import service.QuestionAndAnswerService;
import params.Parems;

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
	
//	List<Button> btnList = new ArrayList<Button>();
	
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
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		List<QuestionAndAnswer> list = new QuestionAndAnswerService().get_first(model);
		for(int i=0;i<list.size();i++) {
			Button btn = new Button();
			btn.setText("详情");
			String id = list.get(i).getOut_question_id();
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.3682,Interpolator.EASE_OUT);
					Timeline timeline=new Timeline();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
					timeline.play();
					Parems.setQuestion_id(id);
//					System.out.println(a);
					//页面跳转
				}
				
			});
//			btnList.add(a);
			data.add(new Information(list.get(i).getOut_person(),list.get(i).getOut_time(),list.get(i).getOut_question(),btn));
			publish_people.setCellValueFactory(cellData -> cellData.getValue().getPublish_people());
			publish_time.setCellValueFactory(cellData -> cellData.getValue().getPublish_time());
			question.setCellValueFactory(cellData -> cellData.getValue().getQuestion());
			edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
			table.setItems(data);
		}
		
		
		flag = true;
	}
	
	@FXML
	protected void ask_action(ActionEvent event) {
		//页面跳转
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 0.4208,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	
	@FXML
	protected void myproblem_action(ActionEvent event) {
		QuestionAndAnswer model = new QuestionAndAnswer();
		model.setUsername(Parems.getUsername());
		List<QuestionAndAnswer> list = new QuestionAndAnswerService().get_myquestion(model);
		for(int i=0;i<list.size();i++) {
			Button btn = new Button();
			btn.setText("详情");
			String id = list.get(i).getOut_question_id();
			btn.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					Parems.setQuestion_id(id);
					//页面跳转
				}
				
			});
//			btnList.add(a);
			data.add(new Information(list.get(i).getOut_person(),list.get(i).getOut_time(),list.get(i).getOut_question(),btn));
			publish_people.setCellValueFactory(cellData -> cellData.getValue().getPublish_people());
			publish_time.setCellValueFactory(cellData -> cellData.getValue().getPublish_time());
			question.setCellValueFactory(cellData -> cellData.getValue().getQuestion());
			edit.setCellValueFactory(cellData -> cellData.getValue().getEdit());
			table.setItems(data);
		}
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






