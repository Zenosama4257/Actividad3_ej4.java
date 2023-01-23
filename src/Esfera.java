public class Esfera extends Forma{
    private double radio;

    public Esfera (String Nombre , double Radio){
        super(Nombre);
        radio=Radio;
    }


    @Override
    public double Area() {
        return 4*Math.PI*radio*radio;
    }


    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}
