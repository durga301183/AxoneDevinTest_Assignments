import java.io.IOException;
import java.io.InvalidClassException;
import java.util.Arrays;

public class DaysofWeek {

private String day;

    private final static String[] days=  { "mon","tue","wed","thurs","fri","sat","sun"};

    //constructor
    public DaysofWeek(String day) throws Exception{
        this.setDay(day);
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) throws Exception {
        if(Arrays.asList(days).contains(day)){
        this.day = day;
    }
        else {
            throw new Exception("invalid");
        }

            }
            public static void main(String[] args) throws Exception {
        DaysofWeek weekday = new DaysofWeek("iiugjhk");
    }
        }


