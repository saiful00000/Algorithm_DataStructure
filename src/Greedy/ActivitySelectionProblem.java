
/* In activity selection problem there are given a set of activities with starting and finishing time
*  of each activity and we need to find the maximum number of activities that can be performed by a
*  single person. assuming that a single person can do one activity at a single time.
*
*
*  input : (1, 4) (3, 5) (0, 6) (5, 7) (3, 8) (5, 9) (6, 10) (8, 11) (8, 12) (2, 13) (1214)
*
*  output : (1, 4) (5, 7) (8, 11) (12, 14)
*
*  */


package Greedy;
import java.util.*;

public class ActivitySelectionProblem {
    static class Pair {
        private int start, finish;

        Pair(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        public int getStart() {
            return start;
        }

        public int getFinish() {
            return finish;
        }

        public String toString() {
            return "{" + getStart() + "," + getFinish() + "}";
        }
    }

    static class ActivitySelection {
        public Set<Integer> selectActivity(List<Pair> activities) {
            Set<Integer> set = new HashSet<>();
            int prev = 0;
            set.add(0);
            for (int i = 1; i < activities.size(); i++) {
                if (activities.get(i).getStart() >= activities.get(prev).getFinish()) {
                    set.add(i);
                    prev = i;
                }
            }
            return set;
        }
    }

    public static void main(String[] args) {
        List<Pair> activities = new ArrayList<>();
        activities.add(new Pair(1, 4));
        activities.add(new Pair(3, 5));
        activities.add(new Pair(0, 6));
        activities.add(new Pair(5, 7));
        activities.add(new Pair(3, 8));
        activities.add(new Pair(5, 9));
        activities.add(new Pair(6, 10));
        activities.add(new Pair(8, 11));
        activities.add(new Pair(8, 12));
        activities.add(new Pair(2, 13));
        activities.add(new Pair(12, 14));
        Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());
        ActivitySelection select = new ActivitySelection();
        Set<Integer> set = select.selectActivity(activities);
        for (int i : set) {
            System.out.println(activities.get(i));
        }
    }
}