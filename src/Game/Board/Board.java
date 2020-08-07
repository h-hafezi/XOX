package Game.Board;

import java.util.HashMap;

public class Board {
    private HashMap<Integer, Integer> tiles = new HashMap<>();

    public Board() {
        tiles.put(1, 0);
        tiles.put(2, 0);
        tiles.put(3, 0);
        tiles.put(4, 0);
        tiles.put(5, 0);
        tiles.put(6, 0);
        tiles.put(7, 0);
        tiles.put(8, 0);
        tiles.put(9, 0);
    }

    public boolean isTileFull(int i) {
        return tiles.getOrDefault(i, 1989) != 0;
    }

    public boolean tileContainsX(int i) {
        return tiles.getOrDefault(i, 1989) == 1;
    }

    public boolean tileContainsO(int i) {
        return tiles.getOrDefault(i, 1989) == -1;
    }

    public void putX(int i) {
        tiles.put(i, 1);
    }

    public void putO(int i) {
        tiles.put(i, -1);
    }

    public boolean win() {
        return winColumn1() || winColumn2() || winColumn3() || winRow1() || winRow2() || winRow3() || winDiameter1() || winDiameter2();
    }

    public boolean equal() {
        for (int i = 1; i <= 9; i++) {
            if (!isTileFull(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean winRow1() {
        int x1 = tiles.get(1);
        int x2 = tiles.get(2);
        int x3 = tiles.get(3);
        return (x1 == 1 && x2 == 1 && x3 == 1) || (x1 == -1 && x2 == -1 && x3 == -1);
    }

    public boolean winRow2() {
        int x4 = tiles.get(4);
        int x5 = tiles.get(5);
        int x6 = tiles.get(6);
        return (x4 == 1 && x5 == 1 && x6 == 1) || (x4 == -1 && x5 == -1 && x6 == -1);
    }

    public boolean winRow3() {
        int x7 = tiles.get(7);
        int x8 = tiles.get(8);
        int x9 = tiles.get(9);
        return (x7 == 1 && x8 == 1 && x9 == 1) || (x7 == -1 && x8 == -1 && x9 == -1);
    }

    public boolean winColumn1() {
        int x1 = tiles.get(1);
        int x4 = tiles.get(4);
        int x7 = tiles.get(7);
        return (x1 == 1 && x4 == 1 && x7 == 1) || (x1 == -1 && x4 == -1 && x7 == -1);
    }

    public boolean winColumn2() {
        int x2 = tiles.get(2);
        int x5 = tiles.get(5);
        int x8 = tiles.get(8);
        return (x2 == 1 && x5 == 1 && x8 == 1) || (x2 == -1 && x5 == -1 && x8 == -1);
    }

    public boolean winColumn3() {
        int x3 = tiles.get(3);
        int x6 = tiles.get(6);
        int x9 = tiles.get(9);
        return (x3 == 1 && x6 == 1 && x9 == 1) || (x3 == -1 && x6 == -1 && x9 == -1);
    }

    public boolean winDiameter1() {
        int x1 = tiles.get(1);
        int x5 = tiles.get(5);
        int x9 = tiles.get(9);
        return (x1 == 1 && x5 == 1 && x9 == 1) || (x1 == -1 && x5 == -1 && x9 == -1);
    }

    public boolean winDiameter2() {
        int x3 = tiles.get(3);
        int x5 = tiles.get(5);
        int x7 = tiles.get(7);
        return (x3 == 1 && x5 == 1 && x7 == 1) || (x3 == -1 && x5 == -1 && x7 == -1);
    }


}
