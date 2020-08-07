package Game.Game;

import Game.Board.Board;
import Game.GameController;
import Game.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {
    public ImageView turnImage;
    public Pane gamePane;
    static Controller controller;
    public Label text1;
    public Label text2;
    private double xOffset = 0;
    private double yOffset = 0;

    public void initialize() throws IOException {
        gamePane.getChildren().clear();
        gamePane.getChildren().add(FXMLLoader.load(getClass().getResource("/Game/Game/GamePane.fxml")));
        controller = this;
    }

    public void updateTurnImage() {
        if (GameController.gameController.is_o_turn()) {
            turnImage.setImage(get_image_o());
        }
        if (GameController.gameController.is_x_turn()) {
            turnImage.setImage(get_image_x());
        }
    }

    private static Image get_image_x() {
        try {
            return new Image(new FileInputStream("src/Resources/8-grunge-x-brush-stroke-9.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Image get_image_o() {
        try {
            return new Image(new FileInputStream("src/Resources/images (1).png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void restartClicked(MouseEvent mouseEvent) throws FileNotFoundException {
        GamePane.gamePane.setMedia();
        resetImages();
        GameController.gameController.reset();
        turnImage.setImage(get_image_x());
        resetTexts();
        turnImage.setVisible(true);
    }

    public void back(MouseEvent mouseEvent) throws IOException {
        restartClicked(mouseEvent);
        Parent root = FXMLLoader.load(getClass().getResource("/Game/GameMenu/GameStart.fxml"));
        Main.stage.setScene(new Scene(root));
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            Main.stage.setX(event.getScreenX() - xOffset);
            Main.stage.setY(event.getScreenY() - yOffset);
        });
    }

    public static void resetImages() throws FileNotFoundException {
        GamePane.gamePane.resetImages();
        GamePane.board = new Board();
    }

    public void resetTexts() {
        text1.setVisible(true);
        text2.setVisible(true);
        text1.setText("It's");
        text2.setText("turn to play!");
    }

    public void setTextsForWin() {
        text2.setText(" has won!");
        text1.setVisible(false);
    }

    public void setTextForEqual() {
        text2.setText("draw!");
        text1.setVisible(false);
        turnImage.setVisible(false);

    }


}
