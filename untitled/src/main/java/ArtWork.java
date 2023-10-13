public class ArtWork {
    private String title;
    private Artist artist;
    private int price;
    private String artistName;

    //constructor
    public ArtWork(String title, int price, Artist artist){
        this.artistName = artist.getName();
        this.title = title;
        this.price = price;
    }
    public String getArtistName(){return this.artistName;}
    public int getPrice(){return price;}
}
