package test;

import java.util.ArrayList;
import java.util.List;

import model.Reply;
import service.ReplyService;

public class ReplyTest {
	public static void main(String []args) {
		ReplyService replyService=new ReplyService();
		Reply reply=new Reply();
		reply.setApply_id("1");
		reply.setUsername("lx1374327576");
		List<Reply> list=new ArrayList();
		list=replyService.get_info(reply);
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getState());
		}
		System.out.println(replyService.agree(reply));
		list=replyService.get_info(reply);
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getState());
		}
		System.out.println(replyService.refuse(reply));
	}
}
