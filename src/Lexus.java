public class Lexus extends sports_cars{
    private int year;

    public Lexus(int speed, int year) {
        super(speed);
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nyear: " + year);
    }
}
