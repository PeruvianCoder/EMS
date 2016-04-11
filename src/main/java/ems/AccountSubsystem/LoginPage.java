package ems.AccountSubsystem;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class LoginPage {

	/**
	 * Captcha field on the form.
	 */
	public String captcha;
	/**
	 * Password field on the form.
	 */
	public String password;
	/**
	 * Username field in the form. 
	 */
	public String username;
	/**
	 * Getter of captcha
	 */
	public String getCaptcha() {
	 	 return captcha; 
	}
	/**
	 * Setter of captcha
	 */
	public void setCaptcha(String captcha) { 
		 this.captcha = captcha; 
	}
	/**
	 * Getter of password
	 */
	public String getPassword() {
	 	 return password; 
	}
	/**
	 * Setter of password
	 */
	public void setPassword(String password) { 
		 this.password = password; 
	}
	/**
	 * Getter of username
	 */
	public String getUsername() {
	 	 return username; 
	}
	/**
	 * Setter of username
	 */
	public void setUsername(String username) { 
		 this.username = username; 
	}
	/**
	 * This is when the login page should be rendered and returned to the user.
	 */
	public void display() { 
		// TODO Auto-generated method
	 }
	/**
	 * Hyperlink to submit the login form. Should result in the user being 
	 * logged in and redirected to the landing page.
	 * @param username From username field.
	 * @param captcha From captcha field.
	 * @param password From password field.
	 */
	public void login(String username, String captcha, String password) { 
		// TODO Auto-generated method
	 } 

}
