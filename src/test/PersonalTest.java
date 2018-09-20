package test;

import model.Personal;
import service.PersonalService;

public class PersonalTest {
		public static void main(String []args) {
			PersonalService personalService=new PersonalService();
			Personal personal=new Personal();
			personal.setUsername("lx1374327576");
			Personal tmp=new Personal();
			tmp=personalService.show_info(personal);
			System.out.println(tmp.getName());
			personal.setOldpassword("lx85090066");
			personal.setNewpassword("lx85090066!!");
			int result=personalService.change(personal);
			System.out.println(result);
		}
}
