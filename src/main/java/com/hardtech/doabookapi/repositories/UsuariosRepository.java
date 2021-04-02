package com.hardtech.doabookapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardtech.doabookapi.models.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Optional<Usuarios> findByEmail(String email);
}
