package Pokedex;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String comprobacion;
        do{
            System.out.println("Bienvenido a la Pokédex de Paldea (9ª Generación)!!");
            System.out.println("Presione 'Enter' para iniciar la Pokédex o escriba 'Exit' para cerrar la Pokédex.");
            comprobacion = sc.nextLine();
            if (!comprobacion.equalsIgnoreCase("Exit")) {
                System.out.println("Quiere buscar por Nº de Pokédex o por el nombre del Pokémon?");
                //Continuar con lo de la línea de arriba
                Pokemon pk1 = new Pokemon();
                System.out.println(pk1.toString());;
                //Usar for y una variable para que se generen diferentes pokemon
            }else{
                System.out.println("Pokédex Cerrada!! Vuelva a utilizarme siempre que no sepa el tipo de un pokémon!!");
            }
        } while(!comprobacion.equalsIgnoreCase("Exit"));


    }
}
