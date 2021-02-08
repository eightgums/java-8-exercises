package com.eightgums.exercise;

import java.util.stream.LongStream;

public class Exercise {

    public static long factorialStreams(long n) {

        return LongStream.rangeClosed(2, n)
                .reduce(1, (long a, long b) -> a * b);
    }

}
