import java.util.Scanner;


public class ConvertirMoneda {


    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consultar, Scanner lectura) {
        double cantidad;
        double cantidadResultante;

        Monedas moneda = consultar.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("\nTasa conversion de hoy: " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaTarget+"\n");
        try{
            System.out.println("Cantidad de " + monedaBase + " a convertir: ");
            cantidad = lectura.nextDouble();
            cantidadResultante = cantidad * moneda.conversion_rate();
            System.out.println("monto resultante: "+cantidad+" "+monedaBase+ " = "+cantidadResultante+" "+monedaTarget);
        }catch (Exception e){
            throw new RuntimeException("Ingrese un valor valido");
        }

    }

    public static void convertirPorCodigo(ConsultarMoneda consulta, Scanner lector){

        try{
            System.out.println("ingrese el codigo de la moneda a convertir");
            String monedaBase = lector.nextLine().toUpperCase();
            System.out.println("ingrese el codigo de la moneda objetivo");
            String monedaTarget = lector.nextLine().toUpperCase();
            convertir(monedaBase,monedaTarget,consulta,lector);
        }catch (Exception e){
            throw new RuntimeException("Codigo no encontrado, verifique que sea correcto");
        }

    }
}