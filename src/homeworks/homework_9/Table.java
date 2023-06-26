package homeworks.homework_9;

public class Table {

    private int number;
    private boolean isFree;

    public Table(int number) {
        this.number = number;
        this.isFree = true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
