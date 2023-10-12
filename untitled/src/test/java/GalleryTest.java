import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Artist artist;
    private ArtWork artWork;
    private Gallery gallery;

    @BeforeEach
    public void setUp(){
        artist = new Artist("John");
        artWork = new ArtWork("The Scream",600,artist);
        gallery = new Gallery("Louvre",0);


    }
    @Test
    public void canAddToStock(){
        //given
        gallery.addToStock(artWork);
        //when
        int result = gallery.countStock();
        //done
        assertThat(result).isEqualTo(1);
    }
}
