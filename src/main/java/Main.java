public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto(100, true, 20);
        Conductor conductor = new Conductor(auto, false);

        conductor.autoEsSeguro(auto);
        conductor.conductorEsSeguro(conductor);

    }
}
