package br.com.igor.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igor.coursespringboot.entities.Pedido;
import br.com.igor.coursespringboot.repositories.RepositorioPedido;

@Service
public class ServicoPedido {

	@Autowired
	private RepositorioPedido repositorio;
	
	public List<Pedido> procurarTodos() {
		return repositorio.findAll();
	}
	
	public Pedido procurarPorId(Long id) {
		Optional<Pedido> obj = repositorio.findById(id);
		return obj.get();
	}
}
