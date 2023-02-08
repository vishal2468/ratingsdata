package ai.vishal.ratingsdata.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {
    
    String movieId;
    int rating;
    
    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
    
}
