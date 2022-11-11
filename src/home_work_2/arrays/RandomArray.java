package arrays;

import utils.ArraysUtils;

public class RandomArray {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5,100);
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }
    }
}