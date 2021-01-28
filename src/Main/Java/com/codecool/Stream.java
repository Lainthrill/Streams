package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    
    public void fillWithC() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> startingWithC = myList.stream().filter(a -> a.charAt(0) == 'c').
                map(b -> b.substring(0,1).toUpperCase() + b.substring(1)).sorted()
                .collect(Collectors.toList());
        startingWithC.forEach(System.out::println);
    }

}
