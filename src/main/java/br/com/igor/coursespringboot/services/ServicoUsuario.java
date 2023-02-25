package br.com.igor.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igor.coursespringboot.entities.Usuario;
import br.com.igor.coursespringboot.repositories.RepositorioUsuario;

@Service
public class ServicoUsuario {

	@Autowired
	private RepositorioUsuario repositorio;
	
	public List<Usuario> procurarTodos() {
		return repositorio.findAll();
	}
	
	public Usuario procurarPorId(Long id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.get();
	}
	
	public Usuario inserir(Usuario obj) {
		return repositorio.save(obj);
	}
}
