package chapter7.TortoiseHare.racers;

import chapter7.TortoiseHare.enums.HareMoveType;
import chapter7.TortoiseHare.enums.TortoiseMoveType;

import java.math.BigDecimal;

public class Hare {

    int position = BigDecimal.ONE.intValue();


    public void move(HareMoveType hareMoveType) {
        boolean outOfPosition = this.position < BigDecimal.ONE.intValue();

        if(hareMoveType.equals(HareMoveType.BIG_HOP)){
            this.position += 9;
        }
        else if(hareMoveType.equals(HareMoveType.BIG_SLIP)){
            this.position -= 12;
            if (outOfPosition) resetMove();
        } else if(hareMoveType.equals(HareMoveType.SMALL_HOP)){
            this.position += BigDecimal.ONE.intValue();
        } else if(hareMoveType.equals(HareMoveType.SMALL_SLIP)){
            this.position += BigDecimal.TWO.intValue();
        }
    }

    private void resetMove(){
        this.position = BigDecimal.ONE.intValue();
    }
}
