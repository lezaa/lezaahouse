package com.keepzzz.film.domain;

/**
 * 订单详情
 */
public class OrderDetail {

  private long id;
  private long orderId;
  private double filmId;
  private double snackId;
  private long seatId;
  private long filmCount;
  private long snackNum;
  private double orderPrice;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public double getFilmId() {
    return filmId;
  }

  public void setFilmId(double filmId) {
    this.filmId = filmId;
  }


  public double getSnackId() {
    return snackId;
  }

  public void setSnackId(double snackId) {
    this.snackId = snackId;
  }


  public long getSeatId() {
    return seatId;
  }

  public void setSeatId(long seatId) {
    this.seatId = seatId;
  }


  public long getFilmCount() {
    return filmCount;
  }

  public void setFilmCount(long filmCount) {
    this.filmCount = filmCount;
  }


  public long getSnackNum() {
    return snackNum;
  }

  public void setSnackNum(long snackNum) {
    this.snackNum = snackNum;
  }


  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }

}
