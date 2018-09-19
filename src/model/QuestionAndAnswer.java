package model;

public class QuestionAndAnswer extends BaseObject {
	
	
	private String username;
	private String out_person;//发布人姓名
	private String out_time;//发布时间
	private String out_question;//问题
	private String out_info;//详情
	private String out_username;//发布人用户名
	private String in_question;//提交问题
	private String in_info;//提交问题的信息
	private String out_question_id;//传出的问题id
	private String question_auth;//问题权限 暂时不用
	private String in_question_id;//传入的问题id
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOut_person() {
		return out_person;
	}
	public void setOut_person(String out_person) {
		this.out_person = out_person;
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}
	public String getOut_question() {
		return out_question;
	}
	public void setOut_question(String out_question) {
		this.out_question = out_question;
	}
	public String getOut_info() {
		return out_info;
	}
	public void setOut_info(String out_info) {
		this.out_info = out_info;
	}

	public String getIn_question() {
		return in_question;
	}
	public void setIn_question(String in_question) {
		this.in_question = in_question;
	}
	public String getIn_info() {
		return in_info;
	}
	public void setIn_info(String in_info) {
		this.in_info = in_info;
	}
	public String getOut_question_id() {
		return out_question_id;
	}
	public void setOut_question_id(String out_question_id) {
		this.out_question_id = out_question_id;
	}
	public String getQuestion_auth() {
		return question_auth;
	}
	public void setQuestion_auth(String question_auth) {
		this.question_auth = question_auth;
	}
	public String getIn_question_id() {
		return in_question_id;
	}
	public void setIn_question_id(String in_question_id) {
		this.in_question_id = in_question_id;
	}
	public String getOut_username() {
		return out_username;
	}
	public void setOut_username(String out_username) {
		this.out_username = out_username;
	}
}
