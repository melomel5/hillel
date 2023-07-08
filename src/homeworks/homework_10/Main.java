package homeworks.homework_10;

import static homeworks.homework_10.BinarySearch.binarySearch;
import static homeworks.homework_10.MergeSort.mergeSort;
import static homeworks.homework_10.QuickSort.quickSort;

import java.util.Arrays;

import homeworks.homework_10.simple_tree.SimpleTree;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 1, 8, 6, 2, 7, 4 };

        // Quick Sort
        quickSort(array);
        System.out.println("Sorted array: ");
        printArray(array);

        // Merge Sort
        mergeSort(array);
        System.out.println("Sorted array:");
        printArray(array);

        // Binary Search
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

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
