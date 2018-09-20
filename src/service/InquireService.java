package service;

import java.util.ArrayList;
import java.util.List;

import dao.InquireDao;
import model.Inquire;

public class InquireService extends BaseService {
	
	List<Inquire> list=new ArrayList();
	InquireDao inquireDao=new InquireDao();
	
	//学生
	
	public List<Inquire> dom(Inquire inquire){
		list=inquireDao.dom(inquire);
		return list;
	}
	
	public List<Inquire> roommate(Inquire inquire){
		list=inquireDao.roommate(inquire);
		return list;
	}
	
	
	public List<Inquire> cardtime(Inquire inquire){
		list=inquireDao.get_cardtime(inquire);
		return list;
	}
	
	public List<Inquire> apply(Inquire inquire){
		list=inquireDao.apply(inquire);
		return list;
	}
	
	//宿管
	public List<Inquire> in_dom(Inquire inquire){
		list=inquireDao.in_dom(inquire);
		return list;
	}
	
	public List<Inquire> repair(Inquire inquire){
		list=inquireDao.repair(inquire);
		return list;
	}
	
	//导员
	public List<Inquire> g_student(Inquire inquire){
		list=inquireDao.g_student(inquire);
		return list;
	}
	
	public List<Inquire> stu_door(Inquire inquire){
		list=inquireDao.stu_door(inquire);
		return list;
	}
}
