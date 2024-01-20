package com.tyrien.movies.repositories;

import com.tyrien.movies.domain.Movie;
import com.tyrien.movies.domain.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {


}
