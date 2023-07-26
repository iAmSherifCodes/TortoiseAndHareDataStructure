package chapter7.TortoiseHare.racers;



public abstract class Contenders {
    int position = 1;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public abstract void move();
}
