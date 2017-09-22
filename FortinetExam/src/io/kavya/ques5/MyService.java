package io.kavya.ques5;

public class MyService {
	
	private MyDao myDao;
	
	public MyService(MyDao myDao) {
		this.myDao = myDao;
	}
	
	public MyEntity findById(long id) {
		return myDao.findById(id);
	}

}
