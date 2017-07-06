package org.baeldung.config;

import org.baeldung.userdb.CustomerModel;
import org.baeldung.userdb.CustomerRepository;
import org.baeldung.userdb.User;
import org.baeldung.userdb.UserRepository;
import org.baeldung.userdb.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackageClasses = 
	{
		UserService.class
	})
@EnableJpaRepositories(basePackageClasses = 
	{
		UserRepository.class, CustomerRepository.class
	})
@EntityScan(basePackageClasses = {
		User.class, CustomerModel.class
	})
public class XonfigurationPersistance {


}