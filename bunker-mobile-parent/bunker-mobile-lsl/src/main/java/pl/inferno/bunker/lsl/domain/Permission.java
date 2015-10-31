/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.domain
 * Permission.java create at 9:45:48 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Permission <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *		
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class Permission {
	
	/**
	 * Field id of type Long
	 */
	private Long id;
	
	/**
	 * Field name of type String
	 */
	private String name;
	
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
		if ( !( obj instanceof Permission ) ) {
			return false;
		}
		Permission other = (Permission) obj;
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
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return this.getClass().getName() + "{" + "id='" + this.id + "', " + "name='" + this.name + "'" + "}";
	}
	
}
