public class Rectangulo extends Forma {
    private double ancho;
    private double longitud;

    public Rectangulo (String nombre ,double Ancho , double Alto  ){
        super(nombre);
        ancho= Ancho;
        longitud = Alto;
    }

    @Override
    public double Area() {
        return ancho* longitud ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
