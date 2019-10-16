package com.keepzzz.film.domain;


import java.util.Date;

/**
 * 电影票
 */
public class Ticket {

  private Long id;
  private Long filmId;
  private Long hallId;
  private Date createTime;
  private Long seatId;
  private Double ticketPrice;
  private Long orderId;
  private Long userId;
  private Seat seat;

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

  public Long getHallId() {
    return hallId;
  }

  public void setHallId(Long hallId) {
    this.hallId = hallId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Long getSeatId() {
    return seatId;
  }

  public void setSeatId(Long seatId) {
    this.seatId = seatId;
  }

  public Double getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(Double ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Seat getSeat() {
    return seat;
  }

  public void setSeat(Seat seat) {
    this.seat = seat;
  }
}
