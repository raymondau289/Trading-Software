package test;

public class Company 
{
    // class variables
    private String companyName;
    private CompanyType companyType;
    private riskLevel companyRisk;
    private int stockCount;
    private int stockValue;
    private boolean isInsolvent;

    // class constructor
    public Company(String name, CompanyType type, riskLevel risk, int totalShares, int sharePrice) 
    {
        companyName = name;
        companyType = type;
        companyRisk = risk;
        stockCount = totalShares;
        stockValue = sharePrice;
        isInsolvent = false;
    }
    
    // class methods
    
    // this method is used to assign a new name to the companyName attribute 
    public void setName(String newName)
    {
        companyName = newName;
    }
    
    // this method returns the current CompanyName value
    public String getName()
    {
        return companyName;
    }
    
    // this method is used to assign a new type to the companyType attribute
    public void setType(CompanyType type)
    {
        companyType = type;
    }
    
    // this method returns the current CompanyType value
    public CompanyType getType()
    {
        return companyType;
    }
    
    // this method is used to assign a risk level to the CompanyRisk attribute
    public void setRisk(riskLevel risk)
    {
        companyRisk = risk;
    }
    
    // this method returns the current companyRisk value.
    public riskLevel getRisk()
    {
        return companyRisk;
    }
    
    // i am not sure how this is to be implemented so i have left it blank...
    public void issueStock()
    {
        
    }
    
    // this method is used to make a company object insolvent.
    public void setInsolvent()
    {
        isInsolvent = true;
    }
    
    // this method is used to check if a company object is insolvent.
    public boolean isCompanyInsolvent()
    {
        return isInsolvent;
    }
}
