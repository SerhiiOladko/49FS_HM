package app.staff.logistics;

import app.staff.specialists.logistics.Courier;
import app.staff.specialists.logistics.RoutePlanner;

public class DeliverySupervisor {
    private Courier courier;
    private RoutePlanner planner;

    public void superviseDelivery() {
        System.out.println("Контроль работы доставки:");
        planner.planRoute();
        courier.deliverPackage();
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public void setPlanner(RoutePlanner planner) {
        this.planner = planner;
    }
}

