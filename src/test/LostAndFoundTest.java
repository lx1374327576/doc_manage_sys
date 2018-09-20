package test;

import java.util.ArrayList;
import java.util.List;

import model.LostAndFound;
import service.LostAndFoundService;

public class LostAndFoundTest {
	public static void main(String []args) {
		LostAndFound lostAndFound=new LostAndFound();
		LostAndFoundService lostAndFoundService=new LostAndFoundService();
		lostAndFound.setUsername("admin");
		lostAndFound.setLandf_id("05");
		lostAndFound.setLandf("1");
		List<LostAndFound> list=new ArrayList();
		list=lostAndFoundService.show(lostAndFound);
		System.out.println(list.size());
		list=lostAndFoundService.my_show(lostAndFound);
		System.out.println(list.size());
		System.out.println(lostAndFoundService.delete(lostAndFound));
		lostAndFound.setLandf_id("04");
		System.out.println(lostAndFoundService.delete(lostAndFound));
		lostAndFound.setPhone("13757578780");
		lostAndFound.setInfo("xxxxx");
		lostAndFoundService.submit(lostAndFound);
	}
}
