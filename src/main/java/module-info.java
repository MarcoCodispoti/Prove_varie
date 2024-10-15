module com.example.prove_varie {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.prove_varie.Classi.ProvaJavaFX;     //esporto direttamente tutta la cartella con i Graphic controller  insieme a FxmlLoader (classe nostra) (nel nostro caso si chiama JavaFX)
    opens com.example.prove_varie to javafx.fxml;
    opens com.example.prove_varie.Classi.ProvaJavaFX;
    exports com.example.prove_varie;
}