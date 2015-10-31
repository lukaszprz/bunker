/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.model
 * CurrentUser.java create at 10:41:44 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.model;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 *  CurrentUser <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User {
	
	public CurrentUser( String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities ) {
		super( username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities );
		// TODO Auto-generated constructor stub
	}

	/**
	 * Field serialVersionUID of type long
	 */
	private static final long serialVersionUID = 7432571718028887264L;
	private User user;

	/**
	 * Constructor for CurrentUser<br/>
	 *
	 * Create time: 10:42:53 AM<br/>
	 *
	 * @param username
	 * @param password
	 * @param authorities
	 * @param user
	 */
//	public CurrentUser( User user ) {
////		super( user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList( user.getRoles().iterator().next().getName() ) );
//		this.user = user;
//	}

	
	/**
	 * Getter for user
	 *
	 * @return the user
	 */
	public User getUser() {
		
		return user;
	}
	
	public Long getId() {
		return user.getId();
	}
		
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.User#toString()
	 */
	@Override
	public String toString() {
		
		return "CurrentUser{" +
				"user=" + user +
				"} " + super.toString();
	}

}
