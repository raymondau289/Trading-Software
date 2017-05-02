
import java.util.ArrayList;


public abstract class Trader 
{
    // class variables
    private ArrayList<Portfolio> clients;
    
    //class methods
    
    public abstract Portfolio getClient(int i);
    
    public abstract void addClient(Portfolio client);
    
    public abstract void removeClient(int id);
    
    public abstract void trade();
    
    public abstract void buyStock();
    
    public abstract void sellStock();
    
    public abstract void makeOffer();
    
    public abstract float getTotalAssets();
}
