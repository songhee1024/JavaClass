package org.dimigo.Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kor",100);
        map.put("math",100);
        map.put("eng",100);

        printMap(map);

        Map<String, List<String>> map2 = new HashMap();

    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()){
            System.out.println(key +":"+map.get(key) +"|");
        }
    }
}

