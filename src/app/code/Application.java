package app.code;

import app.staff.logistics.DeliverySupervisor;
import app.staff.logistics.LogisticsManager;
import app.staff.logistics.WarehouseSupervisor;
import app.staff.specialists.logistics.Courier;
import app.staff.specialists.logistics.Loader;
import app.staff.specialists.logistics.RoutePlanner;
import app.staff.specialists.logistics.WarehouseOperator;



public class Application {
    public static void main(String[] args) {
        Loader loader = new Loader();
        WarehouseOperator operator = new WarehouseOperator();
        Courier courier = new Courier();
        RoutePlanner planner = new RoutePlanner();

        WarehouseSupervisor warehouseSupervisor = new WarehouseSupervisor();
        warehouseSupervisor.setLoader(loader);
        warehouseSupervisor.setOperator(operator);

        DeliverySupervisor deliverySupervisor = new DeliverySupervisor();
        deliverySupervisor.setCourier(courier);
        deliverySupervisor.setPlanner(planner);

        LogisticsManager manager = new LogisticsManager();
        manager.setWarehouseSupervisor(warehouseSupervisor);
        manager.setDeliverySupervisor(deliverySupervisor);

        manager.manageLogistics();
    }
}
