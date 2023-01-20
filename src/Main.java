public class Main {
    public static void main(String[] args) {

        Pintura Pintura1 =new Pintura(250);
        Rectangulo Rectangulo1 = new Rectangulo("Rectangulo1" , 20 , 35);
        Esfera Esfera1 = new Esfera("Esfera1" , 15);
        Cilindro Cilindro1 = new Cilindro("Cilindro1" , 10 ,30);
        System.out.println("Los litros de pintura necesarios son: " + Pintura1.cantidadPintura(Rectangulo1.Area()) + " L para el " + Rectangulo1.toString());
        System.out.println("Los litros de pintura necesarios son: " + Pintura1.cantidadPintura(Esfera1.Area()) + " L para la " + Esfera1.toString());
        System.out.println("Los litros de pintura necesarios son: " + Pintura1.cantidadPintura(Cilindro1.Area()) + " L para el " + Cilindro1.toString());

    }
}