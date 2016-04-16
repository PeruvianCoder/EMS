package ems.DataSubsystem;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a user object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.UserRepository}.
 * @author emsTeam
 */
public class User {
	
	/**
	 * Unique identifier of each user.
	 */
	public int id;
	/**
	 * The profile picture uploaded by this user, if any.
	 */
	public byte[] ProfilePic;
	/**
	 * Full address of the user.
	 */
	public String address;
	/**
	 * Full name of the user.
	 */
	public String name;
	/**
	 * Role of the user.
	 */
	public String role;
	/**
	 * Short description of the user describing about himself.
	 */
	public String aboutMe;
	/**
	 * Date of birth of the user.
	 */
	public String dateOfBirth;
	/**
	 * Preferred phone number provided by the user.
	 */
	public String phoneNumber;
	/**
	 * Login password for the user. 
	 */
	public String password;
	/**
	 * Login username created by the user.
	 */
	public String username;
	/**
	 * Preferred email address of the user.
	 */
	public String email;
	/**
	 * Getter of Id
	 */
	public int getId(){
		return id;
	}
	/**
	 * Getter of ProfilePic
	 */
	public byte[] getProfilePic() {
	 	 return ProfilePic; 
	}
	/**
	 * Setter of ProfilePic
	 */
	public void setProfilePic(byte[] ProfilePic) { 
		 this.ProfilePic = ProfilePic; 
	}
	/**
	 * Getter of address
	 */
	public String getAddress() {
	 	 return address; 
	}
	/**
	 * Setter of address
	 */
	public void setAddress(String address) { 
		 this.address = address; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Getter of role
	 */
	public String getRole() {
	 	 return role; 
	}
	/**
	 * Setter of role
	 */
	public void setRole(String role) { 
		 this.role = role; 
	}
	/**
	 * Getter of aboutMe
	 */
	public String getAboutMe() {
	 	 return aboutMe; 
	}
	/**
	 * Setter of aboutMe
	 */
	public void setAboutMe(String aboutMe) { 
		 this.aboutMe = aboutMe; 
	}
	/**
	 * Getter of dateOfBirth
	 */
	public String getDateOfBirth() {
	 	 return dateOfBirth; 
	}
	/**
	 * Setter of dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) { 
		 this.dateOfBirth = dateOfBirth; 
	}
	/**
	 * Getter of phoneNumber
	 */
	public String getPhoneNumber() {
	 	 return phoneNumber; 
	}
	/**
	 * Setter of phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) { 
		 this.phoneNumber = phoneNumber; 
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
	 * Getter of email
	 */
	public String getEmail() {
	 	 return email; 
	}
	/**
	 * Setter of email
	 */
	public void setEmail(String email) { 
		 this.email = email; 
	} 

}
