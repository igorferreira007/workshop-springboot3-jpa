package br.com.igor.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igor.coursespringboot.entities.Categoria;
import br.com.igor.coursespringboot.repositories.RepositorioCategoria;

@Service
public class ServicoCategoria {

	@Autowired
	private RepositorioCategoria repositorio;
	
	public List<Categoria> procurarTodos() {
		return repositorio.findAll();
	}
	
	public Categoria procurarPorId(Long id) {
		Optional<Categoria> obj = repositorio.findById(id);
		return obj.get();
	}
}
