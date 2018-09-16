package test;

import dao.BaseDao;

public class DBConnectionTest{
	public DBConnectionTest(){
		BaseDao testBaseDao=new BaseDao();
		testBaseDao.getConnection();
		try { 
			Thread.sleep(1000); 
		} catch (InterruptedException e) { 
			e.printStackTrace(); 
		}
		testBaseDao.closeAll();
	}
	
	public static void main(String []args) {
		DBConnectionTest dbConnectionTest=new DBConnectionTest();
	}
}