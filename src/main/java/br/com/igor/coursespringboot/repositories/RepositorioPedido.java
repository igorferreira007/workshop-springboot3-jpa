package br.com.igor.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.coursespringboot.entities.Pedido;

public interface RepositorioPedido extends JpaRepository<Pedido, Long> {

}
