/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.client.service
 * BunkerClientService.java create at 10:48:54 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.client.service;

import pl.inferno.bunker.lsl.domain.User;

/**
 * BunkerClientService <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
public interface BunkerClientService {
	
	User getUser( String username );
}
