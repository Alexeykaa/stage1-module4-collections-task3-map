package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.entrySet().stream().anyMatch(e -> e.getValue().equals(requiredValue));
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer x : sourceList) {
            result.put(x, 5 * x + 2);
        }
        return result;
    }
}
