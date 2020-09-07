package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        if (x >= 0) {
            x++;
            System.out.println(x);
        } else {
            System.out.println(x);
        }

    }

}