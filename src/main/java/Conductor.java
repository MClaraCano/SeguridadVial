public class Conductor {

    private String nombre;
    private Auto auto;
    private Moto moto;
    private boolean tieneRegistro;



    public Conductor() {
    }

    public Conductor(String nombre, Auto auto, Moto moto, boolean tieneRegistro) {
        this.nombre = nombre;
        this.auto = auto;
        this.moto = moto;
        this.tieneRegistro = tieneRegistro;
    }

    public Conductor(String nombre, Auto auto, boolean tieneRegistro) {
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    boolean esSeguro;

    public boolean conductorEsSeguro(Conductor conductor){
        if (conductor.tieneRegistro && conductor.auto.autoEsSeguro(auto)){
            System.out.println("Conductor seguro: Cuenta con registro y auto seguro");
            esSeguro = true;
        } else if (conductor.tieneRegistro && !conductor.auto.autoEsSeguro(auto)){
            System.out.println("Conductor no seguro: No tiene un auto seguro");
            esSeguro = false;
        } else {
            System.out.println("Conductor no seguro: No tiene registro");
            esSeguro = false;
        } return esSeguro;
    }

}
