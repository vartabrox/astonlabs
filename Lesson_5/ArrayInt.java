// Практическое задание №10

public class ArrayInt {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};  
        
        System.out.println("Исходный массив:");
        printArray(array);
        
        newArray(array);  // инвертирование массива

        System.out.println("// Практическое задание №11:");
        printArray(array);
    }

    public static void newArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
