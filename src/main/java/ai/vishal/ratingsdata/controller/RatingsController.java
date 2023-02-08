package ai.vishal.ratingsdata.controller;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ai.vishal.ratingsdata.model.Rating;
import ai.vishal.ratingsdata.model.UserRating;
import ai.vishal.ratingsdata.repository.UserRatingRepo;

@RestController
public class RatingsController {

    @Autowired
    UserRatingRepo userRatingRepo;

    @GetMapping("/user/rating/{userId}")
    public UserRating getRatingByMovie(@PathVariable String userId){
        userRatingRepo.save(new UserRating(userId,Arrays.asList(new Rating("123", 4),new Rating("1234", 5))));
        return userRatingRepo.findById(userId).orElseThrow();
    }
}
