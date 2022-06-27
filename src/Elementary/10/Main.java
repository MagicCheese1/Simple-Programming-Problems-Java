// https://en.wikipedia.org/wiki/Leap_year#/media/File:Leap_Year_Algorithm.png


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        do {
            year += 1;
        } while (year % 4 != 0 || year % 100 == 0 && year % 400 != 0);
        System.out.println(year);
        int count = 1;
        while(count < 20){
            year+= 4;
            if(!(year % 100 == 0 && year % 400 != 0)){
                System.out.println(year);
                count += 1;
            }
        }
    }
}