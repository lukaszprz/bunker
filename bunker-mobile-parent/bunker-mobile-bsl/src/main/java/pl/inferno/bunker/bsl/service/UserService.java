/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.service
 * UserService.java create at 7:11:49 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.service;

import java.util.List;
import java.util.Optional;

import pl.inferno.bunker.bsl.form.UserCreateForm;
import pl.inferno.bunker.bsl.model.User;

/**
 *  UserService <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
public interface UserService {
	
	Optional<User> findByUsername(String username);
	
	Optional<User> findByEmail(String email);
	
	User getUserById(Long id);
	
	List<User> getAllUsers();
	
	User create(UserCreateForm form);

}
