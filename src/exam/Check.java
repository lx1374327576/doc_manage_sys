package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public int password(String pwd) {
		int result=1;
		
		int i = pwd.matches(".*\\d+.*") ? 1 : 0;//�Ƿ��������

		int j = pwd.matches(".*[a-zA-Z]+.*") ? 1 : 0;//�Ƿ������ĸ

		int k = pwd.matches(".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*") ? 1 : 0;//�Ƿ���������ַ�
		
		int l = pwd.length(); //���볤�� �Ƿ���������
		//if (l>=6 && l<=18) return 1 else return 0;
		// || or     && and     ! not
		//"����Ҫдһ���ж����"
		//result ����1 ˵��������ȷ ����0 ����ʾ����
		return result;
	}
	
	public static void main(String []args) {
		Check check=new Check();
		System.out.println(check.password("lx"));
	}
}
