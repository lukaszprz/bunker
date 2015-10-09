/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl
 * User.java create at 9:31:46 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  User <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Entity
public class User {
	
	/**
	 * Field id of type long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	/**
	 * Field username of type String
	 */
	private String username;
	
	/**
	 * Field password of type String
	 */
	private String password;

	
	/**
	 * Getter for id
	 *
	 * @return the id
	 */
	public long getId() {
		
		return id;
	}

	
	/**
	 * Setter for id
	 *
	 * @param id the id to set
	 */
	public void setId( long id ) {
		
		this.id = id;
	}

	
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

}
