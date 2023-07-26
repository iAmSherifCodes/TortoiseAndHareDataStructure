package chapter7.TortoiseHare.racers;

import chapter7.TortoiseHare.enums.HareMoveType;

import java.math.BigDecimal;

public class Hare {

    int position = BigDecimal.ONE.intValue();

    public void move(int position){
        if (position > 0 && position <=2)move(HareMoveType.SLEEP);
        else if (position > 2 && position < 5) move(HareMoveType.BIG_HOP);
        else if (position == 5) move(HareMoveType.BIG_SLIP);
        else if (position > 5 && position <= 8)move(HareMoveType.SMALL_HOP);
        else if (position >8 && position <= 10) move(HareMoveType.SMALL_SLIP);
    }


    public void move(HareMoveType hareMoveType) {
//        boolean outOfPosition = this.position < BigDecimal.ONE.intValue();

        if(hareMoveType.equals(HareMoveType.BIG_HOP)){
            this.position += BigDecimal.valueOf(9).intValue();
        }
        else if(hareMoveType.equals(HareMoveType.BIG_SLIP)){
            this.position -= BigDecimal.valueOf(12).intValue();
            if (outOfPosition()) resetMove();
        } else if(hareMoveType.equals(HareMoveType.SMALL_HOP)){
            this.position += BigDecimal.ONE.intValue();
        } else if(hareMoveType.equals(HareMoveType.SMALL_SLIP)){
            this.position -= BigDecimal.TWO.intValue();
            if (outOfPosition()) resetMove();
        }
    }

    private void resetMove(){
        this.position = BigDecimal.ONE.intValue();
    }
    private boolean outOfPosition(){
        return this.position < BigDecimal.ONE.intValue();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
