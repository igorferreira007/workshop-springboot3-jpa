package br.com.igor.coursespringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igor.coursespringboot.entities.Categoria;
import br.com.igor.coursespringboot.services.ServicoCategoria;

@RestController
@RequestMapping(value = "/categorias")
public class RecursoCategoria {

	@Autowired
	private ServicoCategoria servico;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> procurarTodos() {
		List<Categoria> lista = servico.procurarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> procurarPorId(@PathVariable Long id) {
		Categoria obj = servico.procurarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
