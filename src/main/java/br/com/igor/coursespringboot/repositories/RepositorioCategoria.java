package br.com.igor.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.coursespringboot.entities.Categoria;

public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {

}
