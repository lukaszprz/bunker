/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.model
 * Role.java create at 3:44:29 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *  Role <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Entity
@Table(name = "roles", schema = "bunker_schema")
public class Role {
	
	/**
	 * Role Roles <br/>
	 *
	 * <b>Description:</b><br/>
	 * TODO<i>&lt;insert description here&gt;</i>
	 *
	 * @author lukasz
	 *
	 */
	public enum Roles {
		ROLE_ADMIN, ROLE_USER, ROLE_REST, ROLE_WEB, ROLE_MOBILE
	}
	
	/**
	 * Field id of type Long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	/**
	 * Field name of type String
	 */
	@Column(nullable = false, unique = true)
	private String name;
	
	@OneToMany(targetEntity = Permission.class)
	private List<Permission> permissionList;
			
	/**
	 * Getter for name
	 *
	 * @return the name
	 */
	public String getName() {
		
		return name;
	}

	
	/**
	 * Setter for name
	 *
	 * @param name the name to set
	 */
	public void setName( String name ) {
		
		this.name = name;
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
	 * Getter for permissionList
	 *
	 * @return the permissionList
	 */
	public List<Permission> getPermissionList() {
		
		return permissionList;
	}


	
	/**
	 * Setter for permissionList
	 *
	 * @param permissionList the permissionList to set
	 */
	public void setPermissionList( List<Permission> permissionList ) {
		
		this.permissionList = permissionList;
	}

		
}
