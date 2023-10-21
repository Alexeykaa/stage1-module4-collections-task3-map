package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] words = sentence.trim().toLowerCase().split("([ ,.])+");
        for (String w : words) {
            if (!w.isEmpty()) {
                Integer count = result.get(w);
                if (count == null) {
                    count = 1;
                } else {
                    count++;
                }
                result.put(w, count);
            }
        }
        return result;
    }
}
