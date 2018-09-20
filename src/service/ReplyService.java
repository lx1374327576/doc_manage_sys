package service;

import java.util.ArrayList;
import java.util.List;

import dao.ReplyDao;
import model.Reply;

public class ReplyService extends BaseService {
	
	//reply1.fxml reply2.fxml
	public List<Reply> get_info(Reply reply){
		List<Reply> list=new ArrayList();
		ReplyDao replyDao=new ReplyDao();
		list=replyDao.get_info(reply);
		return list;
	}
	
	//reply2.fxml ͬ��/�ܾ� ��ť  1��ʾ�����ɹ�  0��ʾ�������Ѿ�����
	
	public int refuse(Reply reply) {
		int result=-1;
		ReplyDao replyDao=new ReplyDao();
		result=replyDao.refuse(reply);
		return result;
	}
	
	public int agree(Reply reply) {
		int result=-1;
		ReplyDao replyDao=new ReplyDao();
		result=replyDao.agree(reply);
		return result;
	}
	
}
