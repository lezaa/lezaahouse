package com.keepzzz.film.domain;

/**
 * 零食
 */
public class Snack {

  private long id;
  private String snackName;
  private double snackPrice;
  private long snackStore;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSnackName() {
    return snackName;
  }

  public void setSnackName(String snackName) {
    this.snackName = snackName;
  }


  public double getSnackPrice() {
    return snackPrice;
  }

  public void setSnackPrice(double snackPrice) {
    this.snackPrice = snackPrice;
  }


  public long getSnackStore() {
    return snackStore;
  }

  public void setSnackStore(long snackStore) {
    this.snackStore = snackStore;
  }

}
