package model;

public class LostAndFound extends BaseObject {
	
	private String username;
	private String landf;//输入是失界面还是得界面 0/1
	private String isdelete;// 0没删除 1删除
	private String info;
	private String phone;
	private String number;
	private String name;
	private String landf_id;
	
	
	public String getLandf_id() {
		return landf_id;
	}
	public void setLandf_id(String landf_id) {
		this.landf_id = landf_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLandf() {
		return landf;
	}
	public void setLandf(String landf) {
		this.landf = landf;
	}
	public String getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
