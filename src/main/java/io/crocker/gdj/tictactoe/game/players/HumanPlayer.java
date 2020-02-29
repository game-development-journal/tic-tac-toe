package io.crocker.gdj.tictactoe.game.players;

import io.crocker.gdj.tictactoe.game.SquareState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer implements IPlayer
{
    @Override
    public SquareState[] move(SquareState[] state, SquareState piece)
    {
        System.out.println("Please enter index to fill [1-9]: ");
        int index = -1;
        try
        {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            String strIndex = reader.readLine();
            index = Integer.parseInt(strIndex);

            // TODO validate range
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        index = index - 1;

        System.out.println(index);

        state[index] = piece;

        return state;
    }
}
