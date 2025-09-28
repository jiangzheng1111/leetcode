package edu.bupt.HashAndTwoPoints;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            String tempStr = new String(tempChar);

            List<String> tempList = map.getOrDefault(tempStr, new ArrayList<>());
            tempList.add(str);
            map.put(tempStr, tempList);
        }
        return new ArrayList<>(map.values());
    }
}
