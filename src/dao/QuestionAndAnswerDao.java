package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import model.QuestionAndAnswer;

public class QuestionAndAnswerDao extends BaseDao {

	public List<QuestionAndAnswer> getfirst(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		List<QuestionAndAnswer> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from qanda where qora=?","1");
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			QuestionAndAnswer tmp=new QuestionAndAnswer();
			tmp.setOut_question_id(map.get("id"));
			tmp.setOut_time(map.get("time"));
			tmp.setOut_question(map.get("title"));
			tmp.setOut_username(map.get("username"));
			tmp.setOut_info(map.get("info"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setOut_person(map2.get("name"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public List<QuestionAndAnswer> getmyquestion(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		List<QuestionAndAnswer> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from qanda where qora=? and username=?","1",questionAndAnswer.getUsername());
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			QuestionAndAnswer tmp=new QuestionAndAnswer();
			tmp.setOut_question_id(map.get("id"));
			tmp.setOut_time(map.get("time"));
			tmp.setOut_question(map.get("title"));
			tmp.setOut_username(map.get("username"));
			tmp.setOut_info(map.get("info"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setOut_person(map2.get("name"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public List<QuestionAndAnswer> get_second(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		List<QuestionAndAnswer> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from qanda where qora=? and id=?","1",questionAndAnswer.getIn_question_id());
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			QuestionAndAnswer tmp=new QuestionAndAnswer();
			tmp.setOut_question_id(map.get("id"));
			tmp.setOut_time(map.get("time"));
			tmp.setOut_question(map.get("title"));
			tmp.setOut_username(map.get("username"));
			tmp.setOut_info(map.get("info"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setOut_person(map2.get("name"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public void submit_reply(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from qanda");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into qanda values(?,?,?,?,null,?,?,?)",
				result,questionAndAnswer.getUsername(),"0",df.format(new Date()),
				questionAndAnswer.getIn_info(),
				"0",questionAndAnswer.getIn_question_id());
		closeAll();
		return;
	}

	public List<QuestionAndAnswer> get_third(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		List<QuestionAndAnswer> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from qanda where id=?",questionAndAnswer.getIn_question_id());
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			QuestionAndAnswer tmp=new QuestionAndAnswer();
			tmp.setOut_question_id(map.get("id"));
			tmp.setOut_time(map.get("time"));
			tmp.setOut_question(map.get("title"));
			tmp.setOut_username(map.get("username"));
			tmp.setOut_info(map.get("info"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setOut_person(map2.get("name"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public List<QuestionAndAnswer> get_other_reply(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		List<QuestionAndAnswer> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from qanda where qora=? and reply_id=?","0",questionAndAnswer.getIn_question_id());
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			QuestionAndAnswer tmp=new QuestionAndAnswer();
			tmp.setOut_question_id(map.get("id"));
			tmp.setOut_time(map.get("time"));
			tmp.setOut_question(map.get("title"));
			tmp.setOut_username(map.get("username"));
			tmp.setOut_info(map.get("info"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setOut_person(map2.get("name"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public void submit_question(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from qanda");
		result+=1;
		System.out.println(result);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into qanda values(?,?,?,?,?,?,?,null)",
				result,questionAndAnswer.getUsername(),"1",df.format(new Date()),
				questionAndAnswer.getIn_question(),questionAndAnswer.getIn_info(),
				"0");
		closeAll();
		return;
	}

	public String get_four(QuestionAndAnswer questionAndAnswer) {
		// TODO Auto-generated method stub
		String result="";
		getConnection();
		List list=new ArrayList();
		executeQuery("select name from student where user_name=?",questionAndAnswer.getUsername());
		list=convertList(rs);
		Map<String,String> map = (Map) list.get(0);
		result=map.get("name");
		closeAll();
		return result;
	}

}
