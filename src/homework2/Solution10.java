package homework2;

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        int[] array = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++){  //Если мы нашли 0, то следующая конструкция пропихивает его в конец массива
                    array[j-1] = array[j];
                    array[j] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
    }
}
