module com.jmc.javafxmasteryclass {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.jmc.javafxmasteryclass to javafx.fxml;
    exports com.jmc.javafxmasteryclass;
}