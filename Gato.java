public class Gato extends Juego implements Verificador{
    
    public Gato(String j1, String j2){
        super("Gato", j1,j2);
        this.tablero = new Tablero( 3, 3);
    }
    
    //public void EjecutarJuego(){
    	// logica para correr juego
    	// JugarTurno(j1);
    	// JugarTurno(j2);
    //}
    
    public Tablero getTablero(){
    	return this.tablero;
    }
    
    //Metodo para checar al ganador verificando los espacios de su alededor
    @Override
    public boolean checarWin(int x, int y, Tablero tablero){ //pasamos parametros del tablero del juego
    	
    	int a = x;
    	int b = y;
    	
        boolean check = false;
        int [] cuenta = new int[8];
        if( tablero.getNumCelda(a,b) != 0){
            
            for (int i = 0 ; i  < 3; i++ ){

		          if ( ( tablero.getNumCelda(i,0) == tablero.getNumCelda(i,1) ) && ( tablero.getNumCelda(i,0) == tablero.getNumCelda(i,2) ) ){
		              cuenta[i] += 1;
		          }
		        
		        
		        
		        
		          if ( ( tablero.getNumCelda(0,i) == tablero.getNumCelda(1,i) ) && ( tablero.getNumCelda(0,i) == tablero.getNumCelda(2,i) ) ){
		              cuenta[i+3] += 1;
		          }
		        
		        
            }
            
            if ( ( tablero.getNumCelda(0,0) == tablero.getNumCelda(1,1) ) && ( tablero.getNumCelda(0,0) == tablero.getNumCelda(2,2) ) ){
            	   cuenta[6] += 1;
	        }
	   
            if ( ( tablero.getNumCelda(0,2) == tablero.getNumCelda(1,1) ) && ( tablero.getNumCelda(0,2) == tablero.getNumCelda(2,0) ) ){
            	   cuenta[7] += 1;
	        }

            
            for (int j = 0; j < 8; j++){
                if (cuenta[j] == 1){
                    check = true;
                }
               
            }          
            
        }
        
        return check;   
    }
    
    
    

}
