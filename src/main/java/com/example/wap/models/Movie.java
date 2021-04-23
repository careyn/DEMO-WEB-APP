package com.example.wap.models;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private String poster;
  private String imdbID;

  public void setTitle(String new_movie) {
    this.title = new_movie;
  }
}

