// Практическое задание №2

public class SumSign {

    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 10;  
        int b = -19; 

        int sum = a + b;
        
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    } 
}
