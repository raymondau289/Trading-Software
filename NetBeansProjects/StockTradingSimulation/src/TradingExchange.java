/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sb
 */



public class TradingExchange {
    
    private float shareIndex;
    private HashMap<Stock,Integer> forSale; 

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
    
    public void addForSale(HashMap<Stock,Integer> forSale){
        
    }
    
    /**public float getSharePrice() {
        //Need to fill.
    }   */
    
    
    
}
