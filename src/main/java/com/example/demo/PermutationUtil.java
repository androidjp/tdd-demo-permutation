package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static java.util.stream.IntStream.range;

/**
 * @author Jasper Wu
 * @date 2020/8/9
 **/
public class PermutationUtil {
    public static List<String> listAllPermutation(String letter) {
        if (letter.length() == 1) {
            return singletonList(letter);
        }
        List<String> permutations = new ArrayList<>();
        range(0, letter.length())
                .forEach(index -> listAllPermutation(subtractOneCharByIndex(letter, index))
                        .stream().map(restStr -> letter.charAt(index) + restStr).forEach(permutations::add));
        return permutations;
    }

    private static String subtractOneCharByIndex(String letter, int index) {
        return letter.substring(0, index) + letter.substring(index + 1);
    }
}