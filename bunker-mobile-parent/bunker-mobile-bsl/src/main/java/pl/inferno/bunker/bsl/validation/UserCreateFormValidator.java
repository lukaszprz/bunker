/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.validation
 * UserCreateFormValidator.java create at 8:01:35 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import pl.inferno.bunker.bsl.form.UserCreateForm;
import pl.inferno.bunker.bsl.service.UserService;


/**
 *  UserCreateFormValidator <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Component
public class UserCreateFormValidator implements Validator {
	
	protected final Logger logger = LoggerFactory.getLogger( UserCreateFormValidator.class );
	
	private final UserService userService;
	
	/**
	 * Constructor for UserCreateFormValidator<br/>
	 *
	 * Create time: 8:03:59 AM<br/>
	 *
	 * @param userService
	 */
	@Autowired
	public UserCreateFormValidator( UserService userService ) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	public boolean supports( Class<?> clazz ) {
		
		return clazz.equals( UserCreateForm.class );
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	public void validate( Object target, Errors errors ) {
		
		UserCreateForm userCreateForm = (UserCreateForm) target;
		validatePasswords( errors, userCreateForm );
		validateEmail( errors, userCreateForm );
		
		
	}
	
	private void validatePasswords(Errors errors, UserCreateForm userCreateForm) {
		if (!userCreateForm.getPassword().equals( userCreateForm.getPasswordRepeated() )) {
			errors.reject( "password.no_match", "Password do not match." );
		}
	}
	
	private void validateEmail(Errors errors, UserCreateForm userCreateForm) {
		if (userService.findByEmail( userCreateForm.getEmail() ) != null) {
			errors.reject("email.exists", "User with this email already exists");
		}
	}
	
}
