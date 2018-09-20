package dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.Apply;

public class ApplyDao extends BaseDao {

	public void leave(Apply apply) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from apply");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into apply values(?,?,?,?,'-1',?,?,null,?,null,null,?)",
				result,apply.getUsername(),apply.getApply_type(),df.format(new Date()),
				apply.getLeave_time(),apply.getBack_time(),apply.getDom_number(),apply.getInfo());
		closeAll();
	}

	public void back(Apply apply) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from apply");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into apply values(?,?,?,?,'-1',null,null,?,?,null,null,?)",
				result,apply.getUsername(),apply.getApply_type(),df.format(new Date()),
				apply.getBack_time(),apply.getDom_number(),apply.getInfo());
		closeAll();
	}

	public void leader(Apply apply) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from apply");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into apply values(?,?,'3',?,'-1',null,null,null,?,null,null,?)",
				result,apply.getUsername(),df.format(new Date()),
				apply.getDom_number(),apply.getInfo());
		closeAll();
	}

	public void change(Apply apply) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from apply");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into apply values(?,?,'4',?,'-1',null,null,null,?,null,?,?)",
				result,apply.getUsername(),df.format(new Date()),
				apply.getDom_number(),apply.getNew_dom_number(),apply.getInfo());
		closeAll();
	}

	public void repair(Apply apply) {
		// TODO Auto-generated method stub
		getConnection();
		int result=get_count("select * from apply");
		result+=1;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));
		executeUpdate("insert into apply values(?,?,'5',?,'-1',null,null,null,?,?,null,?)",
				result,apply.getUsername(),df.format(new Date()),
				apply.getDom_number(),apply.getLeave_time(),apply.getInfo());
		closeAll();
	}

}
