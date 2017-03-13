package aplicacion;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.sound.sampled.LineUnavailableException;

import wasdev.sample.servlet.*;
public class AplWatsonton {
	public static void main(String[] args) throws ServletException, IOException, InterruptedException, LineUnavailableException {
		Speech ss = new Speech();
		String opcion;int month = 8;
		
		
		
		 opcion=ss.voz_a_texto();
		 
		 System.out.println("Desea transcribir a ingles");
		 System.out.println("Digite SI o NO");

		 String entradaTeclado = "";
	     Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	     entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
		 
		 switch (entradaTeclado ) {
         case "SI": 
        	 Translator s2t=new Translator();
        	 s2t.traducir(opcion);
                  break;
         case "NO": 
        	 System.out.println("Gracias");
                  break;
     
         default: opcion = "Invalid month";
                  break;
     }
		 
	}
}
