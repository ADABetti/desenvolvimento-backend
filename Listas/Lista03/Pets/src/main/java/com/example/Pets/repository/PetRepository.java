package com.example.Pets.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.Pets.model.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {

  private static final int ZERO_BYTES = 0;

  // caminho em que o novo arquivo ficará salvo:
  private File arquivo = new File("Pets/src/main/resources/database/tb_pets.json");

  // Permite que manipulemos arquivos (JACKSON):
  private ObjectMapper objectMapper = new ObjectMapper();

  public List<Pet> getAll() throws Exception {
    // verificar se arquivo existe:
    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    List<Pet> pets = null;

    if (arquivo.length() > ZERO_BYTES) {
      pets = objectMapper.readValue(arquivo, new TypeReference<ArrayList<Pet>>() {
      });
    } else {
      pets = new ArrayList<>();
    }
    return pets;
  }

  public boolean save(Pet pet) throws Exception {
    List<Pet> pets = this.getAll();

    for (Pet petNoBanco : pets) {
      if (petNoBanco.getId() == pet.getId()) {
        return false;
      }
    }
    pets.add(pet);
    objectMapper.writeValue(arquivo, pets);
    return true;
  }
}
