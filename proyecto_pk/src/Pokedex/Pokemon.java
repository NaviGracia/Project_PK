package Pokedex;
public class Pokemon {
    //Atributos de objeto
        private int numPokedex = generarNumPokemon();
        private String nombre = nombrePokemon(numPokedex);
        private String tipo1 = averiguarTipo1Pokemon(nombre);
        private String tipo2 = averiguarTipo2Pokemon(nombre);
    
    //Getters & Setters
    public int getNumPokedex() {
        return generarNumPokemon();
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = generarNumPokemon();
    }

    public String getNombre() {
        return nombrePokemon(numPokedex);
    }

    public void setNombre(String nombre) {
        this.nombre = nombrePokemon(numPokedex);
    }

    public String getTipo1() {
        return averiguarTipo1Pokemon(nombre);
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = averiguarTipo1Pokemon(tipo1);
    }

    public String getTipo2() {
        return averiguarTipo2Pokemon(nombre);
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = averiguarTipo2Pokemon(tipo2);
    }

    //Constructores
    public Pokemon() {   
    }

    private int generarNumPokemon(){
        return (int) (Math.random()*(10-1)+1);
    }

    private String nombrePokemon(int nPokedex){
        switch(nPokedex){
            case 1: return "Sprigatito";
            case 2: return "Floragato";
            case 3: return "Meowscarada";
            case 4: return "Fuecoco";
            case 5: return "Crocalor";
            case 6: return "Skeledirge";
            case 7: return "Quaxly";
            case 8: return "Quaxwell";
            case 9: return "Quaquaval";
            case 10: return "Lechonk";
            default: return "Pokémon no Registrado";
        }
    }

    private String averiguarTipo1Pokemon(String nombre){
        switch(nombre){
            case "Sprigatito": return "Planta";
            case "Floragato": return "Planta";
            case "Meowscarada": return "Planta";
            case "Fuecoco": return "Fuego";
            case "Crocalor": return "Fuego";
            case "Skeledirge": return "Fuego";
            case "Quaxly": return "Agua";
            case "Quaxwell": return "Agua";
            case "Quaquaval": return "Agua";
            case "Lechonk": return "Normal";
            default: return "";
        }
    }


    private String averiguarTipo2Pokemon(String nombre){
        switch(nombre){
            case "Sprigatito": return "";
            case "Floragato": return "";
            case "Meowscarada": return "Siniestro";
            case "Fuecoco": return "";
            case "Crocalor": return "";
            case "Skeledirge": return "Fantasma";
            case "Quaxly": return "";
            case "Quaxwell": return "";
            case "Quaquaval": return "Lucha";
            case "Lechonk": return "";
            default: return "";
        }
    }

    public String toString() {
        return ("\n Pokédex de Paldea:" + "\n Nº Pokedex: " + numPokedex + "\n Nombre: " + nombre + "\n Tipos: " + tipo1 + " " + tipo2 + "\n");
    }    

}
