package com.example.tech1test.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class JWTSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests(authz -> authz
//                        .antMatchers(HttpMethod.GET, "/api/**").hasAuthority("SCOPE_read")
//                        .antMatchers(HttpMethod.POST, "/api").hasAuthority("SCOPE_write")
//                        .anyRequest().authenticated())
//                .oauth2ResourceServer(oauth2 -> oauth2.jwt());
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/h2-console/**").permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}

