package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Personal;

public class PersonalDao extends BaseDao {

	public Personal show_info(Personal personal) {
		// TODO Auto-generated method stub
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
		return tmp;
	}

	public int change(Personal personal) {
		// TODO Auto-generated method stub
		int result=-1;
		
		return result;
	}

}
