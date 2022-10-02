package kz.zhelezyaka.findTwoEvenNumbers;

import java.util.Arrays;
import java.util.List;

public class FindTwoEvenNumbers {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(2, 5, 10);
        System.out.println(filterNumbers(lists, new NumbersEven()));
    }

    public static boolean filterNumbers(List<Integer> inventory, NumberPredicate predicate) {
        boolean b = false;
        for (Integer i : inventory) {
            if (predicate.test(i)) {
                b = true;
            }
        }
        return b;
    }

    public static class NumbersEven implements NumberPredicate {
        int count;

        @Override
        public boolean test(Integer integer) {
            if (integer % 2 == 0) {
                count++;
            }
            return count >= 2;
        }
    }

    public interface NumberPredicate {
        boolean test(Integer integer);
    }
}
