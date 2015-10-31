/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl
 * BunkerBusinessServiceLayerApplication.java create at 12:45:32 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *  BunkerBusinessServiceLayerApplication <br/>
 *
 * <b>Description:</b><br/>
 * 
 * Bunker Business Service Layer maine Spring executable class.
 *
 * @author lukasz
 *
 */
@SpringBootApplication
@EnableJpaRepositories
public class BunkerBusinessServiceLayerApplication {
			
	/**
	 * Field logger of type Logger
	 */
	private static Logger logger = LoggerFactory.getLogger( BunkerBusinessServiceLayerApplication.class );
	
	/**
	 * <b>Method:</b><br/> main from BunkerBusinessServiceLayerApplication <br/>
	 *
	 * <b>Returns:</b><br/> void <br/>
	 * 
	 * <b>Description:</b><br/>
	 * Main executable method used by the Spring Boot to rise the application.
	 *
	 * Created at 12:45:32 AM
	 *
	 * @param args
	 */
	public static void main( String[] args ) {
		
		logger.info( "========================================================================================" );
		logger.info( "                           Bunker Business Service Layer" );
		logger.info( "========================================================================================" );
		
		SpringApplication.run( BunkerBusinessServiceLayerApplication.class, args );
		
		logger.info( "========================================================================================" );
		logger.info( "                   Bunker Business Service Layer is now online!" );
		logger.info( "========================================================================================" );
		
		
	}

	
}
