package com.keepzzz.film.domain;

/**
 * 座位
 */
public class Seat {

  private long id;
  private long hallId;
  private long row;
  private long num;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getHallId() {
    return hallId;
  }

  public void setHallId(long hallId) {
    this.hallId = hallId;
  }


  public long getRow() {
    return row;
  }

  public void setRow(long row) {
    this.row = row;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }

}
