package Pokedex;
public class Pokemon {
    //Atributos de objeto
        private int numPokedex = generarNumPokemon();
        private String nombre = nombrePokemon(numPokedex);
        private String tipo1 = averiguarTipo1Pokemon(nombre);
        private String tipo2 = averiguarTipo2Pokemon(nombre);
        private double nivel = 100;
        private double ps = averiguarPS(nombre);
        private double ataque = averiguarAtaque(nombre);
        private double defensa = averiguarDefensa(nombre);
        private double ataqueEsp = averiguarAtaqueEsp(nombre);
        private double defensaEsp = averiguarDefensaEsp(nombre);
        private double velocidad = averiguarVelocidad(nombre);
        private Movimientos[] mov;
        private int numMovs = 0;

    //variable sexo
        //variable habilidad
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

    public double getPs() {
            return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;        
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
            this.defensa = defensa;
    }

    public double getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }    

    public double getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getNivel() {
            return nivel;
        }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Constructores
    public Pokemon() {   
        mov = new Movimientos[4];
    }

    public Pokemon(int numPokedex, String nombre){
        this.numPokedex = numPokedex;
        this.nombre = nombrePokemon(numPokedex);
        mov = new Movimientos[4];
    }

    public Pokemon(int numPokedex, String nombre, int ps){
        this.numPokedex = averiguarNPk(nombre);
        this.nombre = nombre;
    }

    void agregarMovs(String nombre){
        mov[numMovs] = new Movimientos()
    }

    //Métodos

    private int generarNumPokemon(){
        return (int) (Math.random()*(10-1)+1);
    }

     private int averiguarNPk(String nombre){
        switch(nombre){
            case "Sprigatito": return 1;
            case "Floragato": return 2;
            case "Meowscarada": return 3;
            case "Fuecoco": return 4;
            case "Crocalor": return 5;
            case "Skeledirge": return 6;
            case "Quaxly": return 7;
            case "Quaxwell": return 8;
            case "Quaquaval": return 9;
            case "Lechonk": return 10;
            default: return 0;
        }
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
            case "Meowscarada": return "Siniestro";
            case "Skeledirge": return "Fantasma";
            case "Quaquaval": return "Lucha";
            default: return "";
        }
    }
    
    private int averiguarPS(String nombre){
        switch(nombre){
            case "Sprigatito": return 190;
            case "Floragato": return 232;
            case "Meowscarada": return 262;
            case "Fuecoco": return 244;
            case "Crocalor": return 272;
            case "Skeledirge": return 318;
            case "Quaxly": return 220;
            case "Quaxwell": return 250;
            case "Quaquaval": return 280;
            case "Lechonk": return 218;
            default: return 0;
        }
    }

    private int averiguarAtaque(String nombre){
        switch(nombre){
            case "Sprigatito": return 114;
            case "Floragato": return 148;
            case "Meowscarada": return 202;
            case "Fuecoco": return 85;
            case "Crocalor": return 103;
            case "Skeledirge": return 139;
            case "Quaxly": return 121;
            case "Quaxwell": return 157;
            case "Quaquaval": return 220;
            case "Lechonk": return 85;
            default: return 0;
        }
    }

    private int averiguarDefensa(String nombre){
        switch(nombre){
            case "Sprigatito": return 101;
            case "Floragato": return 117;
            case "Meowscarada": return 130;
            case "Fuecoco": return 110;
            case "Crocalor": return 144;
            case "Skeledirge": return 184;
            case "Quaxly": return 85;
            case "Quaxwell": return 121;
            case "Quaquaval": return 148;
            case "Lechonk": return 76;
            default: return 0;
        }
    }

    private int averiguarAtaqueEsp(String nombre){
        switch(nombre){
            case "Sprigatito": return 85;
            case "Floragato": return 112;
            case "Meowscarada": return 150;
            case "Fuecoco": return 117;
            case "Crocalor": return 166;
            case "Skeledirge": return 202;
            case "Quaxly": return 94;
            case "Quaxwell": return 121;
            case "Quaquaval": return 157;
            case "Lechonk": return 67;
            default: return 0;
        }
    }

    private int averiguarDefensaEsp(String nombre){
        switch(nombre){
            case "Sprigatito": return 85;
            case "Floragato": return 117;
            case "Meowscarada": return 130;
            case "Fuecoco": return 76;
            case "Crocalor": return 108;
            case "Skeledirge": return 139;
            case "Quaxly": return 85;
            case "Quaxwell": return 112;
            case "Quaquaval": return 139;
            case "Lechonk": return 85;
            default: return 0;
        }
    }
    private int averiguarVelocidad(String nombre){
        switch(nombre){
            case "Sprigatito": return 121;
            case "Floragato": return 153;
            case "Meowscarada": return 225;
            case "Fuecoco": return 69;
            case "Crocalor": return 92;
            case "Skeledirge": return 123;
            case "Quaxly": return 94;
            case "Quaxwell": return 121;
            case "Quaquaval": return 157;
            case "Lechonk": return 67;
            default: return 0;
        }
    }

    public String toString() {
        return ("\n Pokédex de Paldea:" + "\n Nº Pokedex: " + numPokedex + "\n Nombre: " + nombre + "\n Tipos: " + tipo1 + " " + tipo2 + "\n");
    }

    public String textoInterfazCombate() {
        return ("\n Nombre: " + nombre + "\n Tipos: " + tipo1 + " " + tipo2 + "\n PS: " + ps);
    }

    public String aparicionPKSalvaje(){
        return ("Ha aparecido un " + nombre + " salvaje!!");
    }

}

