import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {
        pruebaCaja();
        pruebaPar();

        System.out.println("Hello, World!");
    }
    public static void pruebaCaja(){
        System.out.println("Prueba de la clase Caja<T>");

        Caja<String> cajaDeTextos = new Caja<String>("Hola mundo");
        System.out.println("La caja de textos contiene: " + cajaDeTextos.obtener());
        Caja<Integer> cajaDeNumeros= new Caja<Integer>(100);
        System.out.println("La caja de números contiene: " + cajaDeNumeros.obtener());
        Caja<Double> cajaDeDecimales = new Caja<Double>(9.75);
        System.out.println("La caja de decimales contiene: " + cajaDeDecimales.obtener());
        System.out.println("¿La caja de textos está vacía? " + cajaDeTextos.estaVacia());
    }
    public static void pruebaPar(){
        System.out.println("Prueba de la clase Par<K,V>");

        Par<Integer,String> par1 = new Par<>( 1,"Juan Perez");
        System.out.println("La clave del par1 es: " + par1.obtenerClave());
        System.out.println("El valor del par1 es: " + par1.obtenerValor());
        Par<String,Integer> par2 = new Par<>( "Edad",20);
        System.out.println("La clave del par2 es: " + par2.obtenerClave());
        System.out.println("El valor del par2 es: " + par2.obtenerValor());
        Par<String,Double> par3 = new Par<>( "Promedio",8.75);
        System.out.println("La clave del par3 es: " + par3.obtenerClave());
        System.out.println("El valor del par3 es: " + par3.obtenerValor());
    }
}