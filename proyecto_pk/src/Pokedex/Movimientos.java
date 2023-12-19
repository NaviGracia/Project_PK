package Pokedex;

public class Movimientos {
    private String nombre;
    private int potencia = averiguarPotencia(nombre);
    private int precision = averiguarPrecision(nombre);
    private String tipo = averiguarTipo(nombre);
    /*
     * pp
     * Efectos secundarios?
     * Prioridad
     */

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPrecision() {
        return precision;
    }
    public void setPrecision(int precisión) {
        this.precision = precision;
    }
//Constructores
    public Movimientos(String nombre){
        this.nombre = nombre;
    }

    private int averiguarPotencia(String nombre){
        switch(nombre){
            case "Fitoimpulso": return 55;
            case "Carantoña": return 90;
            case "Tormenta Floral": return 90;
            case "Garra Umbria": return 70;
            case "Voto Fuego": return 80;
            case "Llamarada": return 110;
            case "Lanzallamas": return 90;
            case "Alarido": return 55;
            default: return 60;
        }
    }

    private int averiguarPrecision(String nombre){
        switch(nombre){
            case "Carantoña": return 90;
            case "Llamarada": return 85;
            case "Alarido": return 95;
            default: return 100;
        }
    }

    private String averiguarTipo(String nombre){
        switch(nombre){
            case "Fitoimpulso": return "Planta";
            case "Tormenta Floral": return "Planta";
            case "Carantoña": return "Hada";
            case "Garra Umbria": return "Fantasma";
            case "Voto Fuego": return "Fuego";
            case "Llamarada": return "Fuego";
            case "Lanzallamas": return "Fuego";
            case "Alarido": return "Siniestro";
            default: return "Normal";
        }
    }

}
