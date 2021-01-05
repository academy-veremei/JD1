package by.academy.homework.homework7;

public class Port { ;
    private boolean[] docks;

    private Warehouse warehouse;

    public Port() {
        super();
        warehouse = new Warehouse();
        docks = new boolean[]{true, true, true};
    }

    public boolean[] getDocks() {
        return docks;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

}
