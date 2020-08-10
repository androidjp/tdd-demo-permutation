package com.example.demo;

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
        return asList(letter, letter.substring(1, 2) + letter.substring(0, 1));
    }
}