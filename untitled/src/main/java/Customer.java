import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<ArtWork> artCollection;

    //constructor
    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<ArtWork>();
    }
     //Buy from gallery, reduce wallet, increase till
     //remove from gallery
    public void removeFromWallet(int amount){
        this.wallet -= amount;
    }
    public void buyArtWork(Gallery gallery, ArtWork artWork){
        //transaction
        removeFromWallet(artWork.getPrice());
        gallery.addToTill(artWork.getPrice());
        //remove from their stock and add to customer
        gallery.removeFromStock(artWork);
        addToArtCollection(artWork);
    }

    public void addToArtCollection(ArtWork artWork){
        this.artCollection.add(artWork);
    }

    public int getWallet(){return this.wallet;}

    public int countCollection(){
        return this.artCollection.size();
    }
}
