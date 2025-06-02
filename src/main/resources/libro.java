package com.adecco.biblioteca.proyecto_final;


import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


public class Libro {
  // Entidades

// Libro

@Entity
@Table(name = "libros")
public  class Libro {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private String autor;
private Integer numeroPaginas;
private Boolean disponible;

// Constructor vacio
public Libro() {}

// Constructor con parametros

public Libro(String titulo, String autor, Integer numeroPaginas, Boolean disponible) {

this.titulo = titulo;
this.autor = autor;
this.numeroPaginas = numeroPaginas;
this.disponible = disponible;

}

// Getters y setters

public Long getId() {
  return id;
}

public void setId(Long id) {
  this.id = id;
}
public String getTitulo() {
  return titulo;
}

public void setTitulo(String titulo) {
  this.titulo = titulo;
}

public String getAutor() {
  return autor;
}

public void setAutor(String autor) {
  this.autor = autor;
}

public Integer getNumeroPaginas() {
  return numeroPaginas;
}

public void setNumeroPaginas(Integer numeroPaginas) {
  this.numeroPaginas = numeroPaginas;
}

public Boolean getDisponible() {
  return disponible;
}

public void setDisponible(Boolean disponible) {
  this.disponible = disponible;
}

// Metodo toString

@Override
public String toString() {
  return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
      + ", disponible=" + disponible + "]";
}






}  
}
