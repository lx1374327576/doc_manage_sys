package pop;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopWindow {

//    public void display(String message){
//    	
//		Stage window = new Stage();
//		window.setTitle("��ʾ��");
//		//modalityҪʹ��Modality.APPLICATION_MODEL
//		window.initModality(Modality.APPLICATION_MODAL);
//		window.setMinWidth(300);
//		window.setMinHeight(150);
//
//		Button button = new Button("ȷ��");
//		button.setOnAction(e -> window.close());
//
//		Label label = new Label(message);
//
//		VBox layout = new VBox();
//		layout.getChildren().addAll(label , button);
//		layout.setAlignment(Pos.CENTER);
//
//		Scene scene = new Scene(layout);
//		window.setScene(scene);
//		//ʹ��showAndWait()�ȴ���������ڣ������������main�е��Ǹ����ڲ�����Ӧ
//		window.showAndWait();
//    }
	
	public void alert_informationDialog(String p_header,String p_message){
		System.out.println("1");
        Alert _alert = new Alert(Alert.AlertType.INFORMATION);
        _alert.setTitle("��ʾ��");
        _alert.setHeaderText(p_header);
        _alert.setContentText(p_message);
        _alert.show();
        System.out.println("2");
    }
}
