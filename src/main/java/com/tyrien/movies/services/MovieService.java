package com.tyrien.movies.services;

import com.tyrien.movies.domain.Movie;
import com.tyrien.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
* This class(service classes) is where most of the business logic
* is kept. This class uses the repository to communicate with the database
* to retrieve the data it needs
* */
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String imdbId){//Return type optional since findByIdmethod may return null
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
