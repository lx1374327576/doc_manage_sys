package model;

public class Reply extends BaseObject {
	private String username;
	private String name;//����
	private String dom_number;//data4 �����
	private String apply_time;//ʱ��
	private String apply_type;//type ��������
	private String leave_time;//�뿪ʱ��data1
	private String back_time;//����ʱ��data2 
	private String repair_time;//����ʱ��data5
	private String late_time;//ҹ��ʱ��data3
	private String apply_id;//��ǻ�����
	private String info;//���˵��ps 
	private String state;//����״̬
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRepair_time() {
		return repair_time;
	}
	public void setRepair_time(String repair_time) {
		this.repair_time = repair_time;
	}
	public String getLate_time() {
		return late_time;
	}
	public void setLate_time(String late_time) {
		this.late_time = late_time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDom_number() {
		return dom_number;
	}
	public void setDom_number(String dom_number) {
		this.dom_number = dom_number;
	}
	public String getApply_time() {
		return apply_time;
	}
	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}
	public String getApply_type() {
		return apply_type;
	}
	public void setApply_type(String apply_type) {
		this.apply_type = apply_type;
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
	public String getApply_id() {
		return apply_id;
	}
	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
