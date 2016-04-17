
public class User {
	private String username;
	private char[] password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password.toCharArray();
	}
	
	public char[] returnPassword() {
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	

}
