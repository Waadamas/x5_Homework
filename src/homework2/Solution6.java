package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        String isOdd;
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());

        if (x % 2 == 0) {
            isOdd = "четное";
        } else {
            isOdd = "нечетное";
        }

        if (x > 0) {
            System.out.println("Введено положительное " + isOdd + " число");
        } else if (x == 0) {
            System.out.println("Введен ноль");
        } else {
            System.out.println("Введено отрицательное " + isOdd + " число");
        }

    }

}