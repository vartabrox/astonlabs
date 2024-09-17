// Практическое задание №9

import java.util.Scanner; 

public class Year {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Type year: ");
        int year = in.nextInt();
        System.out.print(isLeapYear(year));
        in.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
