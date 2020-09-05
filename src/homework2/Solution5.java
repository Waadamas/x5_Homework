package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите число 1:");
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(bufferedReader1.readLine());
        System.out.println("Введите число 2:");
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        int x2 = Integer.parseInt(bufferedReader2.readLine());
        System.out.println("Введите число 3:");
        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(System.in));
        int x3 = Integer.parseInt(bufferedReader3.readLine());

        if (x1 <= x2 && x1 <= x3){
            System.out.println("Наименьшее число = " + x1);
        }
        else if (x2 <= x1 && x2 <= x3){
            System.out.println("Наименьшее число = " + x2);
        }
        else {
            System.out.println("Наименьшее число = " + x3);
        }

    }

}
