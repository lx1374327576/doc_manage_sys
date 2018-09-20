package params;



public class Parems {
	private static String username;
	private static String question_id;
	private static String user_grade="0";
	private static String reply_id;
	private static String student_number;
	private static boolean flagall = false;
	private static boolean flagReply = false;
	private static int row;
	


	public static boolean isFlagReply() {
		return flagReply;
	}

	public static void setFlagReply(boolean flagReply) {
		Parems.flagReply = flagReply;
	}

	public static boolean isFlagall() {
		return flagall;
	}

	public static void setFlagall(boolean flag) {
		Parems.flagall = flag;
	}

	public static String getStudent_number() {
		return student_number;
	}

	public static void setStudent_number(String student_number) {
		Parems.student_number = student_number;
	}

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

	public static int getRow() {
		return row;
	}

	public static void setRow(int row) {
		Parems.row = row;
	}
	
	
	

}
