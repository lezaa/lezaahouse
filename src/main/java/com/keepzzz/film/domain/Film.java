package com.keepzzz.film.domain;


import java.util.Date;

/**
 * 电影
 */

public class Film {

  private long id;
  private long sortId;
  private long areaId;
  private String filmName;
  private long filmTime;
  private String filmDirector;
  private String filmPlayers;
  private String filmIntro;
  private String flimLanguage;
  private double filmPrice;
  private Date playTime;
  private String filmPhoto;
  private long statu;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSortId() {
    return sortId;
  }

  public void setSortId(long sortId) {
    this.sortId = sortId;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public String getFilmName() {
    return filmName;
  }

  public void setFilmName(String filmName) {
    this.filmName = filmName;
  }


  public long getFilmTime() {
    return filmTime;
  }

  public void setFilmTime(long filmTime) {
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


  public String getFlimLanguage() {
    return flimLanguage;
  }

  public void setFlimLanguage(String flimLanguage) {
    this.flimLanguage = flimLanguage;
  }


  public double getFilmPrice() {
    return filmPrice;
  }

  public void setFilmPrice(double filmPrice) {
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


  public long getStatu() {
    return statu;
  }

  public void setStatu(long statu) {
    this.statu = statu;
  }

}
