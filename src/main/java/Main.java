import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        String array[][] = new String[size][size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j< size; j++) {
                array[i][j] = input.next();
            }
        }
        System.out.println ("Элементы массива:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

            System.out.print(array[i][j]+ " ");
        }
            System.out.println();

        }

        try {
            try {
                int result = countElements(array);
                System.out.println ("Сумма элементов массива:");
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует значению 4х4!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int countElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
