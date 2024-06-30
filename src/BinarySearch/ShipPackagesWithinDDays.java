package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipPackagesWithinDDays {
    // Java program for the above approach
        public static boolean check(List<Integer> v, int index,
                                    int sum, int remain, int n)
        {
            // curr_sum checker for sub_array.
            int xsum = 0;
            // to_check the number of days.
            int cnt = 0;
            // here we go for all parts that are possible.
            for (int i = index; i < n; i++) {
                xsum += v.get(i);
                if (xsum >= sum) {
                    if (xsum == sum)
                        xsum = 0;
                    else
                        xsum = v.get(i);
                    ++cnt;
                }
                if (n - i == remain - cnt)
                    return true;
            }
            if (xsum != 0)
                ++cnt;
            return cnt == remain;
        }

        public static void main(String[] args)
        {
            // weights carrying vector.
            List<Integer> v = new ArrayList<Integer>();
            v.add(1);
            v.add(2);
            v.add(1);
            // number of days.
            int d = 2;
            // max_weights need to ship.
            int m = Collections.max(v);
            // if there is only one day to ship then all
            // the weights need to be shipped in just one day.
            if (d == 1) {
                int sum = 0;
                for (int i = 0; i < v.size(); i++)
                    sum += v.get(i);
                System.out.println(sum);
                return;
            }
            // size of vector and int i for traversing.
            int n = v.size();
            int i = 0;
            // infinite loop.
            while (true) {
                if (check(v, i, m, d, n)) {
                    System.out.print(
                            "Minimum Capacity Of Boat To Ship Weights In "
                                    + d + " Days Should Be: ");
                    System.out.println(m);
                    return;
                }
                ++m;
            }
        }
    }


