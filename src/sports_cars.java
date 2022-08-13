public class sports_cars implements Printable {
    private int speed;

    public sports_cars(int speed) {
        this.speed = speed;
    }

    public String getInfo(){
        return "Speed: " + speed;
    }

    @Override
    public void print() {
    }
}
