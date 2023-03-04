package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        for(List<String> value:timetable.values()){
            result.addAll(value);
        }
        return result;
    }
}
