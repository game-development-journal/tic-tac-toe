package io.crocker.gdj.tictactoe.game.players;

import io.crocker.gdj.tictactoe.game.SquareState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer extends BasePlayer
{
    @Override
    public SquareState[] move(SquareState[] state, SquareState piece)
    {
        int index = -1;
        try
        {
            boolean invalid = true;

            do
            {
                System.out.println("Please enter index to fill [1-9]: ");

                // Read Input
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
                String strIndex = reader.readLine();
                index = this.validateInput(strIndex, state);

                // Validate Range
                invalid = index == -1;
            } while (invalid);
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
