/**
 * the company class is used to represent a company in our stock market simulation
 * 
 * @author Navtej bhogal, Sam Berkay
 * @version 1.00 03 may 2017
 */
public class Company 
{
    // class variables
    private String companyName;
    private CompanyType companyType;
    private RiskLevel companyRisk;
    private int stockCount;
    private float stockValue;
    private boolean isInsolvent;
    private Stock stock;
    private static int counter=0;
    private int companyID;

    // class constructor
    public Company(String name, CompanyType type, RiskLevel risk, int totalShares, float sharePrice) 
    {
        counter++;
        companyID=counter;
        companyName = name;
        companyType = type;
        companyRisk = risk;
        stockCount = totalShares;
        stockValue = (sharePrice/100);
        isInsolvent = false;
        stock = new Stock(companyID, name, stockValue);
    }
    
    // class methods
    
    /**
     * this method is used to assign a new name to the companyName attribute
     * 
     * @param newName String this value is assigned to the companyName attribute
     */
    public void setName(String newName)
    {
        companyName = newName;
    }
    
    /**
     * this method returns the current CompanyName value
     * 
     * @return String this is the the current companyName attribute value.
     */
    public String getName()
    {
        return companyName;
    }
    
    /**
     * this method is used to assign a new type to the companyType attribute
     * 
     * @param type CompanyType enum value which will be assigned to the companyType attribute.
     */
    public void setType(CompanyType type)
    {
        companyType = type;
    }
    
    /**
     * this method returns the current CompanyType value
     * 
     * @return CompanyType this is the current CompanyType attribute value.
     */
    public CompanyType getType()
    {
        return companyType;
    }
    
    /**
     * this method is used to assign a risk level to the CompanyRisk attribute
     * 
     * @param risk riskLevel this is the riskLevel value which will be assigned to the CompanyRisk attribute
     */
    public void setRisk(RiskLevel risk)
    {
        companyRisk = risk;
    }
    
    /**
     * this method returns the current companyRisk value.
     * 
     * @return riskLevel this value is the current companyRisk value.
     */
    public RiskLevel getRisk()
    {
        return companyRisk;
    }
    
    // i am not sure how this is to be implemented so i have left it blank...
    public void issueStock()
    {
        
    }
    
    /**
     * this method is used to make a company object insolvent.
     * 
     */
    public void setInsolvent()
    {
        isInsolvent = true;
    }
    
    /**
     * this method is used to check if a company object is insolvent.
     * 
     * @return boolean this is the current isInsolvent attribute value.
     */
    public boolean isCompanyInsolvent()
    {
        return isInsolvent;
    }
     
    /**
     * this method returns the current companyID value
     * 
     * @return int this is the current companyID atrribute value.
     */
    public int getCompanyID() {
        return companyID;
    }
    
     /**
     * this method returns the current stock value.
     * 
     * @return Stock this is the current stock attribute value.
     */
    public Stock getStock(){
        return stock;
    }
}
