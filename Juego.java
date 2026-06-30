public abstract class Juego{
        // atributos
    protected Tablero tablero;
    protected String nombreJuego;
    protected Jugador jugador1;
    protected Jugador jugador2;
    protected String nombrecito;
    // Constructor con argumentos
    public Juego(String juego, String j1, String j2){
        this.nombreJuego = juego;
        this.jugador1 = new Jugador(j1, 1);
        this.jugador2 = new Jugador(j2, 2);
    }
    
    public String getJugador(int valor){
        
        if (valor ==1){
        	nombrecito = jugador1.getJugador();
        } else if (valor ==2){
        	nombrecito = jugador2.getJugador();
        }
        
        return nombrecito;
    }
    
}
