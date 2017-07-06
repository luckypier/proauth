package org.baeldung.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	public WebSecurityConfig() {
		super(true);
	}

//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {// @formatter:off
//        auth.inMemoryAuthentication().
//            withUser("john").password("123").roles("USER").
//            and().
//            withUser("tom").password("111").roles("ADMIN");
//    }// @formatter:on
	
	
    //NEW>>>>>>>>>>>>>>>>>>>>>>>>>
  @Autowired
	@Qualifier("primeUserDetailsService")
	private UserDetailsService userDetailsService;
  
  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  protected void configure(final AuthenticationManagerBuilder auth) throws Exception {// @formatter:off
      auth
      	.userDetailsService(userDetailsService);
//      	.passwordEncoder(passwordEncoder);
  }// @formatter:on
  
  
  @Override
  public UserDetailsService userDetailsServiceBean() throws Exception {
      return userDetailsService;
  }
  
  //NEW<<<<<<<<<<<<<<<<<<<<<<<<<

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // @formatter:off
        http.authorizeRequests()
            .antMatchers("/login").permitAll()
            .anyRequest().authenticated()
            .and().formLogin().permitAll()
            ;
        // @formatter:on
    }

}
