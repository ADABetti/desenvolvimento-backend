package com.example.ola_mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class OlaMundoApplication {

	@GetMapping("/nome/{nome}")
	public String cumprimentar(@PathVariable("nome") String nome) {
		return "Olá " + nome;
	}

	@GetMapping("/idade/{numero}")
	public String verificarIdade(@PathVariable("numero") String numero) {
		int idade = Integer.parseInt(numero);

		if (idade < 18) {
			return "Menor de idade.";
		} else {
			return "Maior de idade.";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}

}
