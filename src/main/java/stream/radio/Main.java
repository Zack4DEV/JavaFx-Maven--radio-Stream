package stream.radio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
   
   @Override
    public void start(Stage stage) throws Exception {
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/static/Main.fxml"));
       fxmlLoader.setRoot(this);
       fxmlLoader.setController(this);

       try {
          Parent root = (Parent) fxmlLoader.load();
           Scene scene = new Scene(root);
           
           scene.getStylesheets().add(ClassLoader.getSystemResource("/static/StyleSheets/Main.css").toExternalForm());
           scene.setFill(Color.FLORALWHITE);
           stage.setTitle("Radio APP");
           stage.setScene(scene);
           stage.initStyle(StageStyle.TRANSPARENT);
           stage.setResizable(true);

           stage.show();
       } catch (IOException exception) {
           throw new RuntimeException(exception);
       }

        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
