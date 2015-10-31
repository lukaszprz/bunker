/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.web.controller
 * UsersController.java create at 7:48:13 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.inferno.bunker.bsl.service.UserService;

/**
 *  UsersController <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Controller
public class UsersController {
	
	protected Logger logger = LoggerFactory.getLogger( UsersController.class );
	
	private final UserService userService;

	/**
	 * Constructor for UsersController<br/>
	 *
	 * Create time: 7:49:42 AM<br/>
	 *
	 * @param userService
	 */
	@Autowired
	public UsersController( UserService userService ) {
		this.userService = userService;
		logger.debug( " ### @Controller UsersController.init()" );
		logger.debug( " # userService: " + userService.toString() );
		logger.debug( " ###" );
	}
	
	@RequestMapping("/users")
	public ModelAndView getUsersPage() {
		logger.debug( " ### @Controller UsersController.getUsersPage(\"/users\")" );
		return new ModelAndView( "users", "users", userService.getAllUsers() );
	}

}
