package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
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
		//Ò³ÃæÌø×ª
	}
	
	@FXML
	protected void add_data_action(MouseEvent event) {
		if(flage) {
			return;
		}
		Personal  model = new Personal();
		model.setUsername(Parems.getUsername());
		Personal result = new PersonalService().show_info(model);
		name.setText(result.getName());
		male.setText(result.getSex());
		number.setText(result.getNumber());
		mail.setText(result.getEmail());
		phone_number.setText(result.getPhone());
		building.setText(result.getDomitory_building());
		building_number.setText(result.getDomitory_number());
		if(result.getIsroommaster().equals("0")) {
			is_team.setText("ÊÇ");
		}else if(result.getIsroommaster().equals("1")) {
			is_team.setText("·ñ");
		}
		flage = true;
	}
	
	

}


