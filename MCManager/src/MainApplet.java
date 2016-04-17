import java.applet.Applet;

public class MainApplet extends Applet{
	private static UserController u;
        private static GUI g;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		u = new UserController();
                g = new GUI();
                g.setVisible(true);
		
		// TODO Auto-generated method stub

	}
        
        public static UserController getUserController() {
            return u;
        }
	


}
