module one.digitalinnovation.collection.apicollections {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens one.digitalinnovation.collection to javafx.fxml;
    exports one.digitalinnovation.collection;
}