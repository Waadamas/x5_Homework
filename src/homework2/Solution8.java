package homework2;

import static java.util.Arrays.sort;

public class Solution8 {
    public static void main(String[] args) {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        maxNumber(array);
        positiveNumbers(array);
        negativeNumbers(array);

    }

    public static void maxNumber(int[] array) {
        sort(array);
        System.out.println("Максимальное значение в массиве: " + array[array.length - 1]);
    }

    public static void positiveNumbers(int[] array) {
        int sum = 0;
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                sum = sum + value;
                count++;
            }
        }
        System.out.println("Cумма положительных элементов: " + sum);
        System.out.println("Количество положительных эементов: " + count);
    }

    public static void negativeNumbers(int[] array) {
        int sumOdd = 0;
        int sum = 0;
        int count = 0;
        for (int value : array) {
            if (value < 0) {
                sum = sum + value;
                count++;
                if (value % 2 == 0) {
                    sumOdd = sumOdd + value;
                }

            }
        }
        int avg = sum / count;
        System.out.println("Сумма отрицательных четных элементов: " + sumOdd);
        System.out.println("Среднее арифметическое отрицательных элементов: " + avg);
    }

}
