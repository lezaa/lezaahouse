package com.keepzzz.film.controller.front;

import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.domain.Area;
import com.keepzzz.film.domain.Film;
import com.keepzzz.film.dto.FilmDTO;
import com.keepzzz.film.service.AreaService;
import com.keepzzz.film.service.FilmService;
import com.keepzzz.film.service.SortService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.keepzzz.film.enums.Status.NOT_VALID_PARAM;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController {

    @Autowired
    private AreaService areaService;

    @Autowired
    private FilmService filmService;

    @Autowired
    private SortService sortService;

    @RequestMapping("/areas")
    public ApiResponse findAreas(){
        List<Area> allAreas = areaService.getAllAreas();
        return ApiResponse.ofSuccess(allAreas);
    }


    /**
     * 获取指定的电影信息
     * @param filmId
     * @return
     */
    @RequestMapping("/{id}")
    public ApiResponse FilmInfo(@PathVariable("id") long filmId){

        Film film = filmService.getFilmInfo(filmId);
        FilmDTO filmDTO = new FilmDTO();
        if(film != null){
            //TODO 电影评分
            BeanUtils.copyProperties(film,filmDTO);
            filmDTO.setZone(areaService.getArea(film.getAreaId()).getZone());
            filmDTO.setSortName(sortService.SortInfo(film.getSortId()).getSortName());
            return ApiResponse.ofSuccess(filmDTO);
        }
        return ApiResponse.ofStatus(NOT_VALID_PARAM);
    }


    /**
     * 按照状态获取电影列表
     * @param state
     * @return
     */
    @RequestMapping("/state/{state}")
    public ApiResponse FilmsState(@PathVariable("state") long state){
        List<Film> films = filmService.stateFilm(state);
        if(films != null){
            List<FilmDTO> filmDTOS = films.stream().map(e -> new FilmDTO(
                    sortService.SortInfo(e.getSortId()).getSortName(),areaService.getArea(e.getAreaId()).getZone(),
                    e.getFilmName(),e.getFilmTime(),e.getFilmDirector(),e.getFilmPlayers(),e.getFilmIntro(),
                    e.getFilmLanguage(),e.getPlayTime(),e.getFilmPhoto(),e.getScore()
            )).collect(Collectors.toList());
            return ApiResponse.ofSuccess(filmDTOS);
        }
        return ApiResponse.ofStatus(NOT_VALID_PARAM);
    }


}

