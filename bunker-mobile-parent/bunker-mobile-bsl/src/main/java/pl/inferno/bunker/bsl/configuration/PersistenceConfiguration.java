/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.configuration
 * PersistenceConfiguration.java create at 1:17:46 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;


/**
 *  PersistenceConfiguration <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Configuration
@EnableJpaRepositories
public class PersistenceConfiguration extends JpaRepositoryConfigExtension {
	protected Logger logger = LoggerFactory.getLogger( PersistenceConfiguration.class );
	
	

}
