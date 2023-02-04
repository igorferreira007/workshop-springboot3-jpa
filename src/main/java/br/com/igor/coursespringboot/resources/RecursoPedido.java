package br.com.igor.coursespringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igor.coursespringboot.entities.Pedido;
import br.com.igor.coursespringboot.services.ServicoPedido;

@RestController
@RequestMapping(value = "/pedidos")
public class RecursoPedido {

	@Autowired
	private ServicoPedido servico;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> procurarTodos() {
		List<Pedido> lista = servico.procurarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> procurarPorId(@PathVariable Long id) {
		Pedido obj = servico.procurarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
