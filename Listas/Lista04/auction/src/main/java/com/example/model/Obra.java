package com.example.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Obra {
  private int id;
  private String nome;
  private String autor;
  private BigDecimal preco;

  @JsonProperty("ja_foi_vendida")
  private boolean jaFoiVendida;

  // Constructor vazio
  public Obra() {
  }

  // Constructor
  public Obra(int id, String nome, String autor, BigDecimal preco, boolean jaFoiVendida) {
    this.id = id;
    this.nome = nome;
    this.autor = autor;
    this.preco = preco;
    this.jaFoiVendida = jaFoiVendida;
  }

  // Getter and setters
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public BigDecimal getPreco() {
    return this.preco;
  }

  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

  public boolean getJaFoiVendida() {
    return this.jaFoiVendida;
  }

  public void setJaFoiVendida(boolean jaFoiVendida) {
    this.jaFoiVendida = jaFoiVendida;
  }
}
