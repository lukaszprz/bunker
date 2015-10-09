/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.repository
 * UserRepository.java create at 9:41:20 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pl.inferno.bunker.bsl.model.User;


/**
 *  UserRepository <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername(@Param("username") String username);

}
