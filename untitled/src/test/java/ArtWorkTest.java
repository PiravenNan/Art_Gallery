import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtWorkTest {
    @Test
    public void getArtistNameTest(){
        //Given
        Artist artist = new Artist("Leo");
        ArtWork artWork = new ArtWork("Mona Lisa", 100, artist);
        //When
        String result = artWork.getArtistName();
        //Done
        assertThat(result).isEqualTo("Leo");
    }



}
