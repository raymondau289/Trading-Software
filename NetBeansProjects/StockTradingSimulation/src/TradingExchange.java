/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author sb
 */



public class TradingExchange {
    
    public float shareIndex;

    /**public void addCompany(Stock stock){
        //Need to fill.
    }*/
    
    /**public void removeInsolventCompany(){
     * //Need to fill
     */
    
    /**public void addTrader(){
        //Need to fill
    }*/
    
    /**public void removeTrader(){
        //Need to fill
    }*/
    
    /**public void addStock(){
        //Need to fill
    }*/
    
    /**public void removeStock(){
        //Need to fill
    }*/
    
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
            shareIndex += company.getStock().getStockPrice();
        }
        shareIndex = (shareIndex/companies.size());
        return shareIndex;
    }
    
    /**public float getSharePrice() {
        //Need to fill.
    }   */
    
    
    
}
