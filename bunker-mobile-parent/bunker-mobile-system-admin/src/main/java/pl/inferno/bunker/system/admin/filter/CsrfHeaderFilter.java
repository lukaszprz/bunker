/**
 * bunker-mobile-system-admin
 * pl.inferno.bunker.system.admin.filter
 * CsrfHeaderFilter.java create at 11:01:33 PM by lukasz
 * 
 *
 * @Copywrite 2015 lukasz. All rights reserved.
 */
package pl.inferno.bunker.system.admin.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

/**
 * CsrfHeaderFilter <br/>
 *
 * <b>Description:</b><br/>
 * TODO<i>&lt;insert description here&gt;</i>
 *
 * @author lukasz
 * 		
 */
public class CsrfHeaderFilter extends OncePerRequestFilter {
	
	protected Logger logger = LoggerFactory.getLogger( getClass() );
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	protected void doFilterInternal( HttpServletRequest request, HttpServletResponse response, FilterChain filterChain )
			throws ServletException, IOException {
			
		CsrfToken csrf = (CsrfToken) request.getAttribute( CsrfToken.class.getName() );
		
		if ( csrf != null ) {
			Cookie cookie = WebUtils.getCookie( request, "XSRF-TOKEN" );
			String token = csrf.getToken();
			
			logger.info( "Token: " + token );
			
			if ( cookie == null || token != null && !token.equals( cookie.getValue() ) ) {
				cookie = new Cookie( "XSRF-TOKEN", token );
				cookie.setPath( "/" );
				response.addCookie( cookie );
				
				logger.info( "Setting new cookie with the name: " + cookie.getName() );
				logger.info( "Cookie value: " + cookie.getValue() );
			}
		}
		filterChain.doFilter( request, response );
	}
	
}
