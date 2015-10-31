/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.model
 * Permission.java create at 5:16:25 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  Permission <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Entity
@Table(name = "permissions", schema = "bunker_schema")
public class Permission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;

	
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

}
