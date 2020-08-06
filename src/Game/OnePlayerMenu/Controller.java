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

    public void easyClicked(ActionEvent actionEvent) {
        // game page
    }

    public void hardClicked(ActionEvent actionEvent) {
        // game page
    }

    public void insaneClicked(ActionEvent actionEvent) {
        //game page
    }

    public void easyEnter(MouseEvent mouseEvent) {
        easyButton.setStyle("-fx-background-color: Navy; ");
    }

    public void easyExit(MouseEvent mouseEvent) {
        easyButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void hardEnter(MouseEvent mouseEvent) {
        hardButton.setStyle("-fx-background-color: Navy; ");
    }

    public void hardExit(MouseEvent mouseEvent) {
        hardButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void insaneEntered(MouseEvent mouseEvent) {
        insaneButton.setStyle("-fx-background-color: Navy; ");
    }

    public void insaneExit(MouseEvent mouseEvent) {
        insaneButton.setStyle("-fx-background-color: royalblue; ");
    }

    public void exitClicked(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Exit", ButtonType.YES, ButtonType.NO);
        alert.setTitle("exit alert");
        alert.showAndWait();
        if (alert.getResult().equals(ButtonType.YES)) {
            System.exit(1989);
        }
    }

    public void backClicked(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Game/GameMenu/GameStart.fxml"));
        Main.stage.setScene(new Scene(root));
    }

}
