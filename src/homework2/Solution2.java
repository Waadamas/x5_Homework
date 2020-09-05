package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();             //Сначала сохраняем как строку что бы убедиться что введено три символа
        if (str.length() != 3){
            System.out.println("Число должно быть трёхзначным!");
        }
        else{
            int num = Integer.parseInt(str);                  //Переводим в int
            int d1 = num % 10;
            int d2 = num % 100 /10;
            int d3 = num /100;
            int sum = d1 + d2 + d3;
            System.out.println("Сумма цифр числа " + num + ": " + sum);
        }

    }

}