package controller;



import frame.Main;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import model.Personal;
import params.Parems;
import service.PersonalService;

public class ShowController {
	private boolean flage = false;
	@FXML
	private Pane show_stage;
	@FXML
	private Label name;
	@FXML
	private Label male;
	@FXML
	private Label number;
	@FXML
	private Label mail;
	@FXML
	private Label phone_number;
	@FXML
	private Label building;
	@FXML
	private Label building_number;
	@FXML
	private Label is_team;
	
	@FXML
	protected void  change_action(ActionEvent event){
		//页面跳转
		KeyValue kValue=new KeyValue(Main.scrollPane.hvalueProperty(), 1,Interpolator.EASE_OUT);
		Timeline timeline=new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), kValue));
		timeline.play();
	}
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flage) {
			return;
		}
		Personal  model = new Personal();
		model.setUsername(Parems.getUsername());
		System.out.println(Parems.getUsername());
		Personal result = new PersonalService().show_info(model);
		System.out.println(result.getIsroommaster());
		name.setText(result.getName());
		if(result.getSex().equals("0")) {
			male.setText("女");
		}else if(result.getSex().equals("1")) {
			male.setText("男");
		}else {
			male.setText("不详");
		}
		number.setText(result.getNumber());
		mail.setText(result.getEmail());
		phone_number.setText(result.getPhone());
		building.setText(result.getDomitory_building());
		building_number.setText(result.getDomitory_number());
		if(result.getIsroommaster().equals("1")) {
			is_team.setText("是");
		}else if(result.getIsroommaster().equals("0")) {
			is_team.setText("否");
		}
		flage = true;
	}
	
	

}


