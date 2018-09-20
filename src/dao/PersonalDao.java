package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Personal;

public class PersonalDao extends BaseDao {

	public Personal show_info(Personal personal) {
		// TODO Auto-generated method stub
		getConnection();
		executeQuery("select * from student where user_name=?",personal.getUsername());
		List list=new ArrayList();
		list=convertList(rs);
		Map<String,String> map=(Map)list.get(0);
		Personal tmp=new Personal();
		tmp.setDomitory_building(map.get("building_number"));
		tmp.setDomitory_number(map.get("dormitory_number"));
		tmp.setSex(map.get("sex"));
		tmp.setName(map.get("name"));
		tmp.setIsroommaster(map.get("isleader"));
		tmp.setPhone(map.get("telephone"));
		tmp.setNumber(map.get("number"));
		tmp.setEmail(map.get("email"));
		closeAll();
		return tmp;
	}

	public int change(Personal personal) {
		// TODO Auto-generated method stub
		getConnection();
		int result=-1;
		String username=personal.getUsername();
		if (personal.getEmail()!=null) {
			executeUpdate("update student set mail=? where user_name=?",personal.getEmail(),username);
		}
		if (personal.getPhone()!=null) {
			executeUpdate("update student set phone=? where user_name=?",personal.getPhone(),username);
		}
		if (personal.getDomitory_building()!=null) {
			executeUpdate("update student set building_number=? where user_name=?",personal.getDomitory_building(),username);
		}
		if (personal.getDomitory_number()!=null) {
			executeUpdate("update student set dormitory_number=? where user_name=?",personal.getDomitory_number(),username);
		}
		if (personal.getOldpassword()!=null && personal.getNewpassword()!=null) {
			result=executeUpdate("update sys_user set password=? where name=? and password=?",
					personal.getNewpassword(),personal.getUsername(),personal.getOldpassword());
		}
		closeAll();
		return result;
	}

}
