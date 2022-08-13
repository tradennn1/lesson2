public class Main {
    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("threeObject")};
        for (Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "oneObject":
                Lamborghini lamborghini = new Lamborghini(350, "Aventador");
                return lamborghini;

            case "twoObject":
                Lexus lexus = new Lexus(100, 2018);
                return lexus;

            case "threeObject":
                Toyota toyota = new Toyota(230, "Toyota Camry");
                return toyota;
        }
        return null;
    }
}