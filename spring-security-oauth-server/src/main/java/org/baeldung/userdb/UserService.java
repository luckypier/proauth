package org.baeldung.userdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("primeUserDetailsService")
public class UserService implements UserDetailsService {
	
//	@Autowired
//	private UserRepository userRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		UserDetails UD = userRepository.findOneByUsername(username);
		
		UserDetails UD = customerRepository.findOneByDni(username);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>"+UD.getUsername());
		
		return UD;
	}
}