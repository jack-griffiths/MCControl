
public class UserController {
	
	private User u;
	
	public UserController() {
		u = null;
		
	}

	public void createUser(String username, String password) {
		u = new User(username, password);
	}
	
	public void login() {
		String username = u.getUsername();
		char[] password = u.returnPassword(); 
	}
	
	public void storeUser() {
		
	}
}

