/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.service.impl
 * UserServiceImpl.java create at 7:22:00 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pl.inferno.bunker.bsl.form.UserCreateForm;
import pl.inferno.bunker.bsl.model.User;
import pl.inferno.bunker.bsl.repository.UserRepository;
import pl.inferno.bunker.bsl.service.UserService;


/**
 *  UserServiceImpl <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	protected Logger logger = LoggerFactory.getLogger( UserServiceImpl.class );
	
	private final UserRepository userRepository;
	
	/**
	 * Constructor for UserServiceImpl<br/>
	 *
	 * Create time: 7:24:28 AM<br/>
	 *
	 * @param userRepository
	 */
	@Autowired
	public UserServiceImpl( UserRepository userRepository ) {
		this.userRepository = userRepository;
	}

	/* (non-Javadoc)
	 * @see pl.inferno.bunker.bsl.service.UserService#findByUsername(java.lang.String)
	 */
	public Optional<User> findByUsername( String username ) {
				
		return userRepository.findOneByUsername( username );
	}
	
	/* (non-Javadoc)
	 * @see pl.inferno.bunker.bsl.service.UserService#findByEmail(java.lang.String)
	 */
	public Optional<User> findByEmail( String email ) {
		
		return userRepository.findOneByEmail( email );
	}
	
	/* (non-Javadoc)
	 * @see pl.inferno.bunker.bsl.service.UserService#getUserById(java.lang.Long)
	 */
	public User getUserById( Long id ) {
		
		return userRepository.findOne( id );
	}
	
	/* (non-Javadoc)
	 * @see pl.inferno.bunker.bsl.service.UserService#getAllUsers()
	 */
	public List<User> getAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}
	
	/* (non-Javadoc)
	 * @see pl.inferno.bunker.bsl.service.UserService#create(pl.inferno.bunker.bsl.form.UserCreateForm)
	 */
	public User create( UserCreateForm form ) {
		
		User user = new User();
		user.setUsername( form.getUsername() );
		user.setEmail( form.getEmail() );
		user.setPassword( new BCryptPasswordEncoder().encode( form.getPassword() ) );
		
		return userRepository.save( user );
	}
	
}
