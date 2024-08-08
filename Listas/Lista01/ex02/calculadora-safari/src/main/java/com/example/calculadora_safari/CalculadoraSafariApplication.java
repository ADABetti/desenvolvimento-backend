package com.example.calculadora_safari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class CalculadoraSafariApplication {

	@GetMapping("/{quilometragem}")
	public String calcularPreco(@PathVariable String quilometragem) {
		int quilometroConvertido = Integer.parseInt(quilometragem);

		double precoTotal = quilometroConvertido * 25;

		return "O preco final de sua expedicao eh: " + precoTotal + " pratas";

	}

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraSafariApplication.class, args);
	}

}
