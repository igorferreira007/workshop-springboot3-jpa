package br.com.igor.coursespringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igor.coursespringboot.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoUsuario {

	@GetMapping
	public ResponseEntity<Usuario> procurarTodos() {
		Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
