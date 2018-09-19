package test;

import java.util.ArrayList;
import java.util.List;

import model.QuestionAndAnswer;
import service.QuestionAndAnswerService;

public class QuestionAndAnswerTest {
	public static void main(String []args) {
		QuestionAndAnswerService questionAndAnswerService=new QuestionAndAnswerService();
		QuestionAndAnswer questionAndAnswer=new QuestionAndAnswer();
		questionAndAnswer.setUsername("lx1374327576");
		List<QuestionAndAnswer> list=new ArrayList();
		list=questionAndAnswerService.get_first(questionAndAnswer);
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getOut_question()+' ');
			System.out.print(list.get(i).getOut_info()+' ');
			System.out.println(list.get(i).getOut_person());
		}
		
		list=questionAndAnswerService.get_myquestion(questionAndAnswer);
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getOut_question()+' ');
			System.out.print(list.get(i).getOut_info()+' ');
			System.out.println(list.get(i).getOut_person());
		}
		
		questionAndAnswer.setIn_question_id("0");
		list=questionAndAnswerService.get_second(questionAndAnswer);
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getOut_question()+' ');
			System.out.println(list.get(i).getOut_person());
		}
		
		questionAndAnswer.setIn_info("test!!!!");
		questionAndAnswer.setIn_question("test????");
		questionAndAnswerService.submit_reply(questionAndAnswer);
		
		list=questionAndAnswerService.get_other_reply(questionAndAnswer);
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getOut_info()+' ');
			System.out.println(list.get(i).getOut_person());
		}
		
		System.out.println(questionAndAnswerService.get_four(questionAndAnswer));
		
		questionAndAnswerService.submit_question(questionAndAnswer);
		
	}
}
