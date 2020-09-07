package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7 {
    public static void main(String[] args) throws Exception {
        double tax = 0;
        String city = "";
        double time = 10;
        System.out.println("Введите число:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        switch (x) {
            case 905:
                tax = 4.15;
                city = "Москва";
                break;
            case 194:
                tax = 1.98;
                city = "Ростов";
                break;
            case 491:
                tax = 2.69;
                city = "Краснодар";
                break;
            case 800:
                tax = 5.00;
                city = "Киров";
                break;
            default:
                break;
        }
        if (city.equals("")) {
            System.out.println("Такой код отсутствует!");
        } else {
            System.out.println(city + ". Стоимость разговора: " + tax * time);
        }
    }
}