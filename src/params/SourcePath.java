package params;

import java.util.ArrayList;
import java.util.List;

public class SourcePath {
	
	public static List<String> url(){
		List<String> allList = new ArrayList<String>();
		
		String HomePage = "";
		String Contact = "";
		String Personal = "../source/Personal.fxml";
		String Register = "../source/Register.fxml";
		String Login = "../source/Login.fxml";
		String Apply = "../source/Apply.fxml";
		String Reply1 = "../source/Reply1.fxml";
		String Reply2 = "../source/Reply2.fxml";
		String QuestionAndAnswer = "../source/QuestionAndAnswer.fxml";
		String Answer = "../source/Answer.fxml";
		String Question = "../source/Question.fxml";
		
		
		
		allList.add(Personal);
		allList.add(Register);
		allList.add(Login);	
		allList.add(Apply);
		allList.add(Reply1);
		allList.add(Reply2);
		allList.add(QuestionAndAnswer);
		allList.add(Answer);
		allList.add(Question);
		
		
		
		return allList;
	}
	
	

}
