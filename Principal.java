package examenFinal;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		muestra();
	}
	
	public static void muestra() {
		int opc;
		cola c = new cola();
	
	
		do { 
			System.out.println("Muestras");
			
			System.out.println("1. Agregar");
			System.out.println("2. Quitar");
			System.out.println("3. Listar");
			System.out.println("4. Salir");
		
			Scanner a = new Scanner (System.in);
			opc = a.nextInt();
			switch(opc){
			case 1: 
		
				try {
					File archivo = new File("data.txt");
					RandomAccessFile raf = new RandomAccessFile(archivo,"r");
					
					while(true) {
						int zo = raf.readInt();
						String  b = raf.readUTF();
						agregar as = new agregar(zo,b);
						System.out.println(zo+b);
						c.agregar(as);
					}			
				} catch(EOFException e ) {
					
				}
				catch(IOException e){
					
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				c.quitar();
				break;
			case 3:
				c.listar();
				break;
			}
		}while(opc!=4);
	}
	

}
