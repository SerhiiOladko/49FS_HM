package app.staff.logistics;

public class LogisticsManager {
    private WarehouseSupervisor warehouseSupervisor;
    private DeliverySupervisor deliverySupervisor;

    public void manageLogistics() {
        System.out.println("Начало работы логистики...");
        warehouseSupervisor.superviseWarehouse();
        deliverySupervisor.superviseDelivery();
        System.out.println("Работа логистики завершена.");
    }

    public void setWarehouseSupervisor(WarehouseSupervisor warehouseSupervisor) {
        this.warehouseSupervisor = warehouseSupervisor;
    }

    public void setDeliverySupervisor(DeliverySupervisor deliverySupervisor) {
        this.deliverySupervisor = deliverySupervisor;
    }
}
