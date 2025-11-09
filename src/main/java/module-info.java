module be.vitali {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens be.vitali to javafx.fxml;
    exports be.vitali;
}
