import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Jana on 29.10.2016.
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


        Circle ring = new Circle (50);
        stack.getChildren().add(ring);

        primaryStage.show();
    }
}


