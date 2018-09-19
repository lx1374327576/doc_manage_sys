package frame;

import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import params.SourcePath;


public class Main extends Application{
	public static ScrollPane scrollPane;
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
			
			Parent headr_pane = FXMLLoader.load(getClass().getResource("../source/Header.fxml"));
			hb_header.getChildren().add(headr_pane);
			
			
			HBox main_pane = new HBox();
			main_pane.setMaxHeight(430);
			main_pane.setPrefWidth(890);
			
			SourcePath sourcePath = new SourcePath();
			List path = sourcePath.url();
			
			for(int i=0;i<path.size();i++) {
				Parent parent = FXMLLoader.load(getClass().getResource((String) path.get(i)));
				main_pane.getChildren().add(parent);
			}
			
			scrollPane = new ScrollPane();
			scrollPane.getStyleClass().add("edge-to-edge");
			scrollPane.setVbarPolicy(ScrollBarPolicy.NEVER);
//			scrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
			scrollPane.setContent(main_pane);
			scrollPane.setVvalue(1);
//			scrollPane.setDisable(true);
//			scrollPane.fitToHeightProperty();
//			scrollPane.setFitToHeight(false);
//			scrollPane.setPannable(false);
//			
//			AnchorPane a = new AnchorPane();
//			a.getChildren().add(main_pane);
			
//			VBox a = new VBox();
//			a.setSpacing(10);
//			a.setMaxHeight(430.0);
//			a.getChildren().add(main_pane);
			
			
			HBox hb_center = new HBox(scrollPane);
			hb_center.setPrefWidth(890.0);
			hb_center.setPrefHeight(430.0);
			hb_center.setMaxHeight(430.0);
			hb_center.setPadding(new Insets(2,2,2,2));
			VBox.setMargin(hb_center, new Insets(0,0,5,0));
//			hb_center.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			
			
			HBox hb_footer = new HBox();
			hb_footer.setPrefWidth(890.0);
			hb_footer.setPrefHeight(80.0);
			hb_footer.setPadding(new Insets(2,2,2,2));
//			hb_footer.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			Parent footer_pane = FXMLLoader.load(getClass().getResource("../source/Footer.fxml"));
			hb_footer.getChildren().add(footer_pane);
			
			
			VBox vb_all = new VBox(hb_header,hb_center,hb_footer);
			vb_all.setPrefWidth(900.0);
			vb_all.setPrefHeight(600.0);
			vb_all.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
//			vb_all.setBorder(new Border(new BorderStroke(Color.GOLD,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			vb_all.setPadding(new Insets(10,5,10,5));
			
			

			primaryStage.setScene(new Scene(vb_all,900,600));
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
