public class Pintura {
    private double cobertura;

    public Pintura (double Cobert){
        cobertura=Cobert;
    }

    public double cantidadPintura (Forma obj){
    return obj.Area() / cobertura;
    }
}
