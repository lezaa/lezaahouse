package com.keepzzz.film.domain;


import java.util.Date;

/**
 * 电影
 */

public class Film {

  private Long id;
  /**
   * 所在分类
   */
  private Long sortId;
  /**
   * 所在地区
   */
  private Long areaId;
  private String filmName;
  private Long filmTime;
  private String filmDirector;
  private String filmPlayers;
  private String filmIntro;
  private String filmLanguage;
  private Double filmPrice;
  /**
   * 上映时间
   */
  private Date playTime;
  private String filmPhoto;
  /**
   * 电影状态 1:正在上映  0:下架  2:即将上映
   */
  private Long statu;
  private double score;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSortId() {
    return sortId;
  }

  public void setSortId(Long sortId) {
    this.sortId = sortId;
  }

  public Long getAreaId() {
    return areaId;
  }

  public void setAreaId(Long areaId) {
    this.areaId = areaId;
  }

  public String getFilmName() {
    return filmName;
  }

  public void setFilmName(String filmName) {
    this.filmName = filmName;
  }

  public Long getFilmTime() {
    return filmTime;
  }

  public void setFilmTime(Long filmTime) {
    this.filmTime = filmTime;
  }

  public String getFilmDirector() {
    return filmDirector;
  }

  public void setFilmDirector(String filmDirector) {
    this.filmDirector = filmDirector;
  }

  public String getFilmPlayers() {
    return filmPlayers;
  }

  public void setFilmPlayers(String filmPlayers) {
    this.filmPlayers = filmPlayers;
  }

  public String getFilmIntro() {
    return filmIntro;
  }

  public void setFilmIntro(String filmIntro) {
    this.filmIntro = filmIntro;
  }

  public String getFilmLanguage() {
    return filmLanguage;
  }

  public void setFilmLanguage(String flimLanguage) {
    this.filmLanguage = flimLanguage;
  }

  public Double getFilmPrice() {
    return filmPrice;
  }

  public void setFilmPrice(Double filmPrice) {
    this.filmPrice = filmPrice;
  }

  public Date getPlayTime() {
    return playTime;
  }

  public void setPlayTime(Date playTime) {
    this.playTime = playTime;
  }

  public String getFilmPhoto() {
    return filmPhoto;
  }

  public void setFilmPhoto(String filmPhoto) {
    this.filmPhoto = filmPhoto;
  }

  public Long getStatu() {
    return statu;
  }

  public void setStatu(Long statu) {
    this.statu = statu;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
