package com.hardtech.doabookapi.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hardtech.doabookapi.models.Usuarios;
import com.hardtech.doabookapi.repositories.UsuariosRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuariosRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuarios> user = repository.findByEmail(username);
		user.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		return user.map(UserDetailsImpl::new).get();
	}

}
