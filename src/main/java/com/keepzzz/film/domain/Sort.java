package com.keepzzz.film.domain;

/**
 * 影片分类
 */
public class Sort {

  private long id;
  private String sortName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

}
