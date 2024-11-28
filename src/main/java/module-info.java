module htl.steyr.adventcalender {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    opens htl.steyr.adventcalender to javafx.fxml;
    exports htl.steyr.adventcalender;
}