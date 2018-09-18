package test;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StageTest {
	
	
	
	public void display(String title) {
		Stage window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setWidth(500);
		window.setHeight(400);
		
		final WebView browser = new WebView();
		final WebEngine webEngine = browser.getEngine();
		webEngine.load("http://www.baidu.com");
		
		Button close_btn = new Button("Close the window");
		HBox.setMargin(close_btn, new Insets(5,0,20,100));
		close_btn.setOnAction(e -> window.close());
		
		VBox vbox = new VBox(close_btn,browser);
		
		window.setScene(new Scene(vbox));
		window.showAndWait();
		
		
	}
}
