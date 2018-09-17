package model;

public class Personal extends BaseObject {

	private String oldpassword;
	private String newpassword;
	private String phone;
	private String email;
	private String isroommaster; // {0,1}  «∑ÒÀﬁ…·≥§
	private String username;
	private String name;
	private String sex;
	private String number; //—ß∫≈
	private String domitory_building;
	private String domitory_number;
	
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsroommaster() {
		return isroommaster;
	}
	public void setIsroommaster(String isroommaster) {
		this.isroommaster = isroommaster;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDomitory_building() {
		return domitory_building;
	}
	public void setDomitory_building(String domitory_building) {
		this.domitory_building = domitory_building;
	}
	public String getDomitory_number() {
		return domitory_number;
	}
	public void setDomitory_number(String domitory_number) {
		this.domitory_number = domitory_number;
	}
	
	
	
	
}
