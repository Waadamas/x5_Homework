package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7 {
    public static void main(String[] args) throws Exception{
        double tax;
        double time = 10;
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String x = bufferedReader.readLine();
        if (x.equals("905")){
            tax = 4.15;
            System.out.println("Москва. Стоимость разговора: " + tax * time); // так как параметр умножения на 10 статичный, было бы логично запихнуть готовые значения в стринг
        }
        else if (x.equals("194")){
            tax = 1.98;
            System.out.println("Ростов. Стоимость разговора: " + tax * time);
        }
        else if (x.equals("491")){
            tax = 2.69;
            System.out.println("Краснодар. Стоимость разговора " + tax * time);
        }
        else if (x.equals("800")){
            tax = 5.00;
            System.out.println("Киров. Стоимость разговора " + tax * time);
        }
        else{
            System.out.println("Такой код отсутствует");
        }
    }

}