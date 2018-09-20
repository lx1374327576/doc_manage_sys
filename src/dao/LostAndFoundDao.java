package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.LostAndFound;

public class LostAndFoundDao extends BaseDao {
	
	
	public List<LostAndFound> show(LostAndFound lostAndFound) {
		// TODO Auto-generated method stub
		getConnection();
		List<LostAndFound> list=new ArrayList();
		List<LostAndFound> list1=new ArrayList();
		executeQuery("select * from lostandfound where landf=? and isdelete=?",lostAndFound.getLandf(),"0");
		list=convertList(rs);
		for (int i=0;i<list.size();i++) {
			Map<String,String> map = (Map) list.get(i);
			LostAndFound tmp=new LostAndFound();
			tmp.setInfo(map.get("info"));
			tmp.setIsdelete(map.get("isdelete"));
			tmp.setLandf(map.get("landf"));
			tmp.setPhone(map.get("phone"));
			tmp.setUsername(map.get("username"));
			tmp.setLandf_id(map.get("id"));
			List list2=new ArrayList();
			executeQuery("select name,dormitory_number from student where user_name=?",
					map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setName(map2.get("name"));
			tmp.setNumber(map2.get("dormitory_number"));
			list1.add(tmp);
		}
		closeAll();
		return list1;
	}

	public List<LostAndFound> my_show(LostAndFound lostAndFound) {
		// TODO Auto-generated method stub
		getConnection();
		List<LostAndFound> list=new ArrayList();
		List<LostAndFound> list1=new ArrayList();
		executeQuery("select * from lostandfound where landf=? and username=? and isdelete=?",
				lostAndFound.getLandf(),lostAndFound.getUsername(),"0");
		list=convertList(rs);
		for (int i=0;i<list.size();i++) {
			Map<String,String> map = (Map) list.get(i);
			LostAndFound tmp=new LostAndFound();
			tmp.setInfo(map.get("info"));
			tmp.setIsdelete(map.get("isdelete"));
			tmp.setLandf(map.get("landf"));
			tmp.setPhone(map.get("phone"));
			tmp.setUsername(map.get("username"));
			tmp.setLandf_id(map.get("id"));
			List list2=new ArrayList();
			executeQuery("select name,dormitory_number from student where user_name=?",map.get("username"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setName(map2.get("name"));
			tmp.setNumber(map2.get("dormitory_number"));
			list1.add(tmp);
		}
		closeAll();
		return list1;
	}

	public void submit(LostAndFound lostAndFound) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from lostandfound");
		result+=1;
		executeUpdate("insert into lostandfound values(?,?,0,?,?,?)",
				result,lostAndFound.getUsername(),
				lostAndFound.getInfo(),lostAndFound.getPhone(),lostAndFound.getLandf());
		closeAll();
		return ;
	}

	public int delete(LostAndFound lostAndFound) {
		// TODO Auto-generated method stub
		int result=-1;
		getConnection();
		result=executeUpdate("update lostandfound set isdelete=1 where id=? and username=?",
				lostAndFound.getLandf_id(),lostAndFound.getUsername());
		closeAll();
		return result;
	}
	
}
