public class Forma {
    private String Nombre;


    public Forma (String nombre){
        Nombre=nombre;
    }

    //Podemos observar polimorfismo en los metodos de Area porque según que figura se realizan con cálculos diferentes y en Nombre que es mostrado por el metodo to String porque cada figura tiene un  Nombre diferente.


    @Override
    public String toString() {
        return "Forma{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }

    public double Area (){
        return 0;
    }


}
