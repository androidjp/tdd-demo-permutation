package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

/**
 * @author Jasper Wu
 * @date 2020/8/9
 **/
public class PermutationUtil {
    public static List<String> listAllPermutation(String letter) {
        if (letter.length() == 1) {
            return singletonList(letter);
        }
        List<String> permutations = new ArrayList<String>();
        if (letter.length() == 2) {
            for (int i = 0; i < 2; i++) {
                for (String restPermutation : listAllPermutation(subtractOneCharByIndex(letter, i))) {
                    permutations.add(letter.charAt(i) + restPermutation);
                }
            }
            return permutations;
        }
        if (letter.length() == 3) {
            for (int i = 0; i < 3; i++) {
                for (String restPermutation : listAllPermutation(subtractOneCharByIndex(letter, i))) {
                    permutations.add(letter.charAt(i) + restPermutation);
                }
            }
            return permutations;
        }
        return singletonList(letter);
    }

    private static String subtractOneCharByIndex(String letter, int i) {
        return letter.substring(0, i) + letter.substring(i + 1);
    }
}