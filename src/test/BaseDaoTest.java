package test;

import dao.BaseDao;
import java.util.List;
import java.util.Map;

class BaseDaoTest extends BaseDao{
	public void query(String sql , Object... params) {
		getConnection();
		executeQuery(sql,params);
		System.out.println("成功进入query!");
		print_q(convertList(rs));
		closeAll();
	}
	public void update(String sql, Object... params) {
		getConnection();
		int influenced_rows;
		influenced_rows=executeUpdate(sql,params);
		System.out.println("成功进入update!");
		System.out.println(influenced_rows+"行受影响！");
		closeAll();
	}
	public void print_q(List list) {
		System.out.println("成功进入print_q!");
		for (int i = 0; i < list.size(); i++) {
			Map<String,String> map = (Map) list.get(i);
			for (String key:map.keySet()) {  
				System.out.println("key= "+ key + " and value= " + map.get(key));
			}
		}
	}

	public static void main(String []args) {
		BaseDaoTest baseDaoTest=new BaseDaoTest();
		baseDaoTest.query("Select * from sys_user where id=?",1);
		//baseDaoTest.update("Delete from MoneyTotal where xxxx<500;");
	}
}