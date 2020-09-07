package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        if (x > 0) {
            x = x + 1;
        } else if (x == 0) {
            x = 10;
        } else {
            x = x - 2;
        }
        System.out.println(x);

    }

}