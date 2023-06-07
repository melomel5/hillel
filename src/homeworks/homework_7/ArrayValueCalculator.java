package homeworks.homework_7;

import java.util.Arrays;

import homeworks.homework_7.exeptions.ArrayDataException;
import homeworks.homework_7.exeptions.ArraySizeException;

public class ArrayValueCalculator {

    int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int expectedRows = 4;
        int expectedColumns = 4;
        if (array.length != expectedRows || array[0].length != expectedColumns) {
            throw new ArraySizeException("Wrong array size. Array must be 4x4.", array.length, array[0].length,
                    expectedRows, expectedColumns);
        }

        int sum = 0;

        for (String[] row : array) {
            for (String element : row) {
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    int rowIndex = Arrays.asList(array).indexOf(row);
                    int columnIndex = Arrays.asList(row).indexOf(element);
                    throw new ArrayDataException(
                            "Wrong data in cell [" + rowIndex + "][" + columnIndex + "]: " + element, rowIndex,
                            columnIndex, element);
                }
            }
        }
        return sum;
    }
}
