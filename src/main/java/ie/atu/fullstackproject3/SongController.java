package ie.atu.fullstackproject3;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {
    @Autowired
    private SongService songService;
    @GetMapping
    public ResponseEntity<List<Song>> getAllSongs(){
  return new ResponseEntity<List<Song>>(songService.allSongs(), HttpStatus.OK);

    }

    @GetMapping("/{songID}")
    public ResponseEntity<Optional<Song>> getSingleSong(@PathVariable String songID){
    return new ResponseEntity<Optional<Song>>(songService.singleSong(songID), HttpStatus.OK);
    }
}
