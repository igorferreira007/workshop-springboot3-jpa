package br.com.igor.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.coursespringboot.entities.Produto;

public interface RepositorioProduto extends JpaRepository<Produto, Long> {

}
