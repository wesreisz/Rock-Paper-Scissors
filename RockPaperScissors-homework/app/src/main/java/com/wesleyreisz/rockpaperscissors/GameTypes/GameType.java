package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.GameResult;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public interface GameType {
    public GameResult eval(Integer opponentChoice);
}
