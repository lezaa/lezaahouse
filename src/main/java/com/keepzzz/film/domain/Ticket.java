package com.keepzzz.film.domain;


import java.util.Date;

/**
 * 电影票
 */
public class Ticket {

  private long id;
  private long filmId;
  private long hallId;
  private Date createTime;
  private String seatId;
  private double ticketPrice;
  private long orderId;


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


  public long getHallId() {
    return hallId;
  }

  public void setHallId(long hallId) {
    this.hallId = hallId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public String getSeatId() {
    return seatId;
  }

  public void setSeatId(String seatId) {
    this.seatId = seatId;
  }


  public double getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(double ticketPrice) {
    this.ticketPrice = ticketPrice;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

}
