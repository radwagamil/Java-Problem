package time;


public class Time {

    
    public static void main(String[] args) {
        
        //from google
        
        int hour, minute, second;
        
        hour = 22;
        minute = 40;
        second = 55;
        
        int SEC_PER_MINUTE = 60;
        int SEC_PER_HOUR = 60 * SEC_PER_MINUTE;
        int SEC_PER_DAY = 24 * SEC_PER_HOUR;
        int secondsSinceMidnight = hour*SEC_PER_HOUR + minute*SEC_PER_MINUTE + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        
        System.out.println(SEC_PER_DAY - secondsSinceMidnight + " seconds remain.");
        
         System.out.println(secondsSinceMidnight * 100 / SEC_PER_DAY +
            "% of the day is over.");
        
        
        
    }
    
}

