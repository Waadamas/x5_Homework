package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[3];
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите число " + i + ":");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(bufferedReader.readLine());
            array[i-1] = x;
        }
        sort(array);
        System.out.println("Наименьшее число: " + array[0]);

    }

}
