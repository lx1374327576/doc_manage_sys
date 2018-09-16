package frame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import params.LoginRegisterParems;

public class Main extends Application{
	private int a = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		GridPane test = FXMLLoader.load(getClass().getResource("../Test.fxml"));
//		GridPane test1 = FXMLLoader.load(getClass().getResource("../Test.fxml"));
//		GridPane test2 = FXMLLoader.load(getClass().getResource("../Test.fxml"));
		try {
			
//			if (LoginRegisterParems.isLogin_stage()) {
//				System.out.println("login_stage");
//			}
//			if(LoginRegisterParems.isRegister_stage()) {
//				System.out.println("register_stage");
//			}
		
//			System.out.println(a);
			
			HBox hb_header = new HBox();
			hb_header.setPrefWidth(890.0);
			hb_header.setPrefHeight(60.0);
			hb_header.setPadding(new Insets(2,2,2,2));
			VBox.setMargin(hb_header,new Insets(0,0,5,0));
//			hb_header.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
	//		GridPane test1 = FXMLLoader.load(getClass().getResource("../Test.fxml"));
	//		test1.setPrefWidth(300.0);
	//		test1.setPrefHeight(400.0);
	//		
	//		GridPane test2 = FXMLLoader.load(getClass().getResource("../Test.fxml"));
	//		test2.setPrefWidth(600.0);
	//		test2.setPrefHeight(400.0);
			
			VBox vb_center_left = new VBox();
			vb_center_left.setPrefWidth(200.0);
			vb_center_left.setPrefHeight(426.0);
			HBox.setMargin(vb_center_left, new Insets(2,10,2,5));
			vb_center_left.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			VBox vb_center_right = new VBox();
			vb_center_right.setPrefWidth(670.0);
			vb_center_right.setPrefHeight(426.0);
			vb_center_right.setPadding(new Insets(2,2,2,2));
			HBox.setMargin(vb_center_right, new Insets(2,5,2,0));
			vb_center_right.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			
			HBox hb_center = new HBox(vb_center_left,vb_center_right);
			hb_center.setPrefWidth(890.0);
			hb_center.setPrefHeight(430.0);
			hb_header.setPadding(new Insets(1,1,1,1));
			VBox.setMargin(hb_center, new Insets(0,0,5,0));
			hb_center.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			
			
			HBox hb_footer = new HBox();
			hb_footer.setPrefWidth(890.0);
			hb_footer.setPrefHeight(80.0);
			hb_footer.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			
			
			VBox vb_all = new VBox(hb_header,hb_center,hb_footer);
			vb_all.setPrefWidth(900.0);
			vb_all.setPrefHeight(600.0);
			vb_all.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
			vb_all.setBorder(new Border(new BorderStroke(Color.GOLD,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			vb_all.setPadding(new Insets(10,5,10,5));
			
			
			GridPane pane_header = FXMLLoader.load(getClass().getResource("../Header.fxml"));
			GridPane pane_header_normal = FXMLLoader.load(getClass().getResource("../HeaderNormal.fxml"));
			hb_header.getChildren().add(pane_header);
			
			GridPane pane_center_right_login = FXMLLoader.load(getClass().getResource("../Login.fxml"));
			vb_center_right.getChildren().add(pane_center_right_login);
			
			GridPane pane_center_right_register = FXMLLoader.load(getClass().getResource("../Register.fxml"));
			
			Group root = new Group();
			root.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
//					if (LoginRegisterParems.isLogin_stage()) {
//						System.out.println("login_stage");
//						a = 1;
//					}
//					if(LoginRegisterParems.isRegister_stage()) {
//						System.out.println("register_stage");
//						a = 2;
//					}
					if (LoginRegisterParems.isUser_login()) {
						hb_header.getChildren().remove(pane_header);
						if(!hb_header.getChildren().contains(pane_header_normal)) {
							hb_header.getChildren().add(pane_header_normal);
						}
					}else {
						hb_header.getChildren().remove(pane_header_normal);
						if (!hb_header.getChildren().contains(pane_header)) {
							hb_header.getChildren().add(pane_header);
						}
					}
					if(LoginRegisterParems.isLogin_stage()) {
						if(!vb_center_right.getChildren().contains(pane_center_right_login)) {
							vb_center_right.getChildren().add(pane_center_right_login);
						}
					}else {
						vb_center_right.getChildren().remove(pane_center_right_login);
					}
					if(LoginRegisterParems.isRegister_stage()) {
						if(!vb_center_right.getChildren().contains(pane_center_right_register)) {
							vb_center_right.getChildren().add(pane_center_right_register);
						}
					}else {
						vb_center_right.getChildren().remove(pane_center_right_register);
					}
				}
			});
			
			root.getChildren().add(vb_all);
			primaryStage.setScene(new Scene(root,900,600));
			primaryStage.setTitle("Testing");
			primaryStage.setResizable(false);
			primaryStage.show();
		}catch (Exception  e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
