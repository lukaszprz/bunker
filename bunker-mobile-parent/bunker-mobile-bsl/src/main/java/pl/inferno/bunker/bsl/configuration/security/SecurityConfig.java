/**
 * bunker-mobile-bsl
 * pl.inferno.bunker.bsl.configuration.security
 * SecurityConfig.java create at 9:57:06 AM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.bsl.configuration.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 *  SecurityConfig <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 *
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	protected final Logger logger = LoggerFactory.getLogger( SecurityConfig.class );
	
	@Autowired
	private UserDetailsService userDetailService;

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	public void configure( AuthenticationManagerBuilder auth ) throws Exception {
		
		auth
        .userDetailsService(userDetailService)
        .passwordEncoder(new BCryptPasswordEncoder());

	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure( HttpSecurity http ) throws Exception {
		
		http.authorizeRequests();
        http.formLogin()
        .loginPage("/login")
        .failureUrl("/login?error")
        .usernameParameter("email")
        .permitAll()
        .and()
        .logout()
        .logoutUrl("/logout")
        .logoutSuccessUrl("/")
        .permitAll();
	}
	
	
}
