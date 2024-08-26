package com.example.Pets.service;

import java.util.List;

import com.example.Pets.model.Pet;
import com.example.Pets.repository.PetRepository;

public class PetService {

  private PetRepository repository = new PetRepository();

  public List<Pet> listarPets() throws Exception {
    return repository.getAll();
  }

  public String cadastrarPet(Pet pet) throws Exception {
    if (repository.save(pet)) {
      return "Pet " + pet.getNome() + " com id " + pet.getId() + " foi cadastrado no sistema.";
    }
    return "Pets devem ter ids únicos.";
  }
}
