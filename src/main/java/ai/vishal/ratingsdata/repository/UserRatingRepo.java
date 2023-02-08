package ai.vishal.ratingsdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ai.vishal.ratingsdata.model.UserRating;

public interface UserRatingRepo extends MongoRepository<UserRating,String>{
    
}
