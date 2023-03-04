package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            if (!result.containsKey(key.length())) {
                Set<String> tmp =new HashSet<>();
                tmp.add(key);
                result.put(key.length(), tmp);
            }
            else {
                Set<String> tmp = result.get(key.length());
                tmp.add(key);
                result.put(key.length(),tmp);
            }

        }
        return result;
    }
}
