package com.eightgums.exercise;

import java.util.stream.IntStream;

public class Exercise {

    int multiples(int number) {

        return IntStream.range(0, number + 1)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();

    }

}
