package com.example.psflix.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.psflix.model.Midia;

// conexão com banco de dados
public class MidiaRepository {
  private List<Midia> midias = new ArrayList<>();

  public MidiaRepository() {
    midias.add(new Midia(1, "Titanic", "Filme"));
  }

  public List<Midia> getAll() {
    return midias;
  }

  public void save(Midia midia) {
    midias.add(midia);
  }
}
