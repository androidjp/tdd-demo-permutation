package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class PermutationUtilTest {
    @Test
    public void should_return_a_when_listAllPermutation_given_one_letter_a() {
        // given
        String letter = "a";
        // when
        final List<String> permutations = PermutationUtil.listAllPermutation(letter);
        // then
        assertThat(permutations).isEqualTo(singletonList("a"));
    }
}