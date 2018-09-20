package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Apply;
import model.Reply;

public class ReplyDao extends BaseDao {

	public List<Reply> get_info(Reply reply) {
		// TODO Auto-generated method stub
		getConnection();
		List<Reply> list=new ArrayList();
		List list1=new ArrayList();
		executeQuery("select * from apply where state=?","-1");
		list1=convertList(rs);
		for (int i=0;i<list1.size();i++) {
			Map<String,String> map = (Map) list1.get(i);
			Reply tmp=new Reply();
			tmp.setApply_time(map.get("apply_time"));
			tmp.setDom_number(map.get("data4"));
			tmp.setBack_time(map.get("data2"));
			tmp.setLeave_time(map.get("data1"));
			tmp.setRepair_time(map.get("data5"));
			tmp.setLate_time(map.get("data3"));
			tmp.setApply_id(map.get("apply_id"));
			tmp.setDom_number(map.get("data6"));
			tmp.setState(map.get("state"));
			tmp.setInfo(map.get("ps"));
			List list2=new ArrayList();
			executeQuery("select name from student where user_name=?",map.get("user_id"));
			list2=convertList(rs);
			Map<String,String> map2 = (Map) list2.get(0);
			tmp.setUsername(map2.get("name"));
			executeQuery("select exp from apply_type where type=?",map.get("type"));
			list2=convertList(rs);
			map2 = (Map) list2.get(0);
			tmp.setApply_type(map2.get("exp"));
			list.add(tmp);
		}
		closeAll();
		return list;
	}

	public int refuse(Reply reply) {
		// TODO Auto-generated method stub
		int result=-1;
		getConnection();
		List list=new ArrayList();
		executeQuery("select * from apply where apply_id=?",reply.getApply_id());
		list=convertList(rs);
		Map<String,String> map=(Map)list.get(0);
		if (map.get("state").equals("-1")) {
			executeUpdate("update apply set state=0 where apply_id=?",reply.getApply_id());
			result=1;
		}else {
			result=0;
		}
		closeAll();
		return result;
	}

	public int agree(Reply reply) {
		// TODO Auto-generated method stub
		int result=-1;
		getConnection();
		List list=new ArrayList();
		executeQuery("select * from apply where apply_id=?",reply.getApply_id());
		list=convertList(rs);
		Map<String,String> map=(Map)list.get(0);
		if (map.get("state").equals("-1")) {
			executeUpdate("update apply set state=1 where apply_id=?",reply.getApply_id());
			result=1;
		}else {
			result=0;
		}
		closeAll();
		return result;
	}

}
