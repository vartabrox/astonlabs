// Практическое задание №14

public class InputTwoArguments {

        public static void main(String[] args) {
            int len = 5;         
            int initialValue = 7;  
            
            int[] array = newArray(len, initialValue);  
            printArray(array);  
        }
    
        public static int[] newArray(int len, int initialValue) {
            int[] array = new int[len];  // создание массива определенной длины
            
            // заполнение массива
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
    
            return array;
        }
    
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}