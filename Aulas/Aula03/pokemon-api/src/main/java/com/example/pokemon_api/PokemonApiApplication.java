package com.example.pokemon_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
@SpringBootApplication
public class PokemonApiApplication {

	private static List<Pokemon> pokemons = new ArrayList<>();

	@GetMapping("/pokemons")
	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	@PostMapping
	public static String addPokemon(@RequestBody Pokemon pokemon) {
		for (Pokemon pokemonNaLista : pokemons) {
			if (pokemon.getId() == pokemonNaLista.getId()) {
				return "Pokemon na lista";
			}
		}
		pokemons.add(pokemon);
		return "Pokemon " + pokemon.getName() + " incluído na lista.";
	}

	public static void main(String[] args) {
		SpringApplication.run(PokemonApiApplication.class, args);
		pokemons.add(new Pokemon(1, "Ivy"));
		pokemons.add(new Pokemon(2, "Pikachu"));
		pokemons.add(new Pokemon(3, "Meow"));
	}
}
