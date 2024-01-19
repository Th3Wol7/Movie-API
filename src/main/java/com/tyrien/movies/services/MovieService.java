package com.tyrien.movies.services;

import com.tyrien.movies.domain.Movie;
import com.tyrien.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }


}
