package Game.Game;

import Game.Board.Board;
import Game.GameController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GamePane {
    public MediaView mediaView;
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;
    public ImageView image7;
    public ImageView image8;
    public ImageView image9;
    public static Board board = new Board();
    static GamePane gamePane;

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

    public void resetImages() throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/Resources/images.jpg");
        Image image = new Image(input);
        image1.setImage(image);
        image1.setDisable(false);
        image2.setImage(image);
        image2.setDisable(false);
        image3.setImage(image);
        image3.setDisable(false);
        image4.setImage(image);
        image4.setDisable(false);
        image5.setImage(image);
        image5.setDisable(false);
        image6.setImage(image);
        image6.setDisable(false);
        image7.setImage(image);
        image7.setDisable(false);
        image8.setImage(image);
        image8.setDisable(false);
        image9.setImage(image);
        image9.setDisable(false);
    }

    public void setMedia() {
        new Thread(() -> {
            String path = "src/Resources/wait.mp4";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
        }).start();
    }

    public void initialize() throws IOException {
        resetImages();
        setMedia();
        gamePane = this;
    }

    private boolean is_x_turn() {
        return GameController.gameController.is_x_turn();
    }

    private boolean is_o_turn() {
        return GameController.gameController.is_o_turn();
    }

    public void clicked1() {
        if (board.isTileFull(1)) {
            return;
        }
        if (is_o_turn()) {
            image1.setImage(get_image_o());
            board.putO(1);
        }
        if (is_x_turn()) {
            image1.setImage(get_image_x());
            board.putX(1);
        }
        image1.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked2() {
        if (board.isTileFull(2)) {
            return;
        }
        if (is_o_turn()) {
            image2.setImage(get_image_o());
            board.putO(2);
        }
        if (is_x_turn()) {
            image2.setImage(get_image_x());
            board.putX(2);
        }
        image2.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked3() {
        if (board.isTileFull(3)) {
            return;
        }
        if (is_o_turn()) {
            image3.setImage(get_image_o());
            board.putO(3);
        }
        if (is_x_turn()) {
            image3.setImage(get_image_x());
            board.putX(3);
        }
        image3.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked4() {
        if (board.isTileFull(4)) {
            return;
        }
        if (is_o_turn()) {
            image4.setImage(get_image_o());
            board.putO(4);
        }
        if (is_x_turn()) {
            image4.setImage(get_image_x());
            board.putX(4);
        }
        image4.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked5() {
        if (board.isTileFull(5)) {
            return;
        }
        if (is_o_turn()) {
            image5.setImage(get_image_o());
            board.putO(5);
        }
        if (is_x_turn()) {
            image5.setImage(get_image_x());
            board.putX(5);
        }
        image5.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked6() {
        if (board.isTileFull(6)) {
            return;
        }
        if (is_o_turn()) {
            image6.setImage(get_image_o());
            board.putO(6);
        }
        if (is_x_turn()) {
            image6.setImage(get_image_x());
            board.putX(6);
        }
        image6.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked7() {
        if (board.isTileFull(7)) {
            return;
        }
        if (is_o_turn()) {
            image7.setImage(get_image_o());
            board.putO(7);
        }
        if (is_x_turn()) {
            image7.setImage(get_image_x());
            board.putX(7);
        }
        image7.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked8() {
        if (board.isTileFull(8)) {
            return;
        }
        if (is_o_turn()) {
            image8.setImage(get_image_o());
            board.putO(8);
        }
        if (is_x_turn()) {
            image8.setImage(get_image_x());
            board.putX(8);
        }
        image8.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public void clicked9() {
        if (board.isTileFull(9)) {
            return;
        }
        if (is_o_turn()) {
            image9.setImage(get_image_o());
            board.putO(9);
        }
        if (is_x_turn()) {
            image9.setImage(get_image_x());
            board.putX(9);
        }
        image9.setDisable(true);
        GameController.gameController.change_turn();
        updateTurnImage();
        checkWin();
    }

    public static void updateTurnImage() {
        Controller.controller.updateTurnImage();
    }

    // it checks both win and draw

    public void checkWin() {
        if (board.win()) {
            Controller.controller.setTextsForWin();
            GameController.gameController.change_turn();
            updateTurnImage();
            image1.setDisable(true);
            image2.setDisable(true);
            image3.setDisable(true);
            image4.setDisable(true);
            image5.setDisable(true);
            image6.setDisable(true);
            image7.setDisable(true);
            image8.setDisable(true);
            image9.setDisable(true);
            setMediaForWinning();
        } else if (board.equal()) {
            Controller.controller.setTextForEqual();
            image1.setDisable(true);
            image2.setDisable(true);
            image3.setDisable(true);
            image4.setDisable(true);
            image5.setDisable(true);
            image6.setDisable(true);
            image7.setDisable(true);
            image8.setDisable(true);
            image9.setDisable(true);
            setMediaForEqual();
        }
    }

    // changes to winning gif

    public void setMediaForWinning() {
        new Thread(() -> {
            String path = "src/Resources/mp4 (2).mp4";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
        }).start();
    }

    // changes to draw gif

    public void setMediaForEqual(){
        new Thread(() -> {
            String path = "src/Resources/waiting.mp4";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
        }).start();
    }


}
