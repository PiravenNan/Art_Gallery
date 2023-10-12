public class Customer {
    private String name;
    private int wallet;

    //constructor

    public Customer(String name, int wallet){

        this.name = name;
        this.wallet = wallet;

    }
     //Buy from gallery, reduce wallet, increase till
     //remove from gallery
    
    public void buyArtWork(Gallery gallery, ArtWork artWork){

        int price = artWork.getPrice();

        //transaction
        this.wallet -= price;
        gallery.addToTill(price);

        //remove from their stock
        gallery.removeFromStock(artWork);
        
    }
    
    public int getWallet(){
        return this.wallet;
    }
}
