/*
 * @author Luis Cordón
 * @date 18-11-2022
 * Controlador que realiza todos los cálculos relacionados con la disposición de los participantes. 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MiniAgente{
    Scanner teclado = new Scanner(System.in);
    private ArrayList<Participante> participantes;

    public MiniAgente() {
        participantes = new ArrayList<Participante>();
    }

    
    /** 
     * @param nombre
     * @param liderazgo
     * @param colaboracion
     * @param compañerismo
     * @param experiencia
     * @param conocimiento
     * @param creatividad
     * @param barato
     * @param profesional
     * @param tiempoCompleto
     */
    public void agregarParticipante(String nombre, boolean liderazgo, boolean colaboracion, boolean compañerismo, boolean experiencia, 
    boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean tiempoCompleto){
        participantes.add(new Participante(nombre, liderazgo, colaboracion, compañerismo, experiencia,
        conocimiento, creatividad, barato, profesional, tiempoCompleto));
    }

    
    /** 
     * @param numeroParticipante
     * Selecciona los participantes del sector "Investigativo".
     */
    public void Investigativo(int numeroParticipante){
        String a;
        if (participantes.get(numeroParticipante).getExperiencia()==true && participantes.get(numeroParticipante).getConocimiento()==true 
        && participantes.get(numeroParticipante).getCreatividad()==true){
            System.out.print("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" es el/la indicado(a) para el puesto\n");
            System.out.println("¿Desea contratarlo(a)? (responda si o no)");
            a = teclado.nextLine();
            if (a.equals("si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("Si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("no")){
                System.out.println("Entendible, tenga buen día\n");
            }
            else if (a.equals("No")){
                System.out.println("Entendible, tenga buen día\n");
            }
        }
        else {
            System.out.println("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" no cumple con los requisitos para el puesto. Inténtelo de nuevo\n");
        }
    }

    
    /** 
     * @param numeroParticipante
     * Selecciona los participantes del sector "Nuevo Cliente".
     */
    public void NuevoCliente(int numeroParticipante){
        String a;
        if (participantes.get(numeroParticipante).getProfesional()==true && participantes.get(numeroParticipante).getConocimiento()==true 
        && participantes.get(numeroParticipante).getCreatividad()==true){
            System.out.print("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" es el/la indicado(a) para el puesto\n");
            System.out.println("¿Desea contratarlo(a)? (responda si o no)");
            a = teclado.nextLine();
            if (a.equals("si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("Si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("no")){
                System.out.println("Entendible, tenga buen día\n");
            }
            else if (a.equals("No")){
                System.out.println("Entendible, tenga buen día\n");
            }
        }
        else {
            System.out.println("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" no cumple con los requisitos para el puesto. Inténtelo de nuevo\n");
        }
    }

    
    /** 
     * @param numeroParticipante
     * Selecciona los participantes del sector "Mantenimiento".
     */
    public void Mantenimiento(int numeroParticipante){
        String a;
        if (participantes.get(numeroParticipante).getExperiencia()==true && participantes.get(numeroParticipante).getLiderazgo()==true 
        && participantes.get(numeroParticipante).getColaboracion()==true){
            System.out.print("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" es el/la indicado(a) para el puesto\n");
            System.out.println("¿Desea contratarlo(a)? (responda si o no)");
            a = teclado.nextLine();
            if (a.equals("si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("Si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("no")){
                System.out.println("Entendible, tenga buen día\n");
            }
            else if (a.equals("No")){
                System.out.println("Entendible, tenga buen día\n");
            }
        }
        else {
            System.out.println("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" no cumple con los requisitos para el puesto. Inténtelo de nuevo\n");
        }
    }

    
    /** 
     * @param numeroParticipante
     * Selecciona los participantes del sector "Interno".
     */
    public void Interno(int numeroParticipante){
        String a;
        if (participantes.get(numeroParticipante).getCompañerismo()==true && participantes.get(numeroParticipante).getBarato()==true 
        && participantes.get(numeroParticipante).getTiempoCompleto()==true){
            System.out.print("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" es el/la indicado(a) para el puesto\n");
            System.out.println("¿Desea contratarlo(a)? (responda si o no)");
            a = teclado.nextLine();
            if (a.equals("si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("Si")){
                System.out.print("Se ha contratado a "+participantes.get(numeroParticipante).getNombre()+" ¡Felicidades!\n");
                participantes.remove(numeroParticipante);
                System.out.print("\n");
            }
            else if (a.equals("no")){
                System.out.println("Entendible, tenga buen día\n");
            }
            else if (a.equals("No")){
                System.out.println("Entendible, tenga buen día\n");
            }
        }
        else {
            System.out.println("\nEl/la participante "+participantes.get(numeroParticipante).getNombre()+" no cumple con los requisitos para el puesto. Inténtelo de nuevo\n");
        }
    }

}