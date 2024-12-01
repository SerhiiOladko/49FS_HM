package app.staff.logistics;

import app.staff.specialists.logistics.Loader;
import app.staff.specialists.logistics.WarehouseOperator;

public class WarehouseSupervisor {
    private Loader loader;
    private WarehouseOperator operator;

    public void superviseWarehouse() {
        System.out.println("Контроль работы склада:");
        loader.loadGoods();
        operator.manageInventory();
    }

    public void setLoader(Loader loader) {
        this.loader = loader;
    }

    public void setOperator(WarehouseOperator operator) {
        this.operator = operator;
    }
}

