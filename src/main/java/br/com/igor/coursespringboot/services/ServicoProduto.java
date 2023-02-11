package br.com.igor.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igor.coursespringboot.entities.Produto;
import br.com.igor.coursespringboot.repositories.RepositorioProduto;

@Service
public class ServicoProduto {

	@Autowired
	private RepositorioProduto repositorio;
	
	public List<Produto> procurarTodos() {
		return repositorio.findAll();
	}
	
	public Produto procurarPorId(Long id) {
		Optional<Produto> obj = repositorio.findById(id);
		return obj.get();
	}
}
