/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktradingsimulation;

/**
 *
 * @author Sam Berkay
 */
public class StockMarket {

    public int month = 1;
    public int day = 1;
    public int weekday = 6;
    public int hour = 0;
    public int minute = 0;
    public String[] weekdays = {"Mon","Tues","Wed","Thu","Fri","Sat","Sun"};
    public boolean isLeapYear=false;
    public boolean holiday = false;
    public MarketType marketType = MarketType.STABLE;
    
    //General method to increment the time by recursively calling methods.
    public void incrementTime()
    {
        checkHoliday(); //Check to see whether it is a holiday on the first day of trading 
        incrementMinutes();
    }
    
    //Specific method to increment the minutes.
    public void incrementMinutes()
    {
        //Reset minute timer to zero and increase the hour if appropriate.
        if (minute != 45) {
            minute = minute + 15;
        }
        else {
            minute = 0;
            incrementHour();
        }
    }
    
    //Specific method to increment the hours.
    public void incrementHour() {
        //Reset hour timer to zero and increase the day if appropriate.
        if (hour!=23){
            hour++;
        }
        else {
            hour = 0;
            incrementDay();
        }
    }
    
    //Specific method to increment the days
    public void incrementDay() {
        //If the month has 31 days, reset the day count and increment the month when the end of the month is reached.
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31){
            day=1;
            incrementWeekDay();
            incrementMonth();
        }
        //If the month has 30 days, reset the day count and increment the month when the end of the month is reached.
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day=1;
            incrementWeekDay();
            incrementMonth();
        }
        //If the month is february, check to see if it is currently a leap year. If it is - increment the month after the 29th day, if not, the 28th day.
        else if (month == 2) {
            if (day == 28 && getLeapYear() == false){
                day = 1;
                incrementWeekDay();
                incrementMonth();
            }
            else if (day == 29 && getLeapYear() == true) {
                day = 1;
                incrementWeekDay();
                incrementMonth();
            }
            //Increase the day during february if it is not the end of the month.
            else {
                day++;
                incrementWeekDay();
            }
        }
        //Increase the day if it is not the end of the month.
        else {
            day++;
            incrementWeekDay();
        }
        checkHoliday();
    }
    
    //Increments the weekdays to make add weekend functionality to close markets on the weekend
    public void incrementWeekDay(){
        weekday++;
        if (weekday == 7) {
            weekday = 0;
        }
        
    }
    
    //Method to increment the month
    public void incrementMonth() {
        month++;
    }
    
    
    //Method to check whether it is currently a holiday or not.
    public void checkHoliday() {
        if(weekday == 5 || weekday ==6)
        {
            setHoliday(true);
        }
        //Christmas & Boxing day are holidays
        else if (month == 12 && (day == 25 || day == 26)){
            setHoliday(true);
        }
        //Good Friday && Easter Monday are holidays
        else if(month == 4 && (day == 14 || day == 17)) {
            setHoliday(true);
        }
        else {
            setHoliday(false);
        }
        
    }
    
    //Setter methods.
    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }
    
    //Getter methods.
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean getLeapYear() {
        return isLeapYear;
    }
    
    public int getWeekday() {
        return weekday;
    }

    public String[] getWeekdays() {
        return weekdays;
    }
    
    //This method returns the correct string for the day of the week on any given day in the year.
    public String getWeekdayName(String[] array, int i) {
        return array[i];
    }

    public boolean isHoliday() {
        return holiday;
    }

    public MarketType getMarketType() {
        return marketType;
    }
    
    
    
    
}
