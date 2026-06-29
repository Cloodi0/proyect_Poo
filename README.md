//importammos una libreria para la lectura 
import java.util.Scanner;
import java.util.InputMismatchException; //nombre de la exception

//importamos un para de librerias para el registro de un error del perfil
import java.io.BufferedReader;
import java.nio.file.*;
import java.io.IOException;

public class Menu{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		Tablero matrizGato = new Tablero(3,3);
		Tablero matrizC4 = new Tablero(12,13);
						
        	int valorX;
        	int valorY;
        	int ficha;
        
        	//Inicializamos en 0 las variables pare evitar errores de compilacion
        	int codigo1 = 0;
        	int codigo2 = 0;
        	int cuenta;
        
        do{
            try{  //Aqui implemento nuestro primer Try para el menu principal
            	System.out.println("------Menu---------");
            	System.out.println("1. Seleccionar un juego");
            	System.out.println("2. Escribir/Cambiar el nombre del jugador 1 y 2");
            	System.out.println("3. Salir del programa");
            	System.out.println("Ingrese la opcion: ");
            	codigo1 = sc.nextInt();
            	
            	if (codigo1 == 1){
                		do{    
                    		    try{ //este es nuestro segundo try para Jugar los juegos
                    			System.out.println("Menu: ");
                    			System.out.println("1. Conecta 4");
                    			System.out.println("2. Gato / NO IMPLEMENTADO");
                    			System.out.println("3. Orbito / NO IMPLEMENTADO");
                    			System.out.println("4. Salir de juegos");
                    			System.out.println("Ingrese la opcion: ");
                   		        codigo2 = sc.nextInt();
                   		        
                   		        //Aqui si la opcion no esta entre 1 y 4 , reinciamos el ciclo
                   		        if(codigo2 < 1 || codigo2 > 4){
                   		        	System.out.println("Error :(");
                   		        	System.out.println("Opcion incorrecta fuera del rango de 1 a 4");
                   		        	continue;
                       		          }
                    		       }
                    			catch(InputMismatchException ex){
                    				System.out.println("Error :(");
                    				System.out.println("¡Debes ingresar un numero entero!");
                    				sc.next();
                    				codigo2 = 0;
                    				continue;
                    		} //cerramos el catch de juegos
                    			
                    		switch(codigo2){
                        		case 1:
                        
                        		System.out.println("-----------Bienvenido a conecta 4 :D------------");
                        		System.out.println("Escribe la celda a la que quieres acceder primero");
                        		System.out.println("Ingrese la x (0 - 5): ");
                        		valorX = sc.nextInt();
                        		System.out.println("Ingrese la y (0 - 6): ");
                        		valorY = sc.nextInt();
                        		System.out.println("Tu deseas consultar el valor de la celda [" + valorX + "]["+valorY+"]");
                        		System.out.println(matrizC4.getNumCeldaPad(valorX,valorY,3) );            
                       	        	System.out.println("Escribe el nuevo valor que quieres para la celda:");
                        		ficha = sc.nextInt();
                        		matrizC4.setNumCeldaPad(valorX,valorY, ficha,3);
                        		System.out.println("El nuevo valor es:" + matrizC4.getNumCeldaPad(valorX,valorY,3) );
        
                        		matrizC4.mostrarPad(6,7,3);
                        
                        		System.out.println("Menu: ");
                        		System.out.println("Escribe la celda a la que quieres acceder primero");
                        		System.out.println("Ingrese la x (0 - 5): ");
                        		valorX = sc.nextInt();
                        		System.out.println("Ingrese la y (0 - 6): ");
                        		valorY = sc.nextInt();
                        		System.out.println("Tu deseas consultar el valor de la celda [" + valorX + "]["+valorY+"]");
                        		System.out.println(matrizC4.getNumCeldaPad(valorX,valorY,3) );            
                        		System.out.println("Escribe el nuevo valor que quieres para la celda:");
                        		ficha = sc.nextInt();
                        		matrizC4.setNumCeldaPad(valorX,valorY, ficha,3);
                        		System.out.println("El nuevo valor es:" + matrizC4.getNumCeldaPad(valorX,valorY,3) );
        
                        		matrizC4.mostrarPad(6,7,3);
                        
                        		System.out.println("Menu: ");
                        		System.out.println("Escribe la celda a la que quieres acceder primero");
                        		System.out.println("Ingrese la x (0 - 5): ");
                        		valorX = sc.nextInt();
                        		System.out.println("Ingrese la y (0 - 6): ");
                        		valorY = sc.nextInt();
                        		System.out.println("Tu deseas consultar el valor de la celda [" + valorX + "]["+valorY+"]");
                        		System.out.println(matrizC4.getNumCeldaPad(valorX,valorY,3) );            
                        		System.out.println("Escribe el nuevo valor que quieres para la celda:");
                        		ficha = sc.nextInt();
                        		matrizC4.setNumCeldaPad(valorX,valorY, ficha,3);
                        		System.out.println("El nuevo valor es:" + matrizC4.getNumCeldaPad(valorX,valorY,3) );
        
                        		matrizC4.mostrarPad(6,7,3);
                        
                        		System.out.println("Menu: ");
                        		System.out.println("Escribe la celda a la que quieres acceder primero");
                        		System.out.println("Ingrese la x (0 - 5): ");
                        		valorX = sc.nextInt();
                        		System.out.println("Ingrese la y (0 - 6): ");
                        		valorY = sc.nextInt();
                        		System.out.println("Tu deseas consultar el valor de la celda [" + valorX + "]["+valorY+"]");
                        		System.out.println(matrizC4.getNumCeldaPad(valorX,valorY,3) );            
                        		System.out.println("Escribe el nuevo valor que quieres para la celda:");
                        		ficha = sc.nextInt();
                        		
                        		matrizC4.setNumCeldaPad(valorX,valorY, ficha,3);
                        		System.out.println("El nuevo valor es:" + matrizC4.getNumCeldaPad(valorX,valorY,3) );
        
                        matrizC4.mostrarPad(6,7,3);
                        
                        Conecta4 jueguitoc4 = new Conecta4(matrizC4,6,7);
                        System.out.println( jueguitoc4.checarWin(valorX,valorY,matrizC4) );
                        //System.out.println( "" )                      
                       
                        break;
                  } //aqui finalizo mi switch
                  
               }while(codigo2 != 4);	
                
            } else if (codigo1 == 2){
                         String nombre1;
               		 String nombre2;                         
                	 System.out.println("Ingresa el nombre del jugador #1");
	            	 sc.nextLine();
	            	 nombre1 = sc.nextLine();
			 Jugador id1 = new Jugador(nombre1);
			 System.out.println("Jugador 1: " + id1.getJugador() );
			    
	            System.out.println("Ingresa el nombre del jugador #2");
	            nombre2 = sc.nextLine();
			    Jugador id2 = new Jugador(nombre2);
			    System.out.println("Jugador 2: " + id2.getJugador() );
			
            }else if (codigo1 < 1 || codigo1 > 3){
            		System.out.println("Error :c");
            		System.out.println("Por favor, introduce un numero valido.");
            		sc.next(); //limpiamos el bufer para evitar el bucle infinito en el menu principal
            		codigo1 = 0;
            	}
 	} catch (InputMismatchException ex){
 		System.out.println("Error :c");
 		System.out.println("Introduce un numero valido");
 		sc.next();
 		codigo1 =0;
 		}	
        }while(codigo1 != 3);
       			 System.out.println("Saliendo del programa...");                
                        
    }
}
