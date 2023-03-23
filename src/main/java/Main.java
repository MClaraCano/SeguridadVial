public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto(true, 120);
        Conductor conductor = new Conductor("Carlos", auto, false);

        System.out.println("");
        System.out.println("¿El auto de " + conductor.getNombre() + " es seguro?");
        System.out.println(conductor.getAuto().autoEsSeguro(auto));
        System.out.println("");
        System.out.println("¿" + conductor.getNombre() + " es un conductor seguro?");
        conductor.conductorEsSeguro(conductor);

    }
}
