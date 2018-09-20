package model;

public class Inquire extends BaseObject {
	private String username;
	
	//student
	private String dom_number;
	private String bed_number;
	
	private String roommate_name;
	private String roommate_phone;
	
	private String card_time_info;
	
	//student
	private String apply_time;
	private String apply_type;
	private String ispass;
	
	//su guan
	private String name;
	private String is_in_dom;
	
	private String repair_time;
	private String repair_info;
	private String apply_id;

	//guider
	private String student_number;
	private String door_info;
	private String building_number;

	public String getApply_id() {
		return apply_id;
	}
	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDom_number() {
		return dom_number;
	}
	public void setDom_number(String dom_number) {
		this.dom_number = dom_number;
	}
	public String getBed_number() {
		return bed_number;
	}
	public void setBed_number(String bed_number) {
		this.bed_number = bed_number;
	}
	public String getRoommate_name() {
		return roommate_name;
	}
	public void setRoommate_name(String roommate_name) {
		this.roommate_name = roommate_name;
	}
	public String getRoommate_phone() {
		return roommate_phone;
	}
	public void setRoommate_phone(String roommate_phone) {
		this.roommate_phone = roommate_phone;
	}
	public String getCard_time_info() {
		return card_time_info;
	}
	public void setCard_time_info(String card_time_info) {
		this.card_time_info = card_time_info;
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
	public String getIspass() {
		return ispass;
	}
	public void setIspass(String ispass) {
		this.ispass = ispass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIs_in_dom() {
		return is_in_dom;
	}
	public void setIs_in_dom(String is_in_dom) {
		this.is_in_dom = is_in_dom;
	}
	public String getRepair_time() {
		return repair_time;
	}
	public void setRepair_time(String repair_time) {
		this.repair_time = repair_time;
	}
	public String getRepair_info() {
		return repair_info;
	}
	public void setRepair_info(String repair_info) {
		this.repair_info = repair_info;
	}
	public String getStudent_number() {
		return student_number;
	}
	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	public String getDoor_info() {
		return door_info;
	}
	public void setDoor_info(String door_info) {
		this.door_info = door_info;
	}
	public String getBuilding_number() {
		return building_number;
	}
	public void setBuilding_number(String building_number) {
		this.building_number = building_number;
	}
}
