/**
 * bunker-mobile-lsl
 * pl.inferno.bunker.lsl
 * BunkerLogicServiceLayerApplication.java create at 8:19:41 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.lsl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import pl.inferno.bunker.lsl.domain.Permission;
import pl.inferno.bunker.lsl.domain.Role;
import pl.inferno.bunker.lsl.domain.User;

/**
 * BunkerLogicServiceLayerApplication <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@SpringBootApplication
public class BunkerLogicServiceLayerApplication {
	
	/**
	 * Field logger of type Logger
	 */
	private static Logger logger = LoggerFactory.getLogger( BunkerLogicServiceLayerApplication.class );
	
	@Autowired
	private Environment env;
	
	/**
	 * <b>Method:</b><br/>
	 * main from BunkerLogicServiceLayerApplication <br/>
	 *
	 * <b>Returns:</b><br/>
	 * void <br/>
	 * 
	 * <b>Description:</b><br/>
	 * TODO<i>&lt;insert description here&gt;</i>
	 *
	 * Created at 8:19:42 PM
	 *
	 * @param args
	 */
	public static void main( String[] args ) {
		
		logger.info( "========================================================================================" );
		logger.info( "                           Bunker Logic Service Layer" );
		logger.info( "========================================================================================" );
		
		SpringApplication.run( BunkerLogicServiceLayerApplication.class, args );
		
		logger.info( "========================================================================================" );
		logger.info( "                   Bunker Logic Service Layer is now online!" );
		logger.info( "========================================================================================" );
		
		logger.debug( "Runing some tests:" );
		Permission permission = new Permission();
		Role role = new Role();
		User user = new User();
		logger.debug( "Permission [" + permission.hashCode() + "]: " + permission.toString() );
		logger.debug( "Role [" + role.hashCode() + "]: " + role.toString() );
		logger.debug( "User [" + user.hashCode() + "]: " + user.toString() );
		
	}
	
	@Bean
	public String bunkerBslApiUrl() {
		
		return env.getProperty( "bunker.bsl.api.url" );
	}
	
}
