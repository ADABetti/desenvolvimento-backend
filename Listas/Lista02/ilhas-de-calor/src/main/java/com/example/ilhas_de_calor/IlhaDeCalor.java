package com.example.ilhas_de_calor;

public class IlhaDeCalor {
  private int id;
  private String bairro;
  private String zona;

  // construtor vazio para JSON:
  public IlhaDeCalor() {
  }

  // Construtor com parâmetros:
  public IlhaDeCalor(int id, String bairro, String zona) {
    this.id = id;
    this.bairro = bairro;
    this.zona = zona;
  }

  // Getter and setters:
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getZona() {
    return zona;
  }

  public void setZona(String zona) {
    this.zona = zona;
  }

}
