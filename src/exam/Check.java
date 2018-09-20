package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public int password(String pwd) {
		int result=1;
		
		int i = pwd.matches(".*\\d+.*") ? 1 : 0;//是否包含数字

		int j = pwd.matches(".*[a-zA-Z]+.*") ? 1 : 0;//是否包含字母

		int k = pwd.matches(".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*") ? 1 : 0;//是否包含特殊字符
		
		int l = pwd.length(); //代码长度 是否在区间内
		//if (l>=6 && l<=18) return 1 else return 0;
		// || or     && and     ! not
		//"这里要写一个判断语句"
		//result 返回1 说明密码正确 返回0 会提示错误
		return result;
	}
	
	public static void main(String []args) {
		Check check=new Check();
		System.out.println(check.password("lx"));
	}
}
