package test;

import java.util.List;

public abstract class Trader 
{
    // class variables
    private List<Portfolio> clients;
    
    //class methods
    
    public abstract Portfolio getClient();
    
    public abstract void addClient(Portfolio client);
    
    public abstract void removeClient(String clientName);
    
    public abstract void trade();
    
    public abstract void buyStock();
    
    public abstract void sellStock();
    
    public abstract void makeOffer();
    
    public abstract float getTotalAssests();
}
