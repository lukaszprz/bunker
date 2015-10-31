/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.web.controller
 * UserObjectController.java create at 7:58:52 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.web.controller;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.inferno.bunker.bsl.form.UserCreateForm;
import pl.inferno.bunker.bsl.service.UserService;
import pl.inferno.bunker.bsl.validation.UserCreateFormValidator;

/**
 *  UserObjectController <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Controller
public class UserObjectController {

	protected Logger logger = LoggerFactory.getLogger( UserObjectController.class );
	
	private final UserService userService;
	
	private final UserCreateFormValidator userCreateFormValidator;

	/**
	 * Constructor for UserObjectController<br/>
	 *
	 * Create time: 8:02:16 AM<br/>
	 *
	 * @param userService
	 * @param userCreateFormValidator
	 */
	@Autowired
	public UserObjectController( UserService userService, UserCreateFormValidator userCreateFormValidator ) {
		this.userService = userService;
		this.userCreateFormValidator = userCreateFormValidator;
		
		logger.debug( " ### @Controller UserObjectController.init()" );
		logger.debug( " # userService: " + userService.toString() );
		logger.debug( " # userCreateFormValidator: " + userCreateFormValidator.toString() );
		logger.debug( " ###" );
	}
	
	@InitBinder("form")
	public void initBinder(WebDataBinder binder) {
		logger.debug( " ### @Controller UserObjectController.initBinder()" );
		binder.addValidators( userCreateFormValidator );
	}
	
	@RequestMapping("/user/{id}")
	public ModelAndView getUserPage(@PathVariable Long id) {
		logger.debug( " ### @Controller UserObjectController.getUserPage(\"/user/{id}\")" );
		ModelAndView modelAndView = new ModelAndView("user", "user", userService.getUserById( id ));
		return modelAndView;
	}
	
	@RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public ModelAndView getUserCreatePage() {
		logger.debug( " ### @Controller UserObjectController.getUserCreatePage(\"/user/create\")" );
        return new ModelAndView("user_create", "form", new UserCreateForm());
    }
	
	@RequestMapping(value = "/user/create", method = RequestMethod.POST)
	public String handleUserCreateForm(@Valid @ModelAttribute("form") UserCreateForm form, BindingResult bindingResult) {
		logger.debug( " ### @Controller UserObjectController.handleUserCreateForm(\"/user/create\")" );
		if (bindingResult.hasErrors()) {
			logger.debug( " ### @Controller UserObjectController.handleUserCreateForm() -> bindingResult.hasErrors(). RETURN TO user_create" );
			return "user_create";
		}
		
		try {
			userService.create( form );
		} catch ( DataIntegrityViolationException e ) {
			logger.debug( " ### @Controller UserObjectController.handleUserCreateForm() -> DataIntegrityViolationException. RETURN TO user_create" );
			bindingResult.reject("user.exists", "User already exists");
			logger.error( "User already exists.", e );
            return "user_create";
		}
		
		logger.debug( " ### @Controller UserObjectController.handleUserCreateForm() -> OK. redirect:/users" );
		
		return "redirect:/users";
	}
}
