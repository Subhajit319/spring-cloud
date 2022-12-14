package com.example.java.practice.mydemoproject.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.java.practice.mydemoproject.service.CustomUserDetailsService;
import com.example.java.practice.mydemoproject.util.JwtUtil;

@Component
public class JwtFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {	
	
			String authorizationHearder=request.getHeader("Authorization");
			String token=null;
			String userName=null;
			if(authorizationHearder!=null && authorizationHearder.startsWith("Bearer ")) {				
				
			token=authorizationHearder.substring(7);				
			userName=jwtUtil.extractUsername(token);
			
				
			}
			
			if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null){
			UserDetails userDetails=	customUserDetailsService.loadUserByUsername(userName);
			
			if (jwtUtil.validateToken(token, userDetails)) {

                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        filterChain.doFilter(request, response);
    }
				
		
}
	

