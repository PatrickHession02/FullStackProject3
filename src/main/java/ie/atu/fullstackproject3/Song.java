package ie.atu.fullstackproject3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    private ObjectId _id;
    private String title;
    private String releaseDate;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    private String MusicVideoLink;
    private String artist;
    @DocumentReference
    private List<Review> reviewIds;
    private String songID;


}
