/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sb
 */



public class TradingExchange {
    
    private float shareIndex;
    private HashMap<Stock,Integer> forSale;
    
    public TradingExchange(){
        forSale = new HashMap();
    }

    /**public void addCompany(Stock stock){
        //Need to fill.
    }*/
    
    /**public void removeInsolventCompany(){
     * //Need to fill
     */
    
    /**public void issueStock(){
        //Need to fill
    }*/
    
    /**public void updateSharePrice(Stock stock){
        //Need to fill.
    }*/
    
    //Getter methods
    public float getShareIndex(ArrayList<Company> companies) {
        float shareIndex=0;
        for(Company company: companies){
            shareIndex += company.getStock().getPrice();
        }
        shareIndex = (shareIndex/companies.size());
        return shareIndex;
    }
    
    public void addForSale(HashMap<Stock,Integer> toSell){
        
        for(Map.Entry<Stock,Integer> entry : toSell.entrySet()) {
            Stock stock = entry.getKey();
            int amount = entry.getValue();
            
            if(forSale.containsKey(stock)){
                int currentAmount = forSale.get(stock);
                amount = amount+currentAmount;
                forSale.put(stock, amount);
            }
            else{
                forSale.put(stock,amount);
            }
        }
    }

    public HashMap<Stock, Integer> getForSale() {
        return forSale;
    }
    
    //TEST METHOD
    public void printHashMap(){
        for(Stock s : forSale.keySet()){
            String key = s.getStockName();
            String value = forSale.get(s).toString();
            System.out.println(key + " : " + value);
        }
    }
    
    /**public float getSharePrice() {
        //Need to fill.
    }   */
    
    
    
}
