public class Auto extends Vehiculo {

    private boolean ruedaAuxilio;
    private int velocidadAuto = 100;

    Vehiculo vehiculo;

    public Auto(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }


    public int getVelocidadAuto() {
        return velocidadAuto;
    }

    public void setVelocidadAuto(int velocidadAuto) {
        this.velocidadAuto = velocidadAuto;
    }

    public Auto(boolean ruedaAuxilio, int velocidadAuto) {
        this.ruedaAuxilio = ruedaAuxilio;
        this.velocidadAuto = velocidadAuto;
    }

    public Auto(int velocidad, boolean ruedaAuxilio, int velocidadAuto) {
        super(velocidad);
        this.ruedaAuxilio = ruedaAuxilio;
        this.velocidadAuto = velocidadAuto;
    }

    public Auto() {
    }

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public void setRuedaAuxilio(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }


    boolean autoSeguro;
    public boolean autoEsSeguro (Auto auto){
        if (auto.isRuedaAuxilio() && auto.getVelocidadAuto() <= 140){
            return autoSeguro = true;
        } else {
            return autoSeguro = false;
        }
    }
}


