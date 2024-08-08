package com.example.senhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class SenhasApplication {

	@GetMapping("/{senha}")
	public String verificarSenha(@PathVariable("senha") String senha) {
		if (senha.equals("senha123")) {
			return "Entrada autorizada.";
		}
		return "Entrada não autorizada";
	}

	public static void main(String[] args) {
		SpringApplication.run(SenhasApplication.class, args);
	}

}
