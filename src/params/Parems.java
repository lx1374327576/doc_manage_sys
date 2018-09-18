package params;

public class Parems {
	
	private static  boolean user_login = false;
	private static boolean login_stage = true;
	private static boolean register_stage = false;
	
	public static  boolean isUser_login() {
		return user_login;
	}
	
	public static void setUser_login(boolean user_login) {
		Parems.user_login = user_login;
	}
	
	public static boolean isLogin_stage() {
		return login_stage;
	}
	
	public static void setLogin_stage(boolean login_stage) {
		Parems.login_stage = login_stage;
	}
	
	public static boolean isRegister_stage() {
		return register_stage;
	}
	
	public static void setRegister_stage(boolean register_stage) {
		Parems.register_stage = register_stage;
	}

}
