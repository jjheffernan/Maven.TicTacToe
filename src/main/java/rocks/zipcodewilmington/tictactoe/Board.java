package rocks.zipcodewilmington.tictactoe;

import java.util.*;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {

    int n = 3;
    Map<Integer, Map<Character, Integer>> rows = new HashMap<>();
    Map<Integer, Map<Character, Integer>> cols = new HashMap<>();
    Map<Character, Integer> rDiagonal = new HashMap<>();
    Map<Character, Integer> lDiagonal = new HashMap<>();

    for (int i = 0; i <matrix.length; i++) {
        int x = matrix[i][0];
        int y = matrix[0][i];

        // char move = i % 2;
    }
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
