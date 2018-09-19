package params;

import java.util.ArrayList;
import java.util.List;

public class SourcePath {
	
	public static List<String> url(){
		List<String> allList = new ArrayList<String>();
		
		String HomePage = "";
		String Contact = "";
		String Personal = "";
		String Register = "../source/Register.fxml";
		String Login = "../source/Login.fxml";
		String Apply = "../source/Apply.fxml";
		String Reply1 = "../source/Reply1.fxml";
		
		allList.add(Login);	
		allList.add(Apply);
		allList.add(Register);
		allList.add(Reply1);
		
		
		return allList;
	}
	
	

}
