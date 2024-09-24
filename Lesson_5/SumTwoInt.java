// Практическое задание №5

public class SumTwoInt {
    
    public static void main(String[] args) {
        
        System.out.println(isSumTwoInt(9, 4));  // true
        System.out.println(isSumTwoInt(10, 10)); // false
        System.out.println(isSumTwoInt(17, 5));   // false
    }

    public static boolean isSumTwoInt(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}