package examenFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
public class cola {

	private nodo raiz, cima;

	public cola() {
		this.raiz= raiz;
		this.cima=cima;
	}
	public boolean colaVacia() {
		if(raiz ==null) {
			return true;
		}else {
			return false;
		}
	}
	public void agregar(agregar datos) {
		nodo co = new nodo(datos); 
		co.siguiente=null;
		if(colaVacia()) {
			raiz=co;
			cima=co;
		}else {
			cima.siguiente=co;
			cima=co;
		}
	}
	public void quitar(){
		if(colaVacia()) {
			System.out.println("Vacio");
		}else {
			System.out.println(raiz.datos.getCodigo());
			System.out.println(raiz.datos.getNombre());
			
			try {
				File file = new File("historico.txt");
				RandomAccessFile archivo1 = new RandomAccessFile(file, "rw");
				archivo1.seek(archivo1.length());
				archivo1.writeInt(raiz.datos.getCodigo());
				archivo1.writeUTF(raiz.datos.getNombre());
				
			}catch (IOException e){
				System. out.println(e.getMessage());
		}
			raiz=raiz.siguiente;
	}
	
}
	public void listar() {
		if(colaVacia()) {
			System.out.println("VACIO");
		} else {
			nodo t = raiz;
			while(t!= null) {
				System.out.println("Muestra de: "+ t.datos.getCodigo());
				System.out.println(t.datos.getNombre());
				System.out.println("\n");
				//System.out.println(raiz);
				//System.out.println(raiz.siguiente);
				t=t.siguiente;
				//System.out.println(raiz);
				//System.out.println(raiz.siguiente);
			}
		}
		
	}
	
	
	}

