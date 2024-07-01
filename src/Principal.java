import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta=new ConsultarMoneda();

        int opcion;
        do {
            System.out.println("\n-------------------------------------------------------------------------------------\n");
            System.out.println("Conversor de monedas\n\n"+
                    "Seleccione una opcion:\n"+
                    "1 - Dolares a pesos argentinos\n"+
                    "2 - Pesos argentinos a dolares\n"+
                    "3 - Dolares a euros\n"+
                    "4 - Euros a dolares\n"+
                    "5 - Dolares a reales\n"+
                    "6 - Reales a dolares\n"+
                    "7 - Dolares a pesos uruguayos\n"+
                    "8 - Pesos uruguayos a dolares\n"+
                    "9 - Convertir otras monedas\n"+
                    "0 - Finalizar");
            opcion=lectura.nextInt();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "EUR", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("EUR", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertir("USD", "UYU", consulta, lectura);
                    break;
                case 8:
                    ConvertirMoneda.convertir("UYU", "USD", consulta, lectura);
                    break;
                case 9:
                    ConvertirMoneda.convertirPorCodigo(consulta,lectura);
                    break;
                case 0:
                    break;
            }
        }
        while (opcion != 0);
        System.out.println("\n\n"+"--------------------Programa finalizado--------------------");
    }
}