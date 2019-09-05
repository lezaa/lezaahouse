package com.keepzzz.film.controller.front;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.domain.Film;
import com.keepzzz.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pub")
public class PublicController {


    @Autowired
    private FilmService filmService;


    @RequestMapping("/index")
    public ApiResponse FilmList(@RequestParam(value = "page",defaultValue = "1") int page,
                                @RequestParam(value = "size",defaultValue = "8") int size){
        PageHelper.startPage(page,size);

        List<Film> allFilms = filmService.getAllFilms();
        PageInfo<Film> pageInfo  = new PageInfo<>(allFilms);
        Map<String,Object> data = new HashMap<>();
        data.put("totalPage",pageInfo.getPages());
        data.put("totalSize",pageInfo.getTotal());
        data.put("currentPage",page);
        data.put("data",pageInfo.getList());
        return ApiResponse.ofSuccess(data);
    }


}

