package com.hardtech.doabookapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardtech.doabookapi.models.Postagens;

public interface PostagensRepository extends JpaRepository<Postagens, Long> {
	public List<Postagens> findAllByTituloContainingIgnoreCase(String titulo);

	public List<Postagens> findAllByTextoContainingIgnoreCase(String texto);
}
