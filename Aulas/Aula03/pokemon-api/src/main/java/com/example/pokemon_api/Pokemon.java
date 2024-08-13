package com.example.pokemon_api;

public class Pokemon {
  private int id;
  private String name;

  // construtor com parâmetros:
  public Pokemon(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // construtor vazio
  public Pokemon() {
  }

  // Getters and setters:

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // método adicionar pokemon:

}
