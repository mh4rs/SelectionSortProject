package sort;


/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class testSelectionSort {
	
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}

public void testPositive(){
    int[] arr = {8, 9, 7, 10, 2};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    System.out.println("Sorted array (Positive Test): " + Arrays.toString(arr));
    int[] expected = {2, 7, 8, 9, 10};
    assertArrayEquals(expected, arr, "Positive numbers not sorted correctly");
}


public void testNegative(){
    int[] arr = {-3, -1, -4, -2, -5};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    System.out.println("Sorted array (Negative Test): " + Arrays.toString(arr));
    int[] expected = {-5, -4, -3, -2, -1};
    assertArrayEquals(expected, arr, "Negative numbers not sorted correctly");
}

public void testMixed(){
    int[] arr = {-2, 0, 4, -1, 3};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    System.out.println("Sorted array (Mixed Test): " + Arrays.toString(arr));
    int[] expected = {-2, -1, 0, 3, 4};
    assertArrayEquals(expected, arr, "Mixed numbers not sorted correctly");
}

public void testDuplicates(){
    int[] arr = {5, -2, 3, -2, 3};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    System.out.println("Sorted array (Duplicates Test): " + Arrays.toString(arr));
    int[] expected = {-2, -2, 3, 3, 5};
    assertArrayEquals(expected, arr, "Array with duplicates not sorted correctly");
}
}
