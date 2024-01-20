package com.tyrien.movies.controllers;

import com.tyrien.movies.domain.Movie;
import com.tyrien.movies.services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*
 * This class(controller classes) represents the  API layer. It is responsible for getting a request from the user and
 * returning a response. It delegates task to a service and gives what is returned in the API layer.
 * It does not know what is happening inside the service class.
 * */


@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(){
        return new ResponseEntity<List<Movie>>( movieService.getMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovie(imdbId), HttpStatus.OK);
    }
}
