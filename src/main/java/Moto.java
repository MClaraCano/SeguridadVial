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
}
