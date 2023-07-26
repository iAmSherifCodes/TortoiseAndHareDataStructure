package chapter7.TortoiseHare.racers;

import chapter7.TortoiseHare.enums.TortoiseMoveType;

import java.math.BigDecimal;

public class Tortoise {
    int position = BigDecimal.ONE.intValue();

//    @Override
//    public void move() {
//        if (TortoiseMoveType.FAST_PLOD)
//    }

    public void move(TortoiseMoveType tortoiseMoveType) {
        boolean outOfPosition = this.position < BigDecimal.ONE.intValue();

        if (tortoiseMoveType.equals(TortoiseMoveType.FAST_PLOD))this.position += 3;
        else if(tortoiseMoveType.equals(TortoiseMoveType.SLIP)){
            this.position -= 6;
            if (outOfPosition) resetMove();
        }
        else if(tortoiseMoveType.equals(TortoiseMoveType.SLOW_POD)){
            this.position += 1;
        }
    }

    private void resetMove(){
        this.position = BigDecimal.ONE.intValue();
    }
}
