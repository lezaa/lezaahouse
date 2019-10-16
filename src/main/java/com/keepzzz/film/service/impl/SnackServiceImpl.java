package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Snack;
import com.keepzzz.film.mapper.SnackMapper;
import com.keepzzz.film.service.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SnackServiceImpl implements SnackService {

    @Autowired
    private SnackMapper snackMapper;

    @Override
    public List<Snack> getSnacks() {
        return snackMapper.getSnacks();
    }

    @Override
    public Snack getSnack(Long id) {
        return snackMapper.getSnack(id);
    }

    @Override
    public boolean insert(Snack snack) {
        return snackMapper.insert(snack) >0;
    }

    @Override
    public boolean update(Snack snack) {
        return snackMapper.update(snack) >0;
    }
}
