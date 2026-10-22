package Java.Dsa.Learn.Java.Interview.Quetions.TreeExmpl.dsaSeries;

import javax.xml.transform.SourceLocator;
import java.util.*;

public class IntervalMerging {
    public static void main(String[] args) {
        Integer[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Arrays.stream(arr).sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}

class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if (intervals.isEmpty())
            return intervals;
        Collections.sort(intervals, new IntervalComparator());
        Interval interval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if (interval.start < interval.end)
                interval.end = Math.min(interval.start, interval.end);
        }
        return intervals;
    }
}

class Interval {
    int start;
    int end;

    public Interval() {
        start = end = 0;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
    }
}

/*
FAULTY PROGRAM WHICH CANNOT BE TO SOLVED BY ME TILL LAST :-
Show that:
Given a collection of intervals, merge all overlapping intervals.
For example,
Given [1,3],[2,6],[8,10],[15,18]
return [1,6],[8,10],[15,18].

Bad Approach :
//        Arrays.stream(arr).toList().sort((a, b) -> (Integer.compare(b[0], a[0])));
//
//        try {
//            Arrays.stream(arr).toList().iterator().forEachRemaining(System.out::println);
//        } catch (Exception e) {
//            Method[] methods = e.getClass().getMethods();
//            Arrays.stream(methods).forEach(System.out::println);
//        }
//        int[][] ints = mergeIntervals(arr);
//        Arrays.stream(ints).forEach(System.out::println);


 */