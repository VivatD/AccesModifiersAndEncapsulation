package date;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){}

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        if(year >=0){
            this.year = year;
        } else {
            System.err.println("Incorrect year value");
        }
    }

    public int getMonth() {
        return month;
    }

    private void setMonth(int month) {
        if (month > 0 && month <= 12){
            this.month = month;
        } else {
            System.err.println("Incorrect month value");
        }
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        if(day > 0 && day <= 31){
            this.day = day;
        } else {
            System.err.println("Incorrect day value");
        }
    }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }
}
