public class Cilindro extends Forma{
    private double radio;
    private double altura;

    public  Cilindro (String Nombre , double Radio , double Altura){
        super(Nombre);
        radio=Radio;
        altura=Altura;
    }

    @Override
    public double Area() {
        return Math.PI*radio * radio* altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}
