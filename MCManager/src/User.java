
public class User {
	private String username;
	private char[] password;
	
	public User(String username, char[] password) {
		this.username = username;
		this.password = password;
	}
	
	public char[] returnPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
	

}
