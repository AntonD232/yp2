module ru.davydov.davydov_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task5 to javafx.fxml;
    exports ru.davydov.davydov_task5;
}