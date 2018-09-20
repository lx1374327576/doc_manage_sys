package params;



public class Parems {
	private static String username;
	private static String question_id;
	private static String user_grade="0";
	private static String reply_id;
	


	public static String getReply_id() {
		return reply_id;
	}

	public static void setReply_id(String reply_id) {
		Parems.reply_id = reply_id;
	}

	public static String getUser_grade() {
		return user_grade;
	}

	public static void setUser_grade(String user_grade) {
		Parems.user_grade = user_grade;
	}

	public static String getQuestion_id() {
		return question_id;
	}

	public static void setQuestion_id(String question_id) {
		Parems.question_id = question_id;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Parems.username = username;
	}
	
	
	

}
