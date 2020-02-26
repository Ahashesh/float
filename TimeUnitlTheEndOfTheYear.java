import java.util.Calendar; // Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR
import java.util.Date; //The class Date represents a specific instant in time, with millisecond precision
import java.util.GregorianCalendar; // GregorianCalendar is a concrete subclass(one which has implementation of all of its inherited members either from interface or abstract class) of a Calendar
public class TimeUnitlTheEndOfTheYear {
    public static void main(String[] args) {
        Calendar mainCal = Calendar.getInstance(); // Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time
        Date currentDate = mainCal.getTime(); //Returns the number of milliseconds since January 1
        System.out.println("Current Date: " + currentDate);
        /* Declare the variables */
        int dayOfYear = mainCal.get(Calendar.DAY_OF_YEAR); // Getting the number of days since the January 1
        int HourOfDay = mainCal.get(Calendar.HOUR_OF_DAY);
        int MinutesOfDay = mainCal.get(Calendar.MINUTE);
        int SecondOfDay = mainCal.get(Calendar.SECOND);
        int Year = mainCal.get(Calendar.YEAR);
        Calendar mainCalTwo = new GregorianCalendar(Year, Calendar.DECEMBER, 31); // Getting the number of days this year
        int Today = mainCalTwo.get(Calendar.DAY_OF_YEAR);
        int remindingDayOfTheYear = Today - dayOfYear;
        int remindingHoursOfTheDay = 24 - HourOfDay;
        int remindingMinuetsOfTheDay = 60 - MinutesOfDay;
        int remindingSecOfTheDay = 60 - SecondOfDay;
        System.out.println( "Time until the end of year " + remindingDayOfTheYear + " Days, "+ remindingHoursOfTheDay +" Hours, " + remindingMinuetsOfTheDay + " Minutes, " + remindingSecOfTheDay + " Seconds");
    }
}
