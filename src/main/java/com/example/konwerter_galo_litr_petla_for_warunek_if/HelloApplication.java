package com.example.konwerter_galo_litr_petla_for_warunek_if;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        double litr;
        int galon;
        int licznik;
        licznik = 0;
        for(galon = 1; galon <= 100; galon ++){
            litr = galon * 3.7854;
            System.out.println(galon +" galonow to " + litr + " litrow ");
            licznik ++;
            if(licznik == 10){
                System.out.println();
                licznik = 0;
            }
        }
    }
}