package app.config;

@Configuration
public class AppConfig {
    @Bean
    public LogisticsManager logisticsManager() {
        return new LogisticsManager();
    }

    @Bean
    public WarehouseSupervisor warehouseSupervisor() {
        return new WarehouseSupervisor();
    }

    @Bean
    public DeliverySupervisor deliverySupervisor() {
        return new DeliverySupervisor();
    }

    @Bean
    public Loader loader() {
        return new Loader();
    }

    @Bean
    public WarehouseOperator warehouseOperator() {
        return new WarehouseOperator();
    }

    @Bean
    public Courier courier() {
        return new Courier();
    }

    @Bean
    public RoutePlanner routePlanner() {
        return new RoutePlanner();
    }
}
