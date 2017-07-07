package org.baeldung.config;

import org.baeldung.userdb.CustomerModel;
import org.baeldung.userdb.CustomerRepository;
import org.baeldung.userdb.User;
import org.baeldung.userdb.UserRepository;
import org.baeldung.userdb.UserService;
import org.baeldung.web.controller.BarController;
import org.baeldung.web.controller.DummyController;
import org.baeldung.web.controller.FooController;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = 
	{
		UserService.class,
		BarController.class,
		DummyController.class,
		FooController.class
	})
@EnableJpaRepositories(basePackageClasses = 
	{
		UserRepository.class, CustomerRepository.class
	})
@EntityScan(basePackageClasses = {
		User.class, CustomerModel.class
	})
public class ConfigurationClass extends WebMvcConfigurerAdapter{


}