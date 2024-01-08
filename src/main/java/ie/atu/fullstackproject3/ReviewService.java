package ie.atu.fullstackproject3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.aggregation.SelectionOperators.First.first;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String songID){
        Review review = reviewRepository.insert(new Review(reviewBody));

      mongoTemplate.update(Song.class)
              .matching(Criteria.where("songID").is(songID))
              .apply(new Update().push("reviewIds").value(review))
              .first();

              return review;
    }
}
