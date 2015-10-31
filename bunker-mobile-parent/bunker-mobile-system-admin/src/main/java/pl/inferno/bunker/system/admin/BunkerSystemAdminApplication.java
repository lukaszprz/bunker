/**
 * bunker-mobile-system-admin
 * pl.inferno.bunker.system.admin
 * BunkerSystemAdminApplication.java create at 10:02:45 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.system.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BunkerSystemAdminApplication <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@SpringBootApplication

public class BunkerSystemAdminApplication {
	
	private static Logger logger = LoggerFactory.getLogger( BunkerSystemAdminApplication.class );
	
	/**
	 * <b>Method:</b><br/>
	 * main from BunkerSystemAdminApplication <br/>
	 *
	 * <b>Returns:</b><br/>
	 * void <br/>
	 * 
	 * <b>Description:</b><br/>
	 * TODO<i>&lt;insert description here&gt;</i>
	 *
	 * Created at 10:02:45 PM
	 *
	 * @param args
	 */
	public static void main( String[] args ) {
		
		logger.info( "========================================================================================" );
		logger.info( "                           Bunker System Admin" );
		logger.info( "========================================================================================" );
		
		SpringApplication.run( BunkerSystemAdminApplication.class, args );
		
		logger.info( "========================================================================================" );
		logger.info( "                   Bunker System Admin is now online!" );
		logger.info( "========================================================================================" );
		
	}
	
}
