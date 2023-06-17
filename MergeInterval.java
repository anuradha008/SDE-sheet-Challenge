import java.util.* ;
class Interval {
        int start;
        int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

public class MergeInterval {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
         int n = intervals.length;
        ArrayList<Interval> ans = new ArrayList<Interval>();
        
        if(intervals.length == 0 || intervals == null) {
            return ans;
        }

        // sort the starting points by ascending order
        Arrays.sort(intervals, (a, b) -> a.start - b.start);
        int start = intervals[0].start;
        int end = intervals[0].finish;

        // for an interval, compare its end with the next intervals start
        for(Interval interval : intervals) {
            if(interval.start <= end) {
                end = Math.max(end, interval.finish);
            }
            else {
                ans.add(new Interval(start, end));
                start = interval.start;
                end = interval.finish;
            }
        }

        ans.add(new Interval(start, end));
        return ans;
    }
    public static void main(String[] args) {
        
    }

}