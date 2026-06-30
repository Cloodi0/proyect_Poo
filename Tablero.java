public class Tablero{
    
    //atributos de la clase
    protected int [][] area;
    
    //Contructor para el tablero
    public Tablero( int largo, int alto){
        area = new int [largo][alto];
    }
    
    //metodo para checar el numero de celda
    public int getNumCeldaPad( int a, int b, int extra){
        int numCelda = this.area[a+extra][b+extra]; 
        return numCelda;
    }
	
	public int setNumCeldaPad( int a, int b,int nuevoNum, int extra){
        this.area[a+extra][b+extra] = nuevoNum; 
        return area[a+extra][b+extra];
	}
	
    //metodo para checar el numero de celda
    public int getNumCelda( int a, int b){
        int numCelda = this.area[a][b]; 
        return numCelda;
    }
	
	public int setNumCelda( int a, int b,int nuevoNum){
        this.area[a][b] = nuevoNum; 
        return area[a][b];
	}
	
	//funcion para recrear el cuadro del juego sin relleno a los bordes
	public void mostrar(int a, int b){
	   for (int i = 0; i < a ; i++){
	       for(int j = 0; j < b; j++){
	           if(this.area[i][j]==0){
	               System.out.print("[ ]" );
	           } else if (this.area[i][j]==1) {
	               System.out.print("[X]" );
	           } else if (this.area[i][j]==2) {
	               System.out.print("[O]" );
	           }
	       }
	       System.out.println();
	   }
    }
	
	//funcion para recrear el cuadro del juego con relleno a los bordes
	public void mostrarPad(int a, int b, int extra){
	   for (int i = 0 + extra; i < a + extra; i++){
	       for(int j = 0 + extra; j < b + extra; j++){
	           if(this.area[i][j]==0){
	               System.out.print("[ ]" );
	           } else if (this.area[i][j]==1) {
	               System.out.print("[X]" );
	           } else if (this.area[i][j]==2) {
	               System.out.print("[O]" );
	           }
	       }
	       System.out.println();
	   }
    }
}
