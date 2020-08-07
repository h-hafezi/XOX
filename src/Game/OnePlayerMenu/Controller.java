package Game.OnePlayerMenu;

import Game.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller {
    public Button easyButton;
    public Button hardButton;
    public Button insaneButton;
    private double xOffset = 0;
    private double yOffset = 0;

    public void easyClicked(ActionEvent actionEvent) {
        // game page
    }

    public void hardClicked(ActionEvent actionEvent) {
        // game page
    }

    public void insaneClicked(ActionEvent actionEvent) {
        //game page
    }

    public void easyEnter() {
        easyButton.setStyle("-fx-background-color: Navy; ");
    }

    public void easyExit() {
        easyButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void hardEnter() {
        hardButton.setStyle("-fx-background-color: Navy; ");
    }

    public void hardExit() {
        hardButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void insaneEntered() {
        insaneButton.setStyle("-fx-background-color: Navy; ");
    }

    public void insaneExit() {
        insaneButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void exitClicked() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Exit", ButtonType.YES, ButtonType.NO);
        alert.setTitle("exit alert");
        alert.showAndWait();
        if (alert.getResult().equals(ButtonType.YES)) {
            System.exit(1989);
        }
    }

    public void backClicked() throws IOException {
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

}
