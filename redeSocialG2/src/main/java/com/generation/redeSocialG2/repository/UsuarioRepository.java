package com.generation.redeSocialG2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.redeSocialG2.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>
{
	Optional<UsuarioModel> findByEmail(String email);
}
