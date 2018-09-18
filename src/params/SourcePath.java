package params;

import java.util.ArrayList;
import java.util.List;


public class SourcePath {
	
	public List<String> url() {
		List<String> allList = new ArrayList<String>();
		
		String personMessagePage = "";
		String loginPage = "../Login.fxml";
		String registerPage = "../register.fxml";
		
		allList.add(loginPage);
		allList.add(registerPage);
		
		return allList;
	}

}
