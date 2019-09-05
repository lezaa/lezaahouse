package com.keepzzz.film;

import com.keepzzz.film.domain.Film;
import com.keepzzz.film.mapper.FilmMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmApplicationTests {

    @Autowired
    private FilmMapper filmMapper;

    @Test
    public void contextLoads() {
        List<Film> films = filmMapper.getAll();
        for (Film film : films) {
            System.out.println(film.getFilmName());
        }
    }

    @Test
    public void testSelect(){
        List<Film> flim = filmMapper.getAll();
        System.out.println(flim.size());
    }

}
