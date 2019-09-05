package com.keepzzz.film.domain;

/**
 * 影厅
 */
public class Hall {

  private long id;
  private String hallName;
  private long hallNum;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getHallName() {
    return hallName;
  }

  public void setHallName(String hallName) {
    this.hallName = hallName;
  }


  public long getHallNum() {
    return hallNum;
  }

  public void setHallNum(long hallNum) {
    this.hallNum = hallNum;
  }

}
