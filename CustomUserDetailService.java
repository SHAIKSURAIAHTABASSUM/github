package com.sheryians.major.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.security.authentication.AuthenticationManager;

import com.sheryians.major.Repository.UserRepository;
import com.sheryians.major.model.CustomUserDetail;
import com.sheryians.major.model.User;
@Component
public class CustomUserDetailService  implements UserDetailsService{
@Autowired
UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user=userRepository.findUserByEmail(email);
		user.orElseThrow(()-> new UsernameNotFoundException("User not Found"));
		return user.map(CustomUserDetail::new).get();
	
		
	}
	


	
}

