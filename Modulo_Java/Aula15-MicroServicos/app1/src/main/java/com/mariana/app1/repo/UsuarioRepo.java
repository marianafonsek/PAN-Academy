package com.mariana.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariana.app1.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}