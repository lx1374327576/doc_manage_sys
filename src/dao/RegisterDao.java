package dao;

import java.util.ArrayList;
import java.util.List;

import model.Register;

public class RegisterDao extends BaseDao {
	
	public int confim(Register register) {
		int result=0;
		int id_personinfo,id_sys_user;
		List list = new ArrayList();
		getConnection();
		executeQuery("select * from sys_user where name=?",register.getUsername());
		list=convertList(rs);
		if (list.size()>=1) {
			closeAll();
			return result;
		}
		System.out.println("���سɹ���");
		id_sys_user=get_count("select * from sys_user");
		System.out.println("�û�����"+id_sys_user+"����");
		id_sys_user+=1;
		executeUpdate("insert into sys_user values(?,?,?,?)"
				,register.getUsername(),String.valueOf(id_sys_user),register.getPassword(),register.getUsertype());
		id_personinfo=get_count("select * from student");
		System.out.println("������Ϣ����"+id_personinfo+"����");
		id_personinfo+=1;
		result=executeUpdate("insert into student values(?,?,?,?,null,null,null,null,?)",
				String.valueOf(id_personinfo),register.getNumber(),register.getName(),register.getSex(),register.getUsername());
		closeAll();
		return result;
	}
}
