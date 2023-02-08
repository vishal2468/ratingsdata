package ai.vishal.ratingsdata.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRating {
    @Id
    String userId;
    List<Rating> ratings;
    public UserRating(String userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }
    
}
