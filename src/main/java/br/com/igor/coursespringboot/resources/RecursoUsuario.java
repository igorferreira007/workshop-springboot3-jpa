package br.com.igor.coursespringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igor.coursespringboot.entities.Usuario;
import br.com.igor.coursespringboot.services.ServicoUsuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoUsuario {

	@Autowired
	private ServicoUsuario servico;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> procurarTodos() {
		List<Usuario> lista = servico.procurarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> procurarPorId(@PathVariable Long id) {
		Usuario obj = servico.procurarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
