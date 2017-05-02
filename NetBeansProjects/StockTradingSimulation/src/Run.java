
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sb
 */
public class Run {
    public static TradingExchange exchange;
    public static StockMarket market;
    public static ArrayList<Portfolio> portfolios = new ArrayList();
    public static ArrayList<Company> companies = new ArrayList();
    
    public Run(){
        exchange = new TradingExchange();
        market = new StockMarket();
    }
    
    public static void main(String[] args) {
        Run run = new Run();
        //Initialise portfolios
        portfolios.add(new Portfolio("Norbert DaVinci", 100000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Ellen Fotheringay-Smythe", 100000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Donald Shrek", 100000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Sir Melvin Codd", 100000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("A&G Investments", 100000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Trinity Investments", 50000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Ivor Lott", 50000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Justine Thyme", 50000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Saeed Pune", 50000, RiskLevel.MEDIUM));
        portfolios.add(new Portfolio("Xi Xian", 50000, RiskLevel.MEDIUM));
        
        //Initialise companies.
        companies.add(new Company("Pear Computing", CompanyType.HITECH, RiskLevel.HIGH, 50000, 650));
        companies.add(new Company("Wong Holdings", CompanyType.PROPERTY, RiskLevel.HIGH, 10000, 126));
        companies.add(new Company("Williams Leisure", CompanyType.HARD, RiskLevel.LOW, 20000, 82));
        companies.add(new Company("The Lovely Pie Co", CompanyType.FOOD, RiskLevel.LOW, 6000, 24));
        companies.add(new Company("Q1Q Tech", CompanyType.HITECH, RiskLevel.HIGH, 48900, 130));
        companies.add(new Company("Texas Crisps", CompanyType.FOOD, RiskLevel.LOW, 32900, 180));
        companies.add(new Company("Swann Holdings", CompanyType.PROPERTY, RiskLevel.HIGH, 23600, 45));
        companies.add(new Company("Patels Sauces", CompanyType.FOOD, RiskLevel.LOW, 55000, 100));
        companies.add(new Company("Gardens 'R' Us", CompanyType.HARD, RiskLevel.LOW, 19288, 19));
        companies.add(new Company("Sussex Flats", CompanyType.PROPERTY, RiskLevel.HIGH, 23000, 570));
        companies.add(new Company("Dawn Technology", CompanyType.HITECH, RiskLevel.HIGH, 18000, 12));
        companies.add(new Company("Excelsior Foods", CompanyType.FOOD, RiskLevel.LOW, 50000, 540));
        companies.add(new Company("Supreme Sk8", CompanyType.HARD, RiskLevel.LOW, 25000, 345));
        companies.add(new Company("Luxury Caravans", CompanyType.PROPERTY, RiskLevel.HIGH, 42000, 268));
        companies.add(new Company("WyreCraft", CompanyType.HITECH, RiskLevel.HIGH, 42000, 637));
        companies.add(new Company("Upduff and Co", CompanyType.FOOD, RiskLevel.LOW, 36700, 340));
        companies.add(new Company("Downe and Co", CompanyType.HARD, RiskLevel.LOW, 40000, 99));
        companies.add(new Company("Wazoolt", CompanyType.HITECH, RiskLevel.HIGH, 57000, 45));
        
        //Test portfolios
        for(int i=0;i<portfolios.size();i++){
            System.out.println(portfolios.get(i).getClientID() + " " + portfolios.get(i).getName());
        }
        System.out.println("");
        //Test companies
        for(int i=0;i<companies.size();i++){
            System.out.println(companies.get(i).getCompanyID() + " " + companies.get(i).getName());
        }
        
        while (market.getMonth()!=13){
            market.incrementTime();
        //    System.out.println(market.isHoliday() + "-" + market.getWeekdayName(market.getWeekdays(), market.getWeekday()) + " " + market.getDay() + "-" + market.getMonth() + " " + String.format("%02d",market.getHour()) + ":" + String.format("%02d", market.getMinute()));
        }
    }
}
