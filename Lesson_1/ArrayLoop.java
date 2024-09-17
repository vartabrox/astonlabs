// Практическое задание №12

public class ArrayLoop {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  

        System.out.println("Исходный массив:");
        printArray(array);
        
        newArray(array);  

        System.out.println("Новый массив:");
        printArray(array);
    }

    public static void newArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
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
