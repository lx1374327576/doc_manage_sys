package params;

import java.util.ArrayList;
import java.util.List;

public class SourcePath {
	
	public static List<String> url(){
		List<String> allList = new ArrayList<String>();
		
		String Login = "../source/log.fxml";
		String Register = "../source/regist.fxml";
		String HomePage = "";
		String Contact = "";
		String Personal = "../source/PersonalInformation.fxml";
		
		allList.add(Login);
		allList.add(Register);
		allList.add(Personal);		
		
		
		return allList;
	}
	
	

}
