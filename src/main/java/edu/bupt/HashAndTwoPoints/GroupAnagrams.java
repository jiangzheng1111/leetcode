package edu.bupt.HashAndTwoPoints;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sc = str.toCharArray();
            Arrays.sort(sc);
            String tempS = new String(sc);
            List<String> tempList = map.getOrDefault(tempS, new ArrayList<>());
            tempList.add(str);
            map.put(tempS, tempList);
        }
        return new ArrayList<>(map.values());
    }
}
