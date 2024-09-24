// Практическое задание №7

public class PositiveNegative2 {

    public static void main(String[] args) {
        System.out.println(Negative(-16));  // true
        System.out.println(Negative(21));  // false
        System.out.println(Negative(-1));   // false
    }

    public static boolean Negative(int number) {
        return number < 0;
    }

}
