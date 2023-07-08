package homeworks.homework_10;

import static homeworks.homework_10.BinarySearch.binarySearch;
import static homeworks.homework_10.MergeSort.mergeSort;
import static homeworks.homework_10.QuickSort.quickSort;

import java.util.Arrays;

import homeworks.homework_10.simple_tree.SimpleTree;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 1, 8, 6, 2, 7, 4 };
        int[] originalArray = Arrays.copyOf(array, array.length); // copy of the array

        // Quick Sort
        System.out.printf("Not sorted array: %s\n", Arrays.toString(array));
        quickSort(array);
        System.out.printf("[Quick Sort] Sorted array: %s\n\n", Arrays.toString(array));
        // Restore the original array
        array = Arrays.copyOf(originalArray, originalArray.length);

        // Merge Sort
        System.out.printf("Not sorted array: %s\n", Arrays.toString(array));
        mergeSort(array);
        System.out.printf("[Merge Sort] Sorted array: %s\n\n", Arrays.toString(array));
        // Restore the original array
        array = Arrays.copyOf(originalArray, originalArray.length);

        // Binary Search
        System.out.printf("Array: %s\n", Arrays.toString(array));
        int target = 7;
        binarySearch(array, target);

        // Simple Tree
        SimpleTree tree = new SimpleTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);
        tree.add(7);
        tree.add(13);

        System.out.println("Depth First Traversal:");
        tree.traverseDepthFirst();
        System.out.println();

        System.out.println("Breadth First Traversal:");
        tree.traverseBreadthFirst();
        System.out.println();
    }
}
