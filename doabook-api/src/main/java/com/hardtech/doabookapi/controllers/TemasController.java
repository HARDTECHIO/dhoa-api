package com.hardtech.doabookapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardtech.doabookapi.repositories.TemasRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/temas")
public class TemasController {

	@Autowired
	private TemasRepository repository;
	
	
}
