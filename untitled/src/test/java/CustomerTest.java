import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {


    private Artist artist;
    private ArtWork artWork;
    private Gallery gallery;
    private Customer customer;

    @BeforeEach
    public void setUp(){
        artist = new Artist("John");
        artWork = new ArtWork("The Scream",600,artist);
        gallery = new Gallery("Louvre",0);
        customer = new Customer ("Piraven", 1000);

    }

    @Test

    public void canBuyArtWork(){
        // Given
        gallery.addToStock(artWork);
        customer.buyArtWork(gallery,artWork);
        // When

        int resultStock = gallery.countStock();
        int expectedStock = 0;

        int resultWallet = customer.getWallet();
        int expectedWallet = 400;

        int resultTill = gallery.getTill();
        int expectedTill = 600;
        // Done

        assertThat(resultStock).isEqualTo(expectedStock);
        assertThat(resultWallet).isEqualTo(expectedWallet);
        assertThat(resultTill).isEqualTo(expectedTill);

        }

}
