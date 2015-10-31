/**
 * bunker-mobile-system-admin
 * pl.inferno.bunker.system.admin.configuration
 * BunkerSystemAdminSecurityConfiguration.java create at 10:50:15 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.system.admin.configuration;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

import pl.inferno.bunker.system.admin.filter.CsrfHeaderFilter;

/**
 * BunkerSystemAdminSecurityConfiguration <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
@Configuration
@Order( SecurityProperties.ACCESS_OVERRIDE_ORDER )
public class BunkerSystemAdminSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.config.annotation.web.configuration.
	 * WebSecurityConfigurerAdapter#configure(org.springframework.security.
	 * config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure( HttpSecurity http ) throws Exception {
		
		http.httpBasic().and().authorizeRequests().antMatchers( "/index.html", "/home.html", "/login.html", "/" )
				.permitAll().anyRequest().authenticated().and().csrf().csrfTokenRepository( csrfTokenRepository() )
				.and().addFilterAfter( new CsrfHeaderFilter(), CsrfFilter.class );
	}
	
	private CsrfTokenRepository csrfTokenRepository() {
		
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName( "X-XSRF-TOKEN" );
		return repository;
	}
	
}
