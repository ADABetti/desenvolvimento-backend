package com.example.Pets.model;

public class Pet {
  private int id;
  private String nome;
  private String especie;
  private boolean jaFoiAdotado;

  // Construtor vazio:
  public Pet() {
  }

  // Construtor com parametros:
  public Pet(int id, String nome, String especie, boolean jaFoiAdotado) {
    this.id = id;
    this.nome = nome;
    this.especie = especie;
    this.jaFoiAdotado = jaFoiAdotado;
  }

  // getters and setters:

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public boolean isJaFoiAdotado() {
    return jaFoiAdotado;
  }

  public void setJaFoiAdotado(boolean jaFoiAdotado) {
    this.jaFoiAdotado = jaFoiAdotado;
  }

}
