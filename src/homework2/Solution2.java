package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        if (str.length() != 3) {
            System.out.println("Число должно быть трёхзначным!");
        } else {
            int sum = 0;
            String[] parts = str.split("");
            for (String value : parts){
                sum = sum + Integer.parseInt(value);
            }
            System.out.println(sum);
        }

    }

}