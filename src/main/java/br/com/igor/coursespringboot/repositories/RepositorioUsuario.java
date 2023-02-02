package br.com.igor.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.coursespringboot.entities.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

}
