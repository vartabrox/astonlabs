// Практическое задание №11

public class Array100 {

        public static void main(String[] args) {
            int[] array = new int[100];  
    
            // наполнение массива
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
    

            printArray(array);
        }
    
        // метод для вывода массива
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " "); // " " устанавливает пробел между элементами
            }
            System.out.println();
        }
}