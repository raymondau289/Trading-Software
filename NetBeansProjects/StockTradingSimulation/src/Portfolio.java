import java.util.ArrayList;
import java.util.HashMap;

/**
 * this class represents a clients portfolio in the stock market simulation
 * 
 * @author Navtej bhogal, Sam Berkay
 * @version 1.0, 03 may 2017
 */
public class Portfolio 
{
    // class variables
    private static int counter=0;
    private int clientID;
    private String clientName;
    private int clientCash;
    private final HashMap<Stock,Integer> clientAssets;
    private HashMap<Stock,Integer> stockToSell;
    ArrayList<Stock> keysAsArray;
    private RiskLevel clientRisk;
    
    // class constructors  
    public Portfolio(String name, int cash, RiskLevel risk) 
    {
        counter++;
        clientID=counter;
        clientName = name;
        clientCash = cash;
        clientRisk = risk;
        clientAssets = new HashMap<>();
        stockToSell = new HashMap<>();
    }

    // class methods
    
    /**
     * this method is used to reassign the current name of the portfolio object
     * 
     * @param name this value is assigned to the name attribute in the portfolio object
     */
    public void setName(String name)
    {
        clientName = name;
    }
    
    /**
     * this method is used to get the current name attribute of the portfolio object
     * 
     * @return this value is the current clientName attribute value.
     */
    public String getName()
    {
        return clientName;
    }
    
    /**
     * this method is used to see what the current amount of cash the client has in their portfolio
     * 
     * @return this is the current clientCash attribute value.
     */
    public int getCash()
    {
        return clientCash;
    }
    
    /**
     * this method is used to add more cash to the clients portfolio
     * 
     * @param cash this is the amount of cash you want to add to the portfolio
     */
    public void addCash(int cash)
    {
        clientCash += cash;
    }
    
    /**
     * this method is used to take out money from the clients portfolio
     * note if you try to withdraw more cash the client currently has then this method returns 0.
     * 
     * @param amountToWithDraw this is how cash the caller wants to withdraw
     * @return the amount which the caller requested
     */
    public int withdrawCash(int amountToWithDraw)
    {
        if ((clientCash - amountToWithDraw) >= 0)
        {
            clientCash = clientCash - amountToWithDraw;
            return amountToWithDraw;
        }
        else
        {
            return 0;
        }   
    }
    
    /**
     * this method returns the total value of all of the assets which the client currently has in their portfolio.
     * 
     * @return this is the total assetValue amount of the portfolio
     */
    public float getAssetValue()
    {
        float total = 0;
        int i=1;
        for(Stock s : clientAssets.keySet()) 
        {
            float stockWorth = s.getPrice() * clientAssets.get(s);
            total += stockWorth;
        }
        return total;
    }
    
    /**
     * this method returns the total net worth of the client.
     * 
     * @return this is the total net worth amount of the portfolio
     */
    public float getTotalWorth()
    {
        return getAssetValue() + clientCash;
    }
    
    /**
     * this method returns the clients current preferred risk level
     * 
     * @return this is the current clientRisk value
     */
    public RiskLevel getRiskLevel()
    {
        return clientRisk;
    }
    
    /**
     * this method is used to change the clients risk level
     * 
     * @param RiskLevel this is the new riskLevel which you want to set
     */
    public void setRiskLevel(RiskLevel RiskLevel)
    {
        clientRisk = RiskLevel;
    }
    
    /**
     * this method returns the current ClientID value
     * 
     * @return this is the current clientID value
     */
    public int getClientID(){
        return clientID;
    }
    
    /**
     * this method is used to find out the amount of a certian stock type which this portfolio currently has
     * 
     * @param this is the stock type which you want to find the amount for
     * @return this is the amount of stock s which this portfolio currently holds
     */
    public int getStockCount(Stock s){
        return clientAssets.get(s);
    }
    
    /**
     * this method is used to add stock in the clients portfolio
     * if the stockToAdd parameter already exists in the portfolio then this method increases that stock amount by the 'amount' parameter
     * if the stockToAdd parameter does not exist this method creates a new key value pair consisting of the stockToAdd + amount parameters
     * and inserts them into the clientsAssets hash-map.
     * 
     * @param stockToAdd this is the stock object which the caller wants to add to the portfolio
     * @param amount this is the amount of stock which the caller wants to add to this portfolio
     */
    public void addStock(Stock stockToAdd, int amount)
    {
        if (clientAssets.containsKey(stockToAdd)) 
        {
            int currentStockAmount = clientAssets.get(stockToAdd);
            clientAssets.put(stockToAdd, (currentStockAmount + amount));
        }
        else
        {
            clientAssets.put(stockToAdd, amount);
        }
        keysAsArray = new ArrayList<>(clientAssets.keySet());
    }
    
    /**
     * this method is used to remove stock from the clients portfolio
     * if the stockToBeSold parameter does not exist in the portfolio this method returns false indicating that this method did not successfully complete
     * if the stockToBeSold parameter does exist but the amountToSell exceeds the amount of that stock which the portfolio currently holds, again we return false.
     * if the stockToBeSold parameter does exist and we the amountToSell parameter is within the acceptable range this method returns true.
     * 
     * @param stockToBeSold this is the stock which the caller wants to sell
     * @param amountToSell this is the amount which the caller wants to sell
     * @return this is a boolean which indicates if the transaction was successful or not.
     */ 
    public boolean sellStock(Stock stockToBeSold, int amountToSell)
    {
        if (clientAssets.containsKey(stockToBeSold))
        {
            int currentStockQuantity = clientAssets.get(stockToBeSold);
            if (currentStockQuantity - amountToSell >= 0) 
            {
                int newStockQuantity = currentStockQuantity - amountToSell;
                if (!stockToSell.containsKey(stockToBeSold)){
                    //Test
                    stockToSell.put(stockToBeSold,amountToSell);
                }
                else{
                    amountToSell+=stockToSell.get(stockToBeSold);
                    stockToSell.put(stockToBeSold,amountToSell);
                }
                clientAssets.put(stockToBeSold, newStockQuantity);
                return true;
            }
        }
        return false;
    }
    
    /**
     * this method searches through each stock in the clients portfolio and if a stock has a price of 0 it removes that stock from the portfolio.
     * 
     */
    public void removeInsolventStock()
    {
        for (Stock s : clientAssets.keySet()) 
        {
            if (s.getPrice() == 0) 
            {
                clientAssets.remove(s);
            }
        }
        keysAsArray = new ArrayList<>(clientAssets.keySet());
    }
    
    /**
     * Returns the stock based on integer value to find in the arraylist.
     * Used for selling / buying.
     *
     * @param the integer value of a given stock type
     * @return the stock object which has the integer value i
     */
    public Stock getStock(int i){
        return keysAsArray.get(i);
    }
    
    
    /**
     * Returns stockToSell hashmap
     * 
     * @return this is the current stockToSell attribute value
     */
    public HashMap<Stock,Integer> getToBeSold(){
        return stockToSell;
    }
    
    
    /**
     * this method returns the current amount of unique stock types which the portfolio holds
     * 
     * @return this is the current amount of unique stock types which the portfolio currently holds
     */
    public int getSize(){
        return clientAssets.size();
    }
}

