package client;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientStart extends Application {
    MainPanelIF mainPanelIF;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainPanelIF = new MainPanel();
        try {
            mainPanelIF.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene((Parent) mainPanelIF.getPanel()));
        stage.setMaximized(true);
        stage.show();
    }
}
