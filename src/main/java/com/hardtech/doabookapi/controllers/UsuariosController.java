package com.hardtech.doabookapi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardtech.doabookapi.models.Usuarios;
import com.hardtech.doabookapi.models.UsuariosLogin;
import com.hardtech.doabookapi.repositories.UsuariosRepository;
import com.hardtech.doabookapi.service.UsuariosService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosService service;
	
	@Autowired
	private UsuariosRepository repository;
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuarios> findById(@PathVariable long id) {
		return repository.findById(id).map(obj-> ResponseEntity.ok().body(obj)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuarios> cadastrar(@RequestBody Usuarios usuario) {
		Optional<Usuarios> user = service.cadastrar(usuario);

		try {
			return ResponseEntity.ok(user.get());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuariosLogin> logar(@RequestBody Optional<UsuariosLogin> usuario) {
		return service.logar(usuario).map(obj -> ResponseEntity.ok(obj)).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	
	@PutMapping
	public ResponseEntity<Usuarios> update (@RequestBody Usuarios usuario){
		Optional<Usuarios> user = service.atualizarUsuario(usuario);
		
		try {
			return ResponseEntity.ok(user.get());
		}catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
