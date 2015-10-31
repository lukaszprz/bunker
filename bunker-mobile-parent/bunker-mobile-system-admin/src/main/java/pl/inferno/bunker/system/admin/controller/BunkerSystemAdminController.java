/**
 * bunker-mobile-system-admin
 * pl.inferno.bunker.system.admin.controller
 * BunkerSystemAdminController.java create at 10:10:22 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.system.admin.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BunkerSystemAdminController <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@RestController
public class BunkerSystemAdminController {
	
	protected Logger logger = LoggerFactory.getLogger( getClass() );
	
	@RequestMapping( "/resource" )
	public Map<String, Object> home() {
		
		ResponseEntity<T>
		
		Map<String, Object> model = new HashMap<>();
		model.put( "id", UUID.randomUUID() );
		model.put( "content", "Manage System Users in Bunker systems" );
		return model;
	}
	
	@RequestMapping( "/user" )
	public Principal user( Principal user ) {
		
		return user;
	}
	
}
