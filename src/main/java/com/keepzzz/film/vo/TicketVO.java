package com.keepzzz.film.vo;


import com.keepzzz.film.domain.Seat;

import java.util.Date;

public class TicketVO {

    private String filmName;
    private Long hallId;
    private Double ticketPrice;
    private Date playTime;
    private String snackName;
    private Seat seat;

    public TicketVO() {
    }

    public TicketVO(String filmName, Long hallId, Double ticketPrice , Date playTime, String snackName, Seat seat) {
        this.filmName = filmName;
        this.hallId = hallId;
        this.ticketPrice = ticketPrice;
        this.playTime = playTime;
        this.snackName = snackName;
        this.seat = seat;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Long getHallId() {
        return hallId;
    }

    public void setHallId(Long hallId) {
        this.hallId = hallId;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "TicketVO{" +
                "filmName='" + filmName + '\'' +
                ", hallId=" + hallId +
                ", ticketPrice=" + ticketPrice +
                ", playTime=" + playTime +
                ", snackName='" + snackName + '\'' +
                ", seat=" + seat +
                '}';
    }
}
