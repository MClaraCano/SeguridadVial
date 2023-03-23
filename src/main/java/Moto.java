public class Moto extends Vehiculo{

    int espejosRetrovisores;



    public Moto(int espejosRetrovisores) {
        this.espejosRetrovisores = espejosRetrovisores;
    }

    public Moto(int velocidad, int espejosRetrovisores) {
        super(velocidad);
        this.espejosRetrovisores = espejosRetrovisores;
    }

    public Moto() {
    }

    public int getEspejosRetrovisores() {
        return espejosRetrovisores;
    }

    public void setEspejosRetrovisores(int espejosRetrovisores) {
        this.espejosRetrovisores = espejosRetrovisores;
    }


    boolean motoSegura;
    public void motoEsSegura (Moto moto){
        if (moto.espejosRetrovisores >= 2 && moto.getVelocidad() < 160){
            System.out.println("Moto segura: Cuenta con al menos 2 esp. retrovisores y velocidad permitida");
            motoSegura = true;
        } else {
            System.out.println("Sin suficientes esp. retrovisores y/o velocidad alta: Auto NO seguro");
            motoSegura = false;
        }
    }
}
