package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.BaseDao;

public class ExamDao extends BaseDao {
	
	public void test(String str) {
		getConnection();
		List list=new ArrayList();
		executeQuery(str);
		list=convertList(rs);
		for (int i=0;i<list.size();i++) {
			Map<String,String> map = (Map) list.get(i);
			for (String key:map.keySet()) {  
				System.out.print(map.get(key)+' ');
			}
			System.out.println();//这个是输出每列的数据
			
//			for (String key:map.keySet()) {  
//				System.out.print(key+' ');
//			}
//			System.out.println();//这个是输出列名
		} 
		closeAll();
	}
	
	public static void main(String []args) {
		ExamDao examDao=new ExamDao();
		examDao.test("在这里输入联合查询");
	}
	
}
//祝你考试好运