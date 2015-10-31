/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.domain
 * Role.java create at 9:43:48 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Role <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *		
 */
@JsonIgnoreProperties( ignoreUnknown = true )
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
		/**
		 * Field ROLE_ADMIN of type Roles
		 */
		ROLE_ADMIN,
		/**
		 * Field ROLE_USER of type Roles
		 */
		ROLE_USER,
		/**
		 * Field ROLE_REST of type Roles
		 */
		ROLE_REST,
		/**
		 * Field ROLE_WEB of type Roles
		 */
		ROLE_WEB,
		/**
		 * Field ROLE_MOBILE of type Roles
		 */
		ROLE_MOBILE
	}
	
	/**
	 * Field id of type Long
	 */
	private Long id;
	
	/**
	 * Field name of type String
	 */
	private String name;
	
	/**
	 * Field permissionList of type List<Permission>
	 */
	private List<Permission> permissionList;
	
	/**
	 * Getter for id
	 *
	 * @return the id
	 */
	public Long getId() {
		
		return id;
	}
	
	/**
	 * Setter for id
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId( Long id ) {
		
		this.id = id;
	}
	
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
	 * @param name
	 *            the name to set
	 */
	public void setName( String name ) {
		
		this.name = name;
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
	 * @param permissionList
	 *            the permissionList to set
	 */
	public void setPermissionList( List<Permission> permissionList ) {
		
		this.permissionList = permissionList;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
		result = prime * result + ( ( permissionList == null ) ? 0 : permissionList.hashCode() );
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj ) {
		
		if ( this == obj ) {
			return true;
		}
		if ( obj == null ) {
			return false;
		}
		if ( !( obj instanceof Role ) ) {
			return false;
		}
		Role other = (Role) obj;
		if ( id == null ) {
			if ( other.id != null ) {
				return false;
			}
		} else if ( !id.equals( other.id ) ) {
			return false;
		}
		if ( name == null ) {
			if ( other.name != null ) {
				return false;
			}
		} else if ( !name.equals( other.name ) ) {
			return false;
		}
		if ( permissionList == null ) {
			if ( other.permissionList != null ) {
				return false;
			}
		} else if ( !permissionList.equals( other.permissionList ) ) {
			return false;
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return this.getClass().getName() + "{" + "id='" + this.id + "', " + "name='" + this.name + "', "
				+ "permissionList='" + this.permissionList + "'" + "}";
	}
	
}
