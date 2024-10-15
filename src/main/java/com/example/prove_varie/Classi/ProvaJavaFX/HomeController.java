package com.example.prove_varie.Classi.ProvaJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class HomeController{
    @FXML
    private Hyperlink HomePageHyperLink;

    @FXML

    public void ClickedOnHomePageHyperLink(ActionEvent event) throws IOException {      //il comando è collegato al bottone dal file FXML
        FXMLLoader fxmlLoader = javaFX.setPage("altraPagina");                          //Comando per cambiare pagina
    }
}