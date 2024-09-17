// Практическое задание №13

public class SquareArray {

    public static void main(String[] args) {
        int size = 5;  // квадратный массив 5x5
        int[][] array = new int[size][size];  

        addDiagonal(array);  
        printArray(array);   
    }

    public static void addDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;  // заполнение диагонали 
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
    }

}
