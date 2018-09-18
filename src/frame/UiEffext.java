package frame;

import javafx.animation.*;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class UiEffext {
	
	
	//注册界面和登陆界面互相切换的过渡动画
	public void logToRe(VBox vbox) {
		PathTransition pathTransition=new PathTransition();
		Path path=new Path();
		path.getElements().addAll(new MoveTo(330,213),new LineTo(1070,213));
		pathTransition.setDuration(Duration.seconds(0.1));
		pathTransition.setPath(path);
		pathTransition.setNode(vbox);
		
		pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathTransition.setCycleCount(2);
		pathTransition.setAutoReverse(true);
		
		pathTransition.play();
	
		
	}

}
