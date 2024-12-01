package app.code;

import app.staff.logistics.LogisticsManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("app.config");

        LogisticsManager manager = context.getBean(LogisticsManager.class);
        manager.manageLogistics();

        context.close();
    }
}
