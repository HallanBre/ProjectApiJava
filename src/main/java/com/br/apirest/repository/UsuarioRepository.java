package com.br.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.apirest.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository< Usuario ,Integer> {
    Usuario findById(int id);
}
