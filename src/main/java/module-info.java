module org.utl.dsm401.kirklear.sicefa_desktop_f {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utl.dsm401.kirklear.sicefa_desktop_f to javafx.fxml;
    exports org.utl.dsm401.kirklear.sicefa_desktop_f;
}