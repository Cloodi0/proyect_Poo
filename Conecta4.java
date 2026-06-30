public class Conecta4 extends Juego implements Verificador{

    //Aqui ingresamos a nuestro constructor
    public Conecta4(String j1, String j2){
        super("Conecta 4", j1,j2);
        this.tablero = new Tablero(12,13); //relleno es de 3
    }
    
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
        if( tablero.getNumCeldaPad(a,b,3) != 0){
            
            for (int i = 1; i < 4 ; i++){
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a+i,b,3)){
                    cuenta[0] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a+i,b+i,3)){
                    cuenta[1] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a,b+i,3)){
                    cuenta[2] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a-i,b+i,3) ){
                    cuenta[3] += 1;
                }     
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a-i,b,3) ){
                    cuenta[4] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a-i,b-i,3) ){
                    cuenta[5] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a,b-i,3) ){
                    cuenta[6] += 1;
                }
                
                if ( tablero.getNumCeldaPad(a,b,3) == tablero.getNumCeldaPad(a+i,b-i,3) ){
                    cuenta[7] += 1;
                }  
                
            }
            
            for (int j = 0; j < 8; j++){
                if (cuenta[j] == 3){
                    check = true;
                }
               
            }          
            
        }
        
        return check;   
    }

}
