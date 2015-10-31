/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl.client.service.impl
 * BunkerClientServiceImpl.java create at 10:51:03 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl.client.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pl.inferno.bunker.lsl.client.service.BunkerClientService;
import pl.inferno.bunker.lsl.domain.User;

/**
 * BunkerClientServiceImpl <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@Service
public class BunkerClientServiceImpl implements BunkerClientService {
	
	protected Logger logger = LoggerFactory.getLogger( getClass() );
	
	private static RestTemplate client;
	
	private String bunkerBslApiUrl;
	
	static {
		client = new RestTemplate();
	}
	
	/**
	 * Constructor for BunkerClientServiceImpl<br/>
	 *
	 * Create time: 10:54:31 PM<br/>
	 *
	 * @param bunkerBslApiUrl
	 */
	@Autowired
	public BunkerClientServiceImpl( String bunkerBslApiUrl ) {
		this.bunkerBslApiUrl = bunkerBslApiUrl;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pl.inferno.bunker.lsl.client.service.BunkerClientService#getUser(java.
	 * lang.String)
	 */
	@Override
	public User getUser( String username ) {
		
		String url = bunkerBslApiUrl + "user/" + username;
		return client.getForObject( url, User.class );
	}
	
}
