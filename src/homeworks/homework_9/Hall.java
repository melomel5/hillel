package homeworks.homework_9;

import java.util.ArrayList;
import java.util.List;

public class Hall {

    private List<Table> tables;

    private final int NUMBER_OF_TABLES = 10;

    public Hall() {
        tables = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_TABLES; i++) {
            tables.add(new Table(i));
        }
    }

    public void showFreeTables() {
        for (Table table : tables) {
            if (table.isFree()) {
                System.out.printf("Table #%d is free\n", table.getNumber());
            }
        }
    }

    public void seatCustomer(Customer customer, int numberOfTable) {
        if (numberOfTable >= 1 && numberOfTable <= tables.size()) {

            Table table = getTableByNumber(numberOfTable);

            if (table.isFree()) {
                System.out.printf("Table #%d is free\n", numberOfTable);
                customer.setTableNumber(numberOfTable);
                table.setFree(false);
            } else {
                System.out.printf("Table #%d is not free. Please select another table\n", numberOfTable);
            }
        }
    }

    private Table getTableByNumber(int tableNumber) {
        return tables.get(tableNumber - 1);
    }
}
