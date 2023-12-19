package Pokedex;
import java.util.Scanner;
//Beta solo de Sprigatito y Fuecoco
public class Main {
    static Scanner sc = new Scanner(System.in);

    void elegirMovs(Pokemon pk1){
        System.out.println(pk1.listaMovsPokemon(pk1.getNumPokedex()));
        System.out.println("Introduzca el nombre del primer movimiento");
    }

    static void interfazCombate(Pokemon pk1, Pokemon pkSalvaje){
        do{
            System.out.println(pk1.textoInterfazCombate());
            System.out.println(pkSalvaje.textoInterfazCombate());
        } while((pk1.getPs()<=0)||(pkSalvaje.getPs()<=0));    
    }

    double dañar(Pokemon pk1){
        boolean bonificacionTipo = false;
        int variación = (int) (Math.random()*(100-85+1)+85);
        return 0.01*/*Aquí falta la bonificación de tipo y la de debilidad */variación*(((0.2*pk1.getNivel()+1)*pk1.getAtaque()));
    }

    static void encuentroSalvaje(Pokemon pk1){
        System.out.println("'Enter' para buscar pokémon salvajes");
        sc.nextLine();
        Pokemon pkSalvaje = new Pokemon();
        System.out.println(pkSalvaje.aparicionPKSalvaje());
        interfazCombate(pk1, pkSalvaje);
    }
    public static void main(String[] args) throws Exception {
        String comprobacion;
        do{
            System.out.println("Bienvenido a la Pokédex de Paldea (9ª Generación)!!");
            System.out.println("Presione 'Enter' para iniciar la Pokédex o escriba 'Exit' para cerrar la Pokédex.");
            comprobacion = sc.nextLine();
            if (!comprobacion.equalsIgnoreCase("Exit")) {
                System.out.println("Si quiere buscar por Nº de Pokédex o elegir uno aleatorio(1) o si quiere buscar por el nombre del Pokémon(2)?");
                int eleccion = sc.nextInt();
                if (eleccion == 1) {
                    System.out.println("Desea generar un nº aleatorio (1) o decidirlo usted(2)?");
                    int eleccionNumero = sc.nextInt();
                    sc.nextLine();
                    if (eleccionNumero==1) {
                        Pokemon pk1 = new Pokemon();
                        System.out.println(pk1.toString());
                        encuentroSalvaje(pk1);
                    } if (eleccionNumero==2) {
                        System.out.println("Ingrese el nº del pokemon que desea seleccionar (Actualmente del 1 al 10)");
                        int nPokedex = sc.nextInt();
                        Pokemon pk1 = new Pokemon(nPokedex, "");
                        System.out.println(pk1.toString());
                    }else{
                        System.out.println("Nº Incorrecto.");
                    }
                } if (eleccion == 2) {
                    System.out.println("Ingrese el nombre del Pokémon");
                    String nomPk = sc.nextLine();
                    Pokemon pk2 = new Pokemon(eleccion, nomPk, 0);
                    System.out.println(pk2.toString());
                    encuentroSalvaje(pk2);
                    interfazCombate(pk2, pk2);
                }
            }else{
                System.out.println("Pokédex Cerrada!! Vuelva a utilizarme siempre que no sepa el tipo de un pokémon!!");
            }
        } while(!comprobacion.equalsIgnoreCase("Exit"));


    }
}
/*Ideas de Diseño:
 *Diseñar fase de combate
 //Usar for y una variable para que se generen diferentes pokemon
 */
