package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Seat;
import com.keepzzz.film.mapper.SeatMapper;
import com.keepzzz.film.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatMapper seatMapper;

    @Override
    public List<Seat> getSeats() {
        return seatMapper.getSeats();
    }

    @Override
    public Seat getSeat(long id) {
        return seatMapper.getSeat(id);
    }

    @Override
    public boolean insert(Seat seat) {
        return seatMapper.insert(seat) > 0;
    }

    @Override
    public boolean update(Seat seat) {
        return seatMapper.update(seat) > 0;
    }
}
