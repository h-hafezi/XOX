package Game.GameMenu;

import Game.GameController;
import Game.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    public Button twoPlayers;
    public Button onePlayer;
    public Pane pane;
    private double xOffset = 0;
    private double yOffset = 0;

    public void twoPlayersClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Game/Game/Game.fxml"));
        Main.stage.setScene(new Scene(root));
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            Main.stage.setX(event.getScreenX() - xOffset);
            Main.stage.setY(event.getScreenY() - yOffset);
        });
        new GameController("two players", null);
    }

    public void onePlayerClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Game/OnePlayerMenu/OnePlayerMenu.fxml"));
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

    public void exit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Exit", ButtonType.YES, ButtonType.NO);
        alert.setTitle("exit alert");
        alert.showAndWait();
        if (alert.getResult().equals(ButtonType.YES)) {
            System.exit(1989);
        }
    }

    public void twoPlayerEnter() {
        twoPlayers.setStyle("-fx-background-color: ForestGreen; ");
    }

    public void twoPlayerExit() {
        twoPlayers.setStyle("-fx-background-color: MediumSeaGreen; ");
    }

    public void onePlayerEnter() {
        onePlayer.setStyle("-fx-background-color: ForestGreen; ");
    }

    public void onePlayerExit() {
        onePlayer.setStyle("-fx-background-color: MediumSeaGreen; ");
    }

}
