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
            permutations.add(letter.substring(0, 1) + letter.substring(1, 2));
            permutations.add(letter.substring(1, 2) + letter.substring(0, 1));
            return permutations;
        }
        if (letter.length() == 3) {
            permutations.add(letter.substring(0, 1) + letter.substring(1, 2) + letter.substring(2, 3));
            permutations.add(letter.substring(0, 1) + letter.substring(2, 3) + letter.substring(1, 2));
            permutations.add(letter.substring(1, 2) + letter.substring(0, 1) + letter.substring(2, 3));
            permutations.add(letter.substring(1, 2) + letter.substring(2, 3) + letter.substring(0, 1));
            permutations.add(letter.substring(2, 3) + letter.substring(0, 1) + letter.substring(1, 2));
            permutations.add(letter.substring(2, 3) + letter.substring(1, 2) + letter.substring(0, 1));
            return permutations;
        }
        return singletonList(letter);
    }
}