public class Jugador{
    
    private String nombre;
    private int ficha;
    
    public Jugador(String nuevoNombre,int nuevaFicha){
        nombre = nuevoNombre;
        ficha = nuevaFicha;
    }
    
    public String getJugador(){
        return this.nombre;
    }
    
    public int getFicha(){
        return this.ficha;
    }
}
