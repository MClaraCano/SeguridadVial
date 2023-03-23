public class Conductor {

    private Auto auto;
    private Moto moto;
    private boolean tieneRegistro;



    public Conductor() {
    }

    public Conductor(Auto auto, Moto moto, boolean tieneRegistro) {
        this.auto = auto;
        this.moto = moto;
        this.tieneRegistro = tieneRegistro;
    }

    public Conductor(Auto auto, boolean tieneRegistro) {
        this.auto = auto;
        this.tieneRegistro = tieneRegistro;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public boolean isTieneRegistro() {
        return tieneRegistro;
    }

    public void setTieneRegistro(boolean tieneRegistro) {
        this.tieneRegistro = tieneRegistro;
    }



    boolean autoSeguro;
    public void autoEsSeguro (Auto auto){
        if (auto.isRuedaAuxilio() && auto.getVelocidad() <= 140){
            System.out.println("Auto seguro: Cuenta con rueda de auxilio y velocidad permitida");
            autoSeguro = true;
        } else {
            System.out.println ("Sin rueda de auxilio y/o velocidad alta: Auto NO seguro");
            autoSeguro = false;
        }
    }

    boolean motoSegura;
    public void motoEsSegura (Moto moto){
        if (moto.espejosRetrovisores >= 2 && moto.getVelocidad() < 160){
            System.out.println("Moto segura: Cuenta con al menos 2 esp. retrovisores y velocidad permitida");
            autoSeguro = true;
        } else {
            System.out.println("Sin suficientes esp. retrovisores y/o velocidad alta: Auto NO seguro");
            autoSeguro = false;
        }
    }

    public void conductorEsSeguro(Conductor conductor){
        if (conductor.tieneRegistro && autoSeguro){
            System.out.println("Conductor seguro: Cuenta con registro y auto seguro");
        } else {
            System.out.println("Conductor no seguro: No tiene registro y/o auto seguro");
        }
    }

}
