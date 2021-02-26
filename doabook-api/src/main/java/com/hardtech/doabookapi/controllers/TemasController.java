package com.hardtech.doabookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardtech.doabookapi.models.Temas;
import com.hardtech.doabookapi.repositories.TemasRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/temas")
public class TemasController {

	@Autowired
	private TemasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Temas>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	
}
