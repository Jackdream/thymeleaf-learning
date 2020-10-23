package com.example.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class StreamDemo {

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("singlecode", "E00401081F40FB");
        map.put("outstorehouseid", "3be8000b-42db-42a4-b892-7812aa598266");
        list.add(map);
        map = new HashMap<>();
        map.put("singlecode", "E00401081F40FB");
        map.put("outstorehouseid", "3be8000b-42db-42a4-b892-7812aa598269");
        list.add(map);
        map = new HashMap<>();
        map.put("singlecode", "E00401081F40FC");
        map.put("outstorehouseid", "3be8000b-42db-42a4-b892-7812aa598210");
        list.add(map);

        List<Object> result = list.stream()
                .collect(Collectors.toMap(e -> e.get("singlecode"), e -> 1, (a, b) -> a + b))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        
        log.info("result: {}", result);

    }
}
