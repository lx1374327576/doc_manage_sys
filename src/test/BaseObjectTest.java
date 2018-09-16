package test;

import model.BaseObject;

class BaseObjectTest extends BaseObject{
	int xxxx;

	public int getXxxx() {
		return xxxx;
	}

	public void setXxxx(int xxxx) {
		this.xxxx = xxxx;
	}
	
	public static void main(String []args) {
		BaseObjectTest baseObjectTest=new BaseObjectTest();
		baseObjectTest.setXxxx(5);
		System.out.print(baseObjectTest.getXxxx());
	}
	
}