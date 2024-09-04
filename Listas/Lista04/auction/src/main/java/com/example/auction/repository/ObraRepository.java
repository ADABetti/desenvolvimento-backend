package com.example.auction.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Obra;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ObraRepository {

  private static final int ZERO_BYTES = 0;
  private ObjectMapper objectMapper = new ObjectMapper();
  private File arquivo = new File("src/main/resources/database/tb_obras.json");

  // método verifica se arquivo existe.
  // se arquivo não existe, crie um novo arquivo e retorne a lista vazia.
  // se arquivo existe, leia o arquivo considerando a referência<Obra> e retorne a
  // lista.
  public List<Obra> getAll() throws IOException {
    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    if (arquivo.length() > ZERO_BYTES) {
      return objectMapper.readValue(arquivo, new TypeReference<List<Obra>>() {
      });
    }

    return new ArrayList<>();
  }

  public boolean save(Obra obra) throws IOException {
    List<Obra> obras = this.getAll();

    for (Obra obraNoDataBase : obras) {
      if (obra.getId() == obraNoDataBase.getId()) {

        return false;
      }
    }

    obras.add(obra);
    objectMapper.writeValue(arquivo, obras);
    return true;
  }

  public boolean update(Obra obra) throws IOException {
    List<Obra> obras = this.getAll();
    for (Obra obraNoDataBase : obras) {
      if (obra.getId() == obraNoDataBase.getId()) {
        obraNoDataBase.setNome(obra.getNome());
        obraNoDataBase.setAutor(obra.getAutor());
        obraNoDataBase.setPreco(obra.getPreco());
        obraNoDataBase.setJaFoiVendida(obra.getJaFoiVendida());
        objectMapper.writeValue(arquivo, obras);
        return true;
      }
    }
    return false;
  }
}
