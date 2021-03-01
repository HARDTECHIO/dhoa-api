package com.hardtech.doabookapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardtech.doabookapi.repositories.PostagensRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/postagens")
public class PostagensController {

	@Autowired
	private PostagensRepository repository;

}
