public class Auto extends Vehiculo {

    boolean ruedaAuxilio;
    int velocidadAuto;


    public Auto(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }

    @Override
    public int getVelocidad() {
        return velocidad + velocidadAuto;
    }

    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad + velocidadAuto;
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
}
