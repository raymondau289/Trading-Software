/**
 * this class is used to represent a stock object in the stock market simulation
 * 
 * @author Navtej Bhogal, Sam Berkay 
 * @version 1.0, 03 may 2017
 */
public class Stock 
{
    // class variables
    private int stockID;
    private String companyName;
    private float stockPrice;
    
    // class constructor
    public Stock(int id, String name, float value) 
    {
        stockID=id;
        companyName = name;
        stockPrice = value;
    }
    
    // class methods
    
    /**
     * this method is used to assign a new name to the current companyName attribute
     * 
     * @param newName this is the new name value which will be assigned to the companyName attribute
     */
    public void setStockName(String newName)
    {
        companyName = newName;
    }
    
    /**
     * this method returns the stock objects current companyName value.
     * 
     * @return this is the current companyName value
     */
    public String getStockName()
    {
        return companyName;
    }
    
    /**
     * this method is used to assign a new value to the stock objects stockPrice attribute
     * 
     * @param newStockPrice this is the new stock price value
     */
    public void updateStockPrice(float newStockPrice)
    {
        stockPrice = newStockPrice;
    }
    
    /**
     * this method returns the sock objects current stockPrice value
     * 
     * @return this is the current stockPrice value
     */
    public float getPrice()
    {
        return stockPrice;
    }
}
