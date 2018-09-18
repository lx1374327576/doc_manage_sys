package frame;
/*
 * ������  һ����� ����������fxml�ļ� 
 * 
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import params.SourcePath;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			
		
			//���涥��
			HBox hb_header = new HBox();
			hb_header.setPrefWidth(890.0);
			hb_header.setPrefHeight(60.0);
			hb_header.setPadding(new Insets(2,2,2,2));
			VBox.setMargin(hb_header,new Insets(0,0,5,0));
//		
			//������  �������� �������
			HBox hb_center = new HBox();
			hb_center.setPrefWidth(890.0);
			hb_center.setPrefHeight(430);
			hb_center.setPadding(new Insets(2,2,2,2));
			VBox.setMargin(hb_center, new Insets(0,0,5,0));
//			hb_center.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			
			
			
			//����Ľ�ע ֱ�ӳ�ʼ�� ������ ҳ�����߼�
			HBox hb_footer = new HBox();
			hb_footer.setPrefWidth(890.0);
			hb_footer.setPrefHeight(80.0);
			hb_footer.setPadding(new Insets(2,2,2,2));
//			hb_footer.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			GridPane pane_footer = FXMLLoader.load(getClass().getResource("../Footer.fxml"));
			hb_footer.getChildren().add(pane_footer);
			
			
			ScrollPane scrollpane = new ScrollPane();
			scrollpane.setPrefWidth(886);
			scrollpane.setVbarPolicy(ScrollBarPolicy.NEVER);
			scrollpane.setHbarPolicy(ScrollBarPolicy.NEVER);
			
			VBox mainPage = new VBox();
			mainPage.setPrefWidth(886);
			mainPage.setMinHeight(10000);
			
			scrollpane.setContent(mainPage);

			SourcePath Source = new SourcePath();
			
			
			for (int i = 0;i<(int)Source.url().size();i++) {
				String url = Source.url().get(i);
				Parent parent = FXMLLoader.load(getClass().getResource(url));
				mainPage.getChildren().add(parent);
			}
			
			hb_center.getChildren().add(scrollpane);
			
			//������  ���������������box
			VBox vb_all = new VBox(hb_header,hb_center,hb_footer);
			vb_all.setPrefWidth(900.0);
			vb_all.setPrefHeight(600.0);
			vb_all.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
//			vb_all.setBorder(new Border(new BorderStroke(Color.GOLD,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
			vb_all.setPadding(new Insets(10,5,10,5));
			
			
			//����ͷ���� pane����  ���Ұ� Header.fxml ��Ϊ��ʼ����
			GridPane pane_header = FXMLLoader.load(getClass().getResource("../Header.fxml"));
			GridPane pane_header_normal = FXMLLoader.load(getClass().getResource("../HeaderNormal.fxml"));
			hb_header.getChildren().add(pane_header);
			
			
			//������ ��Ҫ��ʾ���ݵ�pane���� ���Ұ�Login.fxml ��Ϊ��ʼ����
//			GridPane pane_center_right_login = FXMLLoader.load(getClass().getResource("../Login.fxml"));
//			GridPane pane_center_right_register = FXMLLoader.load(getClass().getResource("../Register.fxml"));
//			hb_center.getChildren().add(pane_center_right_login);
			

			
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
