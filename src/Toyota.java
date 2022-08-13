public class Toyota extends sports_cars{
    private String model;

    public Toyota(int speed, String model) {
        super(speed);
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nmodel: " + model);
    }
}
