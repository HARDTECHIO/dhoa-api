package com.hardtech.doabookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardtech.doabookapi.models.Postagens;
import com.hardtech.doabookapi.repositories.PostagensRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/postagens")
public class PostagensController {

	@Autowired
	private PostagensRepository repository;

	@GetMapping
	public ResponseEntity<List<Postagens>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

}
