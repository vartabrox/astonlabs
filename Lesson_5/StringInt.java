// Практическое задание №8

public class StringInt {

    public static void main(String[] args) {
        printStringInt("Привет, Сергей!", 12);  
    }

    public static void printStringInt(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

}
