package service;

import java.util.ArrayList;
import java.util.List;

import dao.LostAndFoundDao;
import model.LostAndFound;

public class LostAndFoundService extends BaseService {
	
	List<LostAndFound> list=new ArrayList();
	LostAndFoundDao lostAndFoundDao=new LostAndFoundDao();
	
	public List<LostAndFound> show(LostAndFound lostAndFound){
		list=lostAndFoundDao.show(lostAndFound);
		return list;
	}
	
	public List<LostAndFound> my_show(LostAndFound lostAndFound){
		list=lostAndFoundDao.my_show(lostAndFound);
		return list;
	}
	
	public void submit(LostAndFound lostAndFound) {
		lostAndFoundDao.submit(lostAndFound);
		return;
	}
	
	public int delete(LostAndFound lostAndFound){
		int result=-1;
		result=lostAndFoundDao.delete(lostAndFound);
		return result;
	}
}
