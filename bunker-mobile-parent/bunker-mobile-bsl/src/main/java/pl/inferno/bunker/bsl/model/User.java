/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.model
 * User.java create at 3:37:58 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name = "users", schema = "bunker_schema")
public class User implements Serializable {

	/**
	 * Field serialVersionUID of type long
	 */
	private static final long serialVersionUID = 832449602992889084L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@OneToOne(targetEntity = Role.class)	
	private Role role;
		
	@Column
	private Boolean active;
	
	@Column
	private Timestamp createTime;
	
	@Column
	private String createdBy;
	
	@Column
	private Timestamp validTo;
	
	@Column
	private Timestamp modificationTime;
	
	@Column
	private String modifyBy;

	
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
	 * Getter for id
	 *
	 * @return the id
	 */
	public Long getId() {
		
		return id;
	}

	/**
	 * Getter for active
	 *
	 * @return the active
	 */
	public Boolean getActive() {
		
		return active;
	}


	
	/**
	 * Setter for active
	 *
	 * @param active the active to set
	 */
	public void setActive( Boolean active ) {
		
		this.active = active;
	}


	
	/**
	 * Getter for createTime
	 *
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		
		return createTime;
	}


	
	/**
	 * Setter for createTime
	 *
	 * @param createTime the createTime to set
	 */
	public void setCreateTime( Timestamp createTime ) {
		
		this.createTime = createTime;
	}


	
	/**
	 * Getter for createdBy
	 *
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		
		return createdBy;
	}


	
	/**
	 * Setter for createdBy
	 *
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy( String createdBy ) {
		
		this.createdBy = createdBy;
	}


	
	/**
	 * Getter for validTo
	 *
	 * @return the validTo
	 */
	public Timestamp getValidTo() {
		
		return validTo;
	}


	
	/**
	 * Setter for validTo
	 *
	 * @param validTo the validTo to set
	 */
	public void setValidTo( Timestamp validTo ) {
		
		this.validTo = validTo;
	}


	
	/**
	 * Getter for modificationTime
	 *
	 * @return the modificationTime
	 */
	public Timestamp getModificationTime() {
		
		return modificationTime;
	}

	
	/**
	 * Setter for modificationTime
	 *
	 * @param modificationTime the modificationTime to set
	 */
	public void setModificationTime( Timestamp modificationTime ) {
		
		this.modificationTime = modificationTime;
	}


	
	/**
	 * Getter for modifyBy
	 *
	 * @return the modifyBy
	 */
	public String getModifyBy() {
		
		return modifyBy;
	}


	
	/**
	 * Setter for modifyBy
	 *
	 * @param modifyBy the modifyBy to set
	 */
	public void setModifyBy( String modifyBy ) {
		
		this.modifyBy = modifyBy;
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
	 * Getter for role
	 *
	 * @return the role
	 */
	public Role getRole() {
		
		return role;
	}


	
	/**
	 * Setter for role
	 *
	 * @param role the role to set
	 */
	public void setRole( Role role ) {
		
		this.role = role;
	}


	
	
	

}
