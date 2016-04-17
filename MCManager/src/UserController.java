
public class UserController {
	
	private User u;
        private boolean loggedIn;
	
	public UserController() {
		u = null;
                loggedIn = false;
		
	}

	public void createUser(String username, char[] password) {
		u = new User(username, password);
	}
	
	public void login() {
		String username = u.getUsername();
		char[] password = u.returnPassword(); 
	}
	
	public void storeUser() {
		
	}
}

