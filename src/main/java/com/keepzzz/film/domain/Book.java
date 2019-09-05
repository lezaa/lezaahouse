package com.keepzzz.film.domain;

/**
 * 票房
 */
public class Book {

  private long id;
  private long filmId;
  private long fileCount;
  private double totalPrice;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public long getFileCount() {
    return fileCount;
  }

  public void setFileCount(long fileCount) {
    this.fileCount = fileCount;
  }


  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

}
