import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    @Test

    public void getNameTest(){
        //Given
        Artist artist = new Artist("Sarah");
        //When
        //Done
        assertThat(artist.getName()).isEqualTo("Sarah");
    }

}
