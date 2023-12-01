package sort;


/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


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
    int[] expected = {2, 7, 8, 9, 10};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    assertArrayEquals(expected, arr, "Positive numbers not sorted correctly");
}

public void testNegative(){
	int[] arr = {-3, -1, -4, -2, -5};
    int[] expected = {-5, -4, -3, -2, -1};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    assertArrayEquals(expected, arr, "Negative numbers not sorted correctly");
}

public void testMixed(){
	int[] arr = {-2, 0, 4, -1, 3};
    int[] expected = {-2, -1, 0, 3, 4};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    assertArrayEquals(expected, arr, "Mixed numbers not sorted correctly");
}

public void testDuplicates(){
	int[] arr = {5, -2, 3, -2, 3};
    int[] expected = {-2, -2, 3, 3, 5};
    SelectionSort sorter = new SelectionSort();
    arr = sorter.basicSelectionSort(arr);
    assertArrayEquals(expected, arr, "Array with duplicates not sorted correctly");
}
}
