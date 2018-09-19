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
//		window.setTitle("提示框");
//		//modality要使用Modality.APPLICATION_MODEL
//		window.initModality(Modality.APPLICATION_MODAL);
//		window.setMinWidth(300);
//		window.setMinHeight(150);
//
//		Button button = new Button("确定");
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
//		//使用showAndWait()先处理这个窗口，而如果不处理，main中的那个窗口不能响应
//		window.showAndWait();
//    }
	
	public void alert_informationDialog(String p_header,String p_message){
		System.out.println("1");
        Alert _alert = new Alert(Alert.AlertType.INFORMATION);
        _alert.setTitle("提示框");
        _alert.setHeaderText(p_header);
        _alert.setContentText(p_message);
        _alert.show();
        System.out.println("2");
    }
}
