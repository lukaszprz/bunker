/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.form
 * UserCreateForm.java create at 5:39:44 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.form;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import pl.inferno.bunker.bsl.model.Role;

/**
 *  UserCreateForm <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
public class UserCreateForm {
	
	@NotEmpty
	private String username = "";
	
	@NotEmpty
	private String email = "";
	
	@NotEmpty
	private String password = "";
	
	@NotEmpty
	private String passwordRepeated = "";
	
	@NotNull
	private Set<Role> roles = new HashSet<Role>();

	
	/**
	 * Getter for username
	 *
	 * @return the username
	 */
	public String getUsername() {
		
		return username;
	}

	
	/**
	 * Setter for username
	 *
	 * @param username the username to set
	 */
	public void setUsername( String username ) {
		
		this.username = username;
	}

	
	/**
	 * Getter for email
	 *
	 * @return the email
	 */
	public String getEmail() {
		
		return email;
	}

	
	/**
	 * Setter for email
	 *
	 * @param email the email to set
	 */
	public void setEmail( String email ) {
		
		this.email = email;
	}

	
	/**
	 * Getter for password
	 *
	 * @return the password
	 */
	public String getPassword() {
		
		return password;
	}

	
	/**
	 * Setter for password
	 *
	 * @param password the password to set
	 */
	public void setPassword( String password ) {
		
		this.password = password;
	}

	
	/**
	 * Getter for passwordRepeated
	 *
	 * @return the passwordRepeated
	 */
	public String getPasswordRepeated() {
		
		return passwordRepeated;
	}

	
	/**
	 * Setter for passwordRepeated
	 *
	 * @param passwordRepeated the passwordRepeated to set
	 */
	public void setPasswordRepeated( String passwordRepeated ) {
		
		this.passwordRepeated = passwordRepeated;
	}

	
	/**
	 * Getter for roles
	 *
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		
		return roles;
	}

	
	/**
	 * Setter for roles
	 *
	 * @param roles the roles to set
	 */
	public void setRoles( Set<Role> roles ) {
		
		this.roles = roles;
	}

}
