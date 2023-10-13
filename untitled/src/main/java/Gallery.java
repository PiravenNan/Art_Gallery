import java.util.ArrayList;

public class Gallery{

    private String name;
    private int till;
    private ArrayList<ArtWork> stock;

    public Gallery( String name, int till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ArtWork>();
    }
    public int valueStock(){
        int totalValue = 0;

        for (ArtWork art : this.stock){
            totalValue+=art.getPrice();
        }
        return totalValue;
    }
    public void addToStock(ArtWork artWork){this.stock.add(artWork);}
    public int countStock(){return this.stock.size();}
    public int getTill(){return this.till;}
    public void addToTill(int amount){this.till += amount;}
    public void removeFromStock(ArtWork artWork){this.stock.remove(artWork);}












}
