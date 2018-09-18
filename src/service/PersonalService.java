package service;

import dao.PersonalDao;
import model.Personal;

public class PersonalService extends BaseService {//ÉÐÎ´Íê³É
	
	public Personal submit(Personal personal) {
		Personal r_personal=new Personal();
		PersonalDao personalDao=new PersonalDao();
		r_personal=personalDao.getinfo(personal);
		r_personal.setIsChangePass("-1");
		if (personal.getOldpassword()!=null && personal.getNewpassword()!=null) {
			int result;
			result=personalDao.change(personal);
			r_personal.setIsChangePass(String.valueOf(result));
		}
		return r_personal;
	}
	
}
