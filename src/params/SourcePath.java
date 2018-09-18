package params;

import java.util.ArrayList;
import java.util.List;

public class SourcePath {
	
	public static List<String> url(){
		List<String> allList = new ArrayList<String>();
		
		String HomePage = "";
		String Contact = "";
		String Personal = "";
		String Login = "../source/Login.fxml";
		String Apply = "../source/Apply.fxml";
		
		allList.add(Login);	
		allList.add(Apply);
		
		
		return allList;
	}
	
	

}
