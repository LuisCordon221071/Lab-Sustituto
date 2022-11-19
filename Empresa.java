/*
 * @author Luis Cordón
 * @date 18-11-2022
 * Vista del sistema, interactua con el usuario para encontrar posibles empleados. 
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Empresa{
    /** 
     * @param args
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random azar = new Random();
        MiniAgente agente = new MiniAgente();
        String menu = "Bienvenido a la búsqueda de empleados. Escoga una opción\n=================================\n "+
        "\t1. Investigativo\n"+
        "\t2. Nuevo Cliente\n"+
        "\t3. Mantenimiento\n"+
        "\t4. Interno\n"+
        "\t5. Salir\n" +
        "=================================";
        agente.agregarParticipante("Luis", false, false, false, true, true, true, false, false, false);
        agente.agregarParticipante("Ximena", false, false, false, false, true, true, false, true, false);
        agente.agregarParticipante("Pepe", true, true, false, true, false, false, false, false, false);
        agente.agregarParticipante("Paula", false, false, true, false, false, false, true, false, true);
        agente.agregarParticipante("Carlos", false, true, false, true, false, true, false, true, false);
        agente.agregarParticipante("Fabiola", true, false, true, false, false, true, false, true, false);
        agente.agregarParticipante("María Paula", false, false, false, true, true, true, false, false, false);
        agente.agregarParticipante("Diego", false, false, false, false, true, true, false, true, false);
        agente.agregarParticipante("Daenerys Targaryen", true, true, false, true, false, false, false, false, false);
        agente.agregarParticipante("Edson", false, false, true, false, false, false, true, false, true);
        int opcion = 1;
        while (opcion>=1 && opcion<5){
            try{
                System.out.println(menu);
                System.out.println("Ingrese una opción");
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1: 
                        agente.Investigativo(azar.nextInt(10));
                        break;
                    case 2: 
                        agente.NuevoCliente(azar.nextInt(10));
                        break;
                    case 3: 
                        agente.Mantenimiento(azar.nextInt(10));
                        break;
                    case 4: 
                        agente.Interno(azar.nextInt(10));
                        break;
                    default:
                        System.out.println("\n¡Espero haber sido de utilidad! :)\n");
                        break;
                }   
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número\n");
                opcion = 1;
            }
        }
    }
}