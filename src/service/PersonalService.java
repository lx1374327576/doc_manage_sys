package service;

import dao.PersonalDao;
import model.Personal;

public class PersonalService extends BaseService {
	
	//show fxml
	public Personal show_info(Personal personal) {
		PersonalDao personalDao=new PersonalDao();
		Personal tmp=new Personal();
		tmp=personalDao.show_info(personal);
		return tmp;
	}
	
	//personal fxml
	public int change(Personal personal) {//-1 δ�޸����� 0 ������� 1�޸ĳɹ�
		int result=-1;
		PersonalDao personalDao=new PersonalDao();
		result=personalDao.change(personal);
		return result;
	}
	
}
