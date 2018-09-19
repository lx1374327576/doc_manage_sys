package service;

import dao.ApplyDao;
import model.Apply;

public class ApplyService extends BaseService {
	
	public void submit(Apply apply) {
		
		ApplyDao applyDao=new ApplyDao();
		
		switch (apply.getApply_type()) {
			case "1":applyDao.leave(apply);
				break;
			case "2":applyDao.back(apply);
				break;
			case "3":applyDao.leader(apply);
				break;
			case "4":applyDao.change(apply);
				break;
			case "5":applyDao.repair(apply);
				break;
		}
		
		return;
	}
	
}
