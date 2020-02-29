package io.crocker.gdj.tictactoe.game.players;

import io.crocker.gdj.tictactoe.game.SquareState;

public class RandomPlayer extends BasePlayer
{
    @Override
    public SquareState[] move(SquareState[] state, SquareState piece)
    {
        boolean invalid = true;

        int index;

        do {
            double dindex = Math.floor(1 + Math.random() * 9);
            index = (int) dindex;

            invalid = this.validateInput(index, state) == -1;
        } while (invalid);

        index = index - 1;

        System.out.println(index);

        state[index] = piece;

        return state;
    }
}
