package com.example.ilhas_de_calor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class IlhasDeCalorApplication {

	List<IlhaDeCalor> ilhas = new ArrayList<>();

	// método get com o caminho "ilhas-de-calor".
	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> listarIlhasDeCalor() {
		return ilhas;
	}

	// Método post com o caminho "ilhas-de-calor"
	@PostMapping("/ilhas-de-calor")
	public String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilhaDeCalor) {
		ilhas.add(ilhaDeCalor);
		return "Ilha de calor " + ilhaDeCalor.getBairro() + " adicionada com sucesso.";
	}

	public static void main(String[] args) {
		SpringApplication.run(IlhasDeCalorApplication.class, args);
	}
}
