package com.example.auction.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auction.service.ObraService;
import com.example.model.Obra;

@RequestMapping("/obras")
@RestController
public class ObraController {

  private ObraService obraService;

  @Autowired
  public ObraController(ObraService obraService) {
    this.obraService = obraService;
  }

  @GetMapping
  public ResponseEntity<List<Obra>> getAll() throws IOException {
    List<Obra> listaObras = obraService.listarObras();
    return ResponseEntity.status(200).body(listaObras);
  }

  @PostMapping
  public ResponseEntity<Obra> cadastrarNovaObra(@RequestBody Obra obra) throws IOException {
    Obra obraCadastrada = obraService.save(obra);
    if (obraCadastrada == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(obraCadastrada);
  }

  @PutMapping
  public ResponseEntity<Obra> update(@RequestBody Obra obra) throws IOException {
    Obra obraAtualizada = obraService.update(obra);

    if (obraAtualizada == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    return ResponseEntity.status(HttpStatus.OK).body(obraAtualizada);
  }
}
