package chapter7.TortoiseHare.racers;

import chapter7.TortoiseHare.enums.TortoiseMoveType;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Tortoise contender
 * @author SHERIF
 * @version 1.0
 */
public class Tortoise {
    int position = BigDecimal.ONE.intValue();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int position){
        if (position > 0 && position <= 5) move(TortoiseMoveType.FAST_PLOD);
        else if (position > 5 && position < 8) move(TortoiseMoveType.SLIP);
        else if (position >7 && position <=10) move(TortoiseMoveType.SLOW_POD);
    }

    public void move(TortoiseMoveType tortoiseMoveType) {
        boolean outOfPosition = this.position < BigDecimal.ONE.intValue();

        if (tortoiseMoveType.equals(TortoiseMoveType.FAST_PLOD))this.position += 3;
        else if(tortoiseMoveType.equals(TortoiseMoveType.SLIP)){
            this.position -= 6;
            if (outOfPosition) resetMove();
        }
        else if(tortoiseMoveType.equals(TortoiseMoveType.SLOW_POD)){
            this.position++;
        }
    }

    private void resetMove(){
        this.position = BigDecimal.ONE.intValue();

    }
}
