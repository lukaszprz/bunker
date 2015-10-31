/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.web.controller
 * HomeController.java create at 7:45:00 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  HomeController <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Controller
public class HomeController {

	protected Logger logger = LoggerFactory.getLogger( HomeController.class );
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home";
	}
}
