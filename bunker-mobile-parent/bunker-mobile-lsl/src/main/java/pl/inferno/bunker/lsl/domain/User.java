/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.domain
 * User.java create at 9:37:18 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * User <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class User {
	
	/**
	 * Field id of type Long
	 */
	private Long id;
	
	/**
	 * Field username of type String
	 */
	private String username;
	
	/**
	 * Field email of type String
	 */
	private String email;
	
	/**
	 * Field password of type String
	 */
	private String password;
	
	/**
	 * Field role of type Role
	 */
	private Role role;
	
	/**
	 * Field active of type Boolean
	 */
	private Boolean active;
	
	/**
	 * Field createTime of type Timestamp
	 */
	private Timestamp createTime;
	
	/**
	 * Field createdBy of type String
	 */
	private String createdBy;
	
	/**
	 * Field validTo of type Timestamp
	 */
	private Timestamp validTo;
	
	/**
	 * Field modificationTime of type Timestamp
	 */
	private Timestamp modificationTime;
	
	/**
	 * Field modifyBy of type String
	 */
	private String modifyBy;
	
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
	 * @param username
	 *            the username to set
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
	 * @param email
	 *            the email to set
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
	 * @param password
	 *            the password to set
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
	 * @param role
	 *            the role to set
	 */
	public void setRole( Role role ) {
		
		this.role = role;
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
	 * @param active
	 *            the active to set
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
	 * @param createTime
	 *            the createTime to set
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
	 * @param createdBy
	 *            the createdBy to set
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
	 * @param validTo
	 *            the validTo to set
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
	 * @param modificationTime
	 *            the modificationTime to set
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
	 * @param modifyBy
	 *            the modifyBy to set
	 */
	public void setModifyBy( String modifyBy ) {
		
		this.modifyBy = modifyBy;
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
		result = prime * result + ( ( active == null ) ? 0 : active.hashCode() );
		result = prime * result + ( ( createTime == null ) ? 0 : createTime.hashCode() );
		result = prime * result + ( ( createdBy == null ) ? 0 : createdBy.hashCode() );
		result = prime * result + ( ( email == null ) ? 0 : email.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( modificationTime == null ) ? 0 : modificationTime.hashCode() );
		result = prime * result + ( ( modifyBy == null ) ? 0 : modifyBy.hashCode() );
		result = prime * result + ( ( password == null ) ? 0 : password.hashCode() );
		result = prime * result + ( ( role == null ) ? 0 : role.hashCode() );
		result = prime * result + ( ( username == null ) ? 0 : username.hashCode() );
		result = prime * result + ( ( validTo == null ) ? 0 : validTo.hashCode() );
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
		if ( !( obj instanceof User ) ) {
			return false;
		}
		User other = (User) obj;
		if ( active == null ) {
			if ( other.active != null ) {
				return false;
			}
		} else if ( !active.equals( other.active ) ) {
			return false;
		}
		if ( createTime == null ) {
			if ( other.createTime != null ) {
				return false;
			}
		} else if ( !createTime.equals( other.createTime ) ) {
			return false;
		}
		if ( createdBy == null ) {
			if ( other.createdBy != null ) {
				return false;
			}
		} else if ( !createdBy.equals( other.createdBy ) ) {
			return false;
		}
		if ( email == null ) {
			if ( other.email != null ) {
				return false;
			}
		} else if ( !email.equals( other.email ) ) {
			return false;
		}
		if ( id == null ) {
			if ( other.id != null ) {
				return false;
			}
		} else if ( !id.equals( other.id ) ) {
			return false;
		}
		if ( modificationTime == null ) {
			if ( other.modificationTime != null ) {
				return false;
			}
		} else if ( !modificationTime.equals( other.modificationTime ) ) {
			return false;
		}
		if ( modifyBy == null ) {
			if ( other.modifyBy != null ) {
				return false;
			}
		} else if ( !modifyBy.equals( other.modifyBy ) ) {
			return false;
		}
		if ( password == null ) {
			if ( other.password != null ) {
				return false;
			}
		} else if ( !password.equals( other.password ) ) {
			return false;
		}
		if ( role == null ) {
			if ( other.role != null ) {
				return false;
			}
		} else if ( !role.equals( other.role ) ) {
			return false;
		}
		if ( username == null ) {
			if ( other.username != null ) {
				return false;
			}
		} else if ( !username.equals( other.username ) ) {
			return false;
		}
		if ( validTo == null ) {
			if ( other.validTo != null ) {
				return false;
			}
		} else if ( !validTo.equals( other.validTo ) ) {
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
		
		return this.getClass().getName() + "{" + "id='" + this.id + "', " + "username='" + this.username + "', "
				+ "email='" + this.email + "', " + "password='" + this.password + "', " + "role='" + this.role + "', "
				+ "active='" + this.active + "', " + "createTime='" + this.createTime + "', " + "createdBy='"
				+ this.createdBy + "', " + "validTo='" + this.validTo + "', " + "modificationTime='"
				+ this.modificationTime + "', " + "modifyBy='" + this.modifyBy + "', " + "}";
	}
	
}
