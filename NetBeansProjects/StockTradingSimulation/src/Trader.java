
import java.util.ArrayList;

/**
 * this abstract class is used to define the concept of a generic trader in the stock market simulation
 * 
 * @author Navtej Bhogal, Sam Berkay
 * @version 1.0, 03 may 2017
 */
public abstract class Trader 
{
    // class variables
    private ArrayList<Portfolio> clients;
    
    //class methods
   
    /**
     * this method is used to retrieve a client (by their unique ID) which is currently assigned to a trader.
     * 
     * @param i this is the clients unique id number
     * @return this method returns the client's portfolio.
     */
    public abstract Portfolio getClient(int i);
    
    /**
     * this method is used to assign a client to a trader
     * 
     * @param client this is the client's portfolio object which is going to be assigned to the trader
     */
    public abstract void addClient(Portfolio client);
    
    /**
     * this method is used to remove a client which is currently assigned to a trader
     * 
     * @param id this is the clients unique id number
     */
    public abstract void removeClient(int id);
    
    public abstract void trade();
    
    public abstract void buy();
    
    public abstract void sell();
    
    public abstract void makeOffer();
    
    public abstract float getTotalAssets();
}
