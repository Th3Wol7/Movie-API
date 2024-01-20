package com.tyrien.movies.repositories;

import com.tyrien.movies.domain.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
* The repositories represent a "data access layer" for the API.
* It communicates with the database to read and write data.*/
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Framework auto implements this method body based on it's name
    Optional<Movie> findMovieByImdbId(String imdbId);

}
