package service;

import java.util.ArrayList;
import java.util.List;

import dao.QuestionAndAnswerDao;
import model.QuestionAndAnswer;

public class QuestionAndAnswerService extends BaseService {

	//questionandanswer.fxml 
	public List<QuestionAndAnswer> get_first(QuestionAndAnswer questionAndAnswer){
		List<QuestionAndAnswer> list=new ArrayList();
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		list=qustionAndAnswerDao.getfirst(questionAndAnswer);
		return list;
	}
	public List<QuestionAndAnswer> get_myquestion(QuestionAndAnswer questionAndAnswer){
		List<QuestionAndAnswer> list=new ArrayList();
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		list=qustionAndAnswerDao.getmyquestion(questionAndAnswer);
		return list;
	}
	
	
	
	//answer.fxml 
	public List<QuestionAndAnswer> get_second(QuestionAndAnswer questionAndAnswer){
		List<QuestionAndAnswer> list=new ArrayList();
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		list=qustionAndAnswerDao.get_second(questionAndAnswer);
		return list;
	}
	public void submit_reply(QuestionAndAnswer questionAndAnswer){
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		qustionAndAnswerDao.submit_reply(questionAndAnswer);
		return;
	}
	
	//question.fxml
	public List<QuestionAndAnswer> get_third(QuestionAndAnswer questionAndAnswer){
		List<QuestionAndAnswer> list=new ArrayList();
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		list=qustionAndAnswerDao.get_third(questionAndAnswer);
		return list;
	}
	public List<QuestionAndAnswer> get_other_reply(QuestionAndAnswer questionAndAnswer){
		List<QuestionAndAnswer> list=new ArrayList();
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		list=qustionAndAnswerDao.get_other_reply(questionAndAnswer);
		return list;
	}
	
	//ask.fxml
	public String get_four(QuestionAndAnswer questionAndAnswer){
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		String result;
		result=qustionAndAnswerDao.get_four(questionAndAnswer);
		return result;
	}
	public void submit_question(QuestionAndAnswer questionAndAnswer){
		QuestionAndAnswerDao qustionAndAnswerDao=new QuestionAndAnswerDao();
		qustionAndAnswerDao.submit_question(questionAndAnswer);
		return;
	}
}
