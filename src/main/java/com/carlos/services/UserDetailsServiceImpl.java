package com.carlos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import com.carlos.entity.UserEntity;
import com.carlos.repository.UserRP;


import org.springframework.security.core.userdetails.User;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private  UserRP userRP;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<UserEntity> userEntity = userRP.findByUserName(userName);
        if (userEntity == null) {
        
            throw new UsernameNotFoundException(userName);
        }
        
        Set<GrantedAuthority> grantedAuthority = new HashSet<>();
        return new User(userEntity.get().getUserName(), userEntity.get().getPassword(), grantedAuthority);
       
	}


}
