package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Inquire;

public class InquireDao extends BaseDao{

	public List<Inquire> dom(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		int dom[]=new int[1000];
		for (int i=501;i<=525;i++)dom[i]=6;
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student");
		list2=convertList(rs);
		for (int i=0;i<list2.size();i++) {
			Map<String,String> map=(Map)list2.get(i);
			if (map.get("dormitory_number")!=null && !map.get("dormitory_number").equals("")) {
				dom[Integer.valueOf(map.get("dormitory_number"))]--;
			}
		}
		for (int i=501;i<=525;i++) {
			tmp=new Inquire();
			tmp.setBuilding_number(String.valueOf(i));
			tmp.setBed_number(String.valueOf(dom[i]));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public List<Inquire> roommate(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student where user_name=?",inquire.getUsername());
		list2=convertList(rs);
		Map<String,String> map=(Map)list2.get(0);
		String dom_number=map.get("dormitory_number");
		executeQuery("select * from student where dormitory_number=?",dom_number);
		list2=convertList(rs);
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setName(map.get("name"));
			tmp.setRoommate_phone(map.get("telephone"));
			if (i%2==0) {
				tmp.setIs_in_dom("0");
			}else {
				tmp.setIs_in_dom("1");
			}
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public List<Inquire> get_cardtime(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student where user_name=?",inquire.getUsername());
		list2=convertList(rs);
		Map<String,String> map=(Map)list2.get(0);
		String number=map.get("number");
		executeQuery("select * from ent where student_number=?",number);
		list2=convertList(rs);
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setCard_time_info(map.get("time"));
			list.add(tmp);
		}
		closeAll();
		return list;		
	}

	public List<Inquire> apply(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from apply where user_id=?",inquire.getUsername());
		list2=convertList(rs);
		Map<String,String> map;
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setApply_type(map.get("type"));
			tmp.setApply_time(map.get("apply_time"));
			tmp.setIspass(map.get("state"));
			list.add(tmp);
		}
		closeAll();
		return list;	
	}

	public List<Inquire> in_dom(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student");
		list2=convertList(rs);
		Map<String,String> map;
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setDom_number(map.get("dormitory_number"));
			tmp.setName(map.get("name"));
			
			list.add(tmp);
		}
		closeAll();
		return list;	
	}

	public List<Inquire> repair(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from apply where type=5 and state=-1");
		list2=convertList(rs);
		Map<String,String> map;
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setRepair_info(map.get("ps"));
			tmp.setDom_number(map.get("data4"));
			tmp.setRepair_time(map.get("data5"));
			tmp.setApply_id(map.get("apply_id"));
			list.add(tmp);
		}
		closeAll();
		return list;	
	}

	public List<Inquire> g_student(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student");
		list2=convertList(rs);
		Map<String,String> map;
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			tmp.setName(map.get("name"));
			tmp.setStudent_number(map.get("number"));
			tmp.setDom_number(map.get("dormitory_number"));
			tmp.setBuilding_number(map.get("building_number"));
			if (i%2==0) {
				tmp.setIs_in_dom("0");
			}else {
				tmp.setIs_in_dom("1");
			}
			list.add(tmp);
		}
		closeAll();
		return list;	
	}

	public List<Inquire> stu_door(Inquire inquire) {
		// TODO Auto-generated method stub
		getConnection();
		List<Inquire> list=new ArrayList();
		Inquire tmp=new Inquire();
		List list2=new ArrayList();
		executeQuery("select * from student where user_name=?",inquire.getUsername());
		list2=convertList(rs);
		Map<String,String> map=(Map)list2.get(0);
		String number=map.get("number");
		executeQuery("select * from ent where student_number=?",number);
		list2=convertList(rs);
		for (int i=0;i<list2.size();i++) {
			map=(Map)list2.get(i);
			tmp=new Inquire();
			if (map.get("isenter").equals("0")) {
				tmp.setCard_time_info(map.get("time")+" ³ö");
			}else {
				tmp.setCard_time_info(map.get("time")+" ½ø");
			}
			list.add(tmp);
		}
		closeAll();
		return list;
	}

}
