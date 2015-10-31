/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.server.controller
 * BunkerUserController.java create at 11:05:22 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.inferno.bunker.lsl.client.service.BunkerClientService;
import pl.inferno.bunker.lsl.domain.User;

/**
 * BunkerUserController <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@Controller
@RequestMapping( "/api/user" )
public class BunkerUserController {
	
	protected Logger logger = LoggerFactory.getLogger( getClass() );
	
	@Autowired
	private BunkerClientService service;
	
	@RequestMapping( value = "/{username}" )
	@ResponseBody
	public User getBunkerUser( @PathVariable( value = "username" ) String username) {
		
		return service.getUser( username );
	}
}
