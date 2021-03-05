package src;

import java.util.Arrays;

/**
 * SortStringArray
 */
public class SortStringArray {

    public static void main(String[] args) {
        String[] arr = { "java", "python", "pascal", "smalltalk", "ada", "basic" };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}