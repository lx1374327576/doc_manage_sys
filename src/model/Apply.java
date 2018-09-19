package model;

public class Apply extends BaseObject {
	private String info;//备注
	private String dom_number;//宿舍号
	private String apply_type;//1离校 2夜归 3宿舍长申请 4换寝 5报修
	private String new_dom_number;//新宿舍号
	private String leave_time;//离开时间  修理时间
	private String back_time;//返回时间
	private String username;//用户名
	
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
