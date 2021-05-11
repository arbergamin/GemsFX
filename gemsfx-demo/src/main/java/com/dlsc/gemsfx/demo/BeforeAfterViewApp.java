package com.dlsc.gemsfx.demo;

import com.dlsc.gemsfx.BeforeAfterView;
import fr.brouillard.oss.cssfx.CSSFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BeforeAfterViewApp extends Application {

    @Override
    public void start(Stage stage) {
        Image beforeImage = new Image(BeforeAfterViewApp.class.getResource("berlin/before1.png").toExternalForm());
        Image afterImage = new Image(BeforeAfterViewApp.class.getResource("berlin/after1.png").toExternalForm());

        BeforeAfterView beforeAfterView = new BeforeAfterView(beforeImage, afterImage);
        beforeAfterView.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

        StackPane stackPane = new StackPane(beforeAfterView);
        stackPane.setPadding(new Insets(20));
        stackPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(stackPane);
        CSSFX.start();

        stage.setTitle("BeforeAfterView");
        stage.setScene(scene);
        stage.setWidth(1000);
        stage.setHeight(850);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
