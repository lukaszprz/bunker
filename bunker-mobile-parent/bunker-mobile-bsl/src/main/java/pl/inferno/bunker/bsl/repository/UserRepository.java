/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.repository
 * UserRepository.java create at 7:13:21 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import pl.inferno.bunker.bsl.model.User;

/**
 * UserRepository <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *		
 */
@PreAuthorize( "hasRole('ROLE_USER')" )
public interface UserRepository extends CrudRepository<User, Long> {
	
	Optional<User> findOneByUsername( String username );
	
	Optional<User> findOneByEmail( String email );
	
	@PreAuthorize( "hasRole('ROLE_ADMIN')" )
	User save( User user );
	
	@PreAuthorize( "hasRole('ROLE_ADMIN')" )
	@Override
	void delete( Long aLong );
	
}
