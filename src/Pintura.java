public class Pintura {
    private double cobertura;

    public Pintura (double Cobert){
        cobertura=Cobert;
    }

    public double cantidadPintura (double Area){
    return  Area / cobertura;
    }
}
