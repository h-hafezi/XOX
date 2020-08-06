package Game.GameMenu;

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

    public void twoPlayersClicked(ActionEvent actionEvent) {
    }

    public void onePlayerClicked(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Game/OnePlayerMenu/OnePlayerMenu.fxml"));
        Main.stage.setScene(new Scene(root));
    }

    public void exit(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Exit", ButtonType.YES, ButtonType.NO);
        alert.setTitle("exit alert");
        alert.showAndWait();
        if (alert.getResult().equals(ButtonType.YES)) {
            System.exit(1989);
        }
    }

    public void twoPlayerEnter(MouseEvent mouseEvent) {
        twoPlayers.setStyle("-fx-background-color: ForestGreen; ");
    }

    public void twoPlayerExit(MouseEvent mouseEvent) {
        twoPlayers.setStyle("-fx-background-color: MediumSeaGreen; ");
    }

    public void onePlayerEnter(MouseEvent mouseEvent) {
        onePlayer.setStyle("-fx-background-color: ForestGreen; ");
    }

    public void onePlayerExit(MouseEvent mouseEvent) {
        onePlayer.setStyle("-fx-background-color: MediumSeaGreen; ");
    }

}
