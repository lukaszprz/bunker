/**
 * bunker-core
 * pl.inferno.bunker.core.interfaces.service
 * BunkerClientService.java create at 8:52:41 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.core.interfaces.service;

/**
 * BunkerClientService <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
public interface BunkerClientService<T, K> {
	
	T get( K parameters );
	
	T post( K parameters );
	
	T put( K parameters );
	
	T delete( K parameters );
	
}
