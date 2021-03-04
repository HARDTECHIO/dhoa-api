package com.hardtech.doabookapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hardtech.doabookapi.models.Usuarios;
import com.hardtech.doabookapi.repositories.UsuariosRepository;

@Service
public class UsuariosService {

	@Autowired
	private UsuariosRepository repository;

	public Optional<Usuarios> cadastrar(Usuarios usuario) {
		
		if(repository.findByUsuarios(usuario.getEmail()).isPresent()) {
			return null;
		}
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		
		usuario.setSenha(senhaEncoder);
		
		return Optional.of(repository.save(usuario));
	}
}
