package homeworks.homework_7;

import homeworks.homework_7.exeptions.ArrayDataException;
import homeworks.homework_7.exeptions.ArraySizeException;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[5][5];

        array[0][0] = "0";
        array[0][1] = "0";
        array[0][2] = "0";
        array[0][3] = "0";

        array[1][0] = "1";
        array[1][1] = "1";
        array[1][2] = "1";
        array[1][3] = "1";

        array[2][0] = "2";
        array[2][1] = "2";
        array[2][2] = "2";
        array[2][3] = "2";

        array[3][0] = "3";
        array[3][1] = "3";
        array[3][2] = "3";
        array[3][3] = "3";

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            int result = calculator.doCalc(array);
            System.out.println(result);
        } catch (ArraySizeException e) {
            System.out.println("Unexpected array size. " + e.getMessage());
            System.out.println("Actual array size: " + e.getActualRows() + "x" + e.getActualColumns());
            System.out.println("Expected array size: " + e.getExpectedRows() + "x" + e.getExpectedColumns());
        } catch (ArrayDataException e) {
            System.out.println("Unexpected data in array. " + e.getMessage());
        }
    }
}
