package ai.vishal.ratingsdata.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ai.vishal.ratingsdata.model.UserRating;
import ai.vishal.ratingsdata.repository.UserRatingRepo;

@RestController
public class RatingsController {

    @Autowired
    UserRatingRepo userRatingRepo;

    @GetMapping("/user/rating/{userId}")
    public UserRating getRatingByMovie(@PathVariable String userId){
        return userRatingRepo.findById(userId).orElseThrow();
    }
}
