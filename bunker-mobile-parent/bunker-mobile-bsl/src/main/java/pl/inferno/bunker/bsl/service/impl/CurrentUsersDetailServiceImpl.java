/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.service.impl
 * CurrentUsersDetailServiceImpl.java create at 10:33:39 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pl.inferno.bunker.bsl.model.User;
import pl.inferno.bunker.bsl.service.UserService;


/**
 *  CurrentUsersDetailServiceImpl <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Service
public class CurrentUsersDetailServiceImpl implements UserDetailsService {
	
	protected final Logger logger = LoggerFactory.getLogger( CurrentUsersDetailServiceImpl.class );
	
	private final UserService userService;
	
	/**
	 * Constructor for CurrentUsersDetailServiceImpl<br/>
	 *
	 * Create time: 10:35:54 AM<br/>
	 *
	 * @param userService
	 */
	@Autowired
	public CurrentUsersDetailServiceImpl( UserService userService ) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {
		logger.debug( " # Authenticating user with username " + username );
		Optional<User> user = userService.findByUsername( username );
		return null;
	}
	
}
