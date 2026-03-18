package edu.bupt.ArraysAndMatrixAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int size = list.size();
            if (size > 0 && interval[0] <= list.get(size - 1)[1]) {
                list.get(size - 1)[1] = Math.max(list.get(size - 1)[1], interval[1]);
            } else {
                list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
