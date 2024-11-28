package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> elementCount = countElements(list);
        System.out.println(elementCount);
    }

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCount = new HashMap<>();

        for (Integer element : list) {
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }
        return elementCount;
    }
}
