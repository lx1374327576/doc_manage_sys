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
			System.out.println();//��������ÿ�е�����
			
//			for (String key:map.keySet()) {  
//				System.out.print(key+' ');
//			}
//			System.out.println();//������������
		} 
		closeAll();
	}
	
	public static void main(String []args) {
		ExamDao examDao=new ExamDao();
		examDao.test("�������������ϲ�ѯ");
	}
	
}
//ף�㿼�Ժ���