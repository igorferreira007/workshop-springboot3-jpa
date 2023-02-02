package br.com.igor.coursespringboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.igor.coursespringboot.entities.Usuario;
import br.com.igor.coursespringboot.repositories.RepositorioUsuario;

@Configuration
@Profile("test")
public class TesteConfiguracao implements CommandLineRunner {

	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		repositorioUsuario.saveAll(Arrays.asList(u1, u2));
	}
}
