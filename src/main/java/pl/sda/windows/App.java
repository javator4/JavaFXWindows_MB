package pl.sda.windows;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import pl.sda.windows.controller.RootController;

/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main (String[] args)
    {
        launch(args);
    }

    @Override
    public  void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation((getClass().getResource("/root.fxml")));
        fxmlLoader.load();

        RootController controller = fxmlLoader.getController();
        System.out.println(controller);
        Parent parent = fxmlLoader.getRoot();
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
}

