package homework2;

import java.util.Arrays;

public class Solution9 {
    public static void main(String[] args) {
        int[] originArray = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int[] invertedArray = new int[originArray.length];

        for (int i = 0; i < originArray.length; i++){
            invertedArray[i] = originArray[originArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertedArray));
    }
}
