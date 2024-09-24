// Практическое задание №6

public class PositiveNegative {

    public static void main(String[] args) {
        checkNumber(1);   
        checkNumber(-200);  
        checkNumber(99);  
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}