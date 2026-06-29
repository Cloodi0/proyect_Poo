public class Conecta4 extends Tablero implements Verificador{
    
    public Conecta4(Tablero tablero, int largo, int alto){
        super(largo, alto);
    }
    
    //Metodo para checar al ganador verificando los espacios de su alededor
    @Override
    public boolean checarWin(int largo, int alto, Tablero tablero){ //pasamos parametros del tablero del juego
    	
    	int a = largo;
    	int b = alto;
    	
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
