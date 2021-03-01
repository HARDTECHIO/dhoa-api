package com.hardtech.doabookapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardtech.doabookapi.models.Postagens;

public interface PostagensRepository extends JpaRepository<Postagens, Long> {
	
}
