package htl.steyr.adventcalender;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class AdventCalendar extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Advent Calendar");

        // Create a GridPane for the calendar
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        int doorSize = 100; // Default door size

        for (int i = 1; i <= 24; i++) {
            Button door = new Button(String.valueOf(i));
            door.setPrefSize(doorSize, doorSize);
            int doorNumber = i; // Capture for lambda

            // Add click event to open the popup with an image
            door.setOnAction(event -> showImagePopup(doorNumber));

            // Calculate row and column positions for the grid
            int row = (i - 1) / 5;
            int col = (i - 1) % 5;

            // Add the door to the grid
            grid.add(door, col, row);

            // Center the larger 24th door
            if (i == 24) {
                GridPane.setHalignment(door, HPos.CENTER);
            }
        }

        // Set up the main scene
        Scene scene = new Scene(grid, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showImagePopup(int doorNumber) {
        Stage popup = new Stage();
        popup.initModality(Modality.APPLICATION_MODAL);
        popup.setTitle("Day " + doorNumber);

        // Load a random image (replace with actual paths to your images)
        Image image = new Image(getClass().getResourceAsStream("/images/" + doorNumber + ".jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(400); // Adjust image size as needed
        imageView.setFitHeight(300);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(imageView);
        Scene popupScene = new Scene(anchorPane, 400, 300);
        popup.setScene(popupScene);
        popup.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

