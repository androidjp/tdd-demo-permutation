package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationUtilTest {
    @Test
    public void should_return_a_when_getPermutation_given_one_letter_a() {
        // given
        String letter = "a";
        // when
        final List<String> permutations = PermutationUtil.getPermutation(letter);
        // then
        assertThat(permutations).isEqualTo(Collections.singletonList("a"));
    }
}