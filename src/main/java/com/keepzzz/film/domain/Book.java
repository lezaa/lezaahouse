package com.keepzzz.film.domain;

/**
 * 票房
 */
public class Book {

  private Long id;
  private Long filmId;
  private Long fileCount;
  private Double totalPrice;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getFilmId() {
    return filmId;
  }

  public void setFilmId(Long filmId) {
    this.filmId = filmId;
  }

  public Long getFileCount() {
    return fileCount;
  }

  public void setFileCount(Long fileCount) {
    this.fileCount = fileCount;
  }

  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }
}
