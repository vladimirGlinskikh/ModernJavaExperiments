package kz.zhelezyaka.findTwoEvenNumbers;

import kz.zhelezyaka.findTwoEvenNumbers.FindTwoEvenNumbers.NumbersEven;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindTwoEvenNumbersTest {

    @Test
    void filterNumbers() {
        assertTrue(FindTwoEvenNumbers.filterNumbers(Arrays.asList(2, 3, 4), new NumbersEven()));
        assertTrue(FindTwoEvenNumbers.filterNumbers(Arrays.asList(12, 20, 4), new NumbersEven()));
        assertTrue(FindTwoEvenNumbers.filterNumbers(Arrays.asList(3, 18, 2), new NumbersEven()));

        assertFalse(FindTwoEvenNumbers.filterNumbers(Arrays.asList(3, 5, 13), new NumbersEven()));
        assertFalse(FindTwoEvenNumbers.filterNumbers(Arrays.asList(3, 2, 17), new NumbersEven()));
        assertFalse(FindTwoEvenNumbers.filterNumbers(Arrays.asList(2, 13, 23), new NumbersEven()));
    }
}
