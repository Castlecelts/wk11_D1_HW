public class WaterBottle {
    private double volume;

    public WaterBottle(double volume){
        this.volume = volume;
    }

    public double currentVolume(){
        return this.volume;
    }

    public void takeADrink() {
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }
}
