package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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
        for (int index = 0; index < letter.length(); index++) {
            for (String restPermutation : listAllPermutation(subtractOneCharByIndex(letter, index))) {
                permutations.add(letter.charAt(index) + restPermutation);
            }
        }
        return permutations;
    }

    private static String subtractOneCharByIndex(String letter, int index) {
        return letter.substring(0, index) + letter.substring(index + 1);
    }
}