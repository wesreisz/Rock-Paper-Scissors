package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.GameResult;
import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class ScissorsGameType implements GameType {

    @Override
    public GameResult eval(Integer opponentChoice) {
        GameResult result = new GameResult();
        if (opponentChoice== R.id.btnSpock){
            result.setWinner(R.id.btnSpock);
            result.setTextResult(GameUtils.SMASHES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.LOSES_TO);
        }else if (opponentChoice==R.id.btnPaper){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.CUTS);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.BEATS);
        }else if (opponentChoice==R.id.btnRock){
            result.setWinner(R.id.btnRock);
            result.setTextResult(GameUtils.CRUSHES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.LOSES_TO);
        }else if (opponentChoice==R.id.btnLizard){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.DECAPITATES);
            result.setLoser(R.id.btnLizard);
            result.setStatus(GameUtils.BEATS);
        }
        else{
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.TIES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.PUSH);
        }
        return result;
    }
}
