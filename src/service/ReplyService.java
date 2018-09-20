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
	
	//reply2.fxml 同意/拒绝 按钮  1表示操作成功  0表示该申请已经处理
	
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
