package br.com.igor.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.coursespringboot.entities.ItemPedido;

public interface RepositorioItemPedido extends JpaRepository<ItemPedido, Long> {

}
