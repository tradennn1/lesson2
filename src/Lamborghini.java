public class Lamborghini extends sports_cars{
    private String tires;

    public Lamborghini(int speed, String tires) {
        super(speed);
        this.tires = tires;
    }

    public String getTires(){
        return tires;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\ntyres: " + tires);
    }
}
