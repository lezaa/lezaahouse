package com.keepzzz.film.service;

import com.keepzzz.film.domain.Seat;

import java.util.List;

public interface SeatService {
    /**
     * 查询所有座位
     * @return
     */

    List<Seat> getSeats();

    /**
     * 根据id查询座位
     * @param id
     * @return
     */

    Seat getSeat(long id);

    /**
     * 添加座位
     * @return
     */


    boolean insert(Seat seat);

    /**
     * 修改座位
     * @param seat
     * @return
     */

    boolean update(Seat seat);
}
