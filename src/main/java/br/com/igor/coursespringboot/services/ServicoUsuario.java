package br.com.igor.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.igor.coursespringboot.entities.Usuario;
import br.com.igor.coursespringboot.repositories.RepositorioUsuario;
import br.com.igor.coursespringboot.services.exceptions.DatabaseException;
import br.com.igor.coursespringboot.services.exceptions.ResourceNotFoundException;

@Service
public class ServicoUsuario {

	@Autowired
	private RepositorioUsuario repositorio;
	
	public List<Usuario> procurarTodos() {
		return repositorio.findAll();
	}
	
	public Usuario procurarPorId(Long id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Usuario inserir(Usuario obj) {
		return repositorio.save(obj);
	}
	
	public void excluir(Long id) {
		try {
			repositorio.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Usuario atualizar(Long id, Usuario obj) {
		Usuario entidade = repositorio.getReferenceById(id);
		atualizarDados(entidade, obj);
		return repositorio.save(entidade);
	}

	private void atualizarDados(Usuario entidade, Usuario obj) {
		entidade.setNome(obj.getNome());
		entidade.setEmail(obj.getEmail());
		entidade.setTelefone(obj.getTelefone());
	}
}
