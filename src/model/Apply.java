package model;

public class Apply extends BaseObject {
	private String info;//��ע
	private String dom_number;//�����
	private String apply_type;//1��У 2ҹ�� 3���᳤���� 4���� 5����
	private String new_dom_number;//�������
	private String leave_time;//�뿪ʱ��  ����ʱ��
	private String back_time;//����ʱ��
	private String username;//�û���
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDom_number() {
		return dom_number;
	}
	public void setDom_number(String dom_number) {
		this.dom_number = dom_number;
	}
	public String getApply_type() {
		return apply_type;
	}
	public void setApply_type(String apply_type) {
		this.apply_type = apply_type;
	}
	public String getNew_dom_number() {
		return new_dom_number;
	}
	public void setNew_dom_number(String new_dom_number) {
		this.new_dom_number = new_dom_number;
	}
	public String getLeave_time() {
		return leave_time;
	}
	public void setLeave_time(String leave_time) {
		this.leave_time = leave_time;
	}
	public String getBack_time() {
		return back_time;
	}
	public void setBack_time(String back_time) {
		this.back_time = back_time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
