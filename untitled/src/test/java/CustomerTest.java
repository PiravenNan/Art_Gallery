import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {


    private Artist artist;
    private ArtWork artWork;
    private ArtWork artWork2;
    private Gallery gallery;
    private Customer customer;

    @BeforeEach
    public void setUp(){
        artist = new Artist("John");
        artWork = new ArtWork("The Scream",600,artist);
        gallery = new Gallery("Louvre",0);
        artWork2 = new ArtWork("Art",567,artist);
        customer = new Customer ("Piraven", 1000);
    }

    @Test
    public void canBuyArtWork(){
        // Given
        gallery.addToStock(artWork);
        gallery.addToStock(artWork2);

        // When
        customer.buyArtWork(gallery,artWork);

        int resultStock = gallery.countStock();
        int expectedStock = 1;
        int resultWallet = customer.getWallet();
        int expectedWallet = 400;
        int resultTill = gallery.getTill();
        int expectedTill = 600;
        int resultsCollection = customer.countCollection();
        int expectedCollection = 1;
        // Done
        assertThat(resultStock).isEqualTo(expectedStock);
        assertThat(resultWallet).isEqualTo(expectedWallet);
        assertThat(resultTill).isEqualTo(expectedTill);
        assertThat(resultsCollection).isEqualTo(expectedCollection);
    }

}
