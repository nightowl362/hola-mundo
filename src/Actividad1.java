import java.util.Scanner;

public class Actividad1 {

		 public static void main(String[] args){

		        Scanner lector = new Scanner(System.in);

		        System.out.println("Introduce una frase: ");
		        String frase = lector.nextLine();

		        contarCaracteres(frase);

		        lector.close();
		    }


		    public static void contarCaracteres(String frase) {
		        int y = 0;
		        int vecesLetra[];
		        vecesLetra = new int[26];

		        for(y = 0; y<frase.length(); y++) {
		            
		                vecesLetra[ (int)frase.charAt(y)-97 ]++;

		        }
		        for(y=0 ; y < vecesLetra.length; y++){
		            if(vecesLetra[y]>0){
		                System.out.println("La palabra "+(char)(y+97)+" tiene "+vecesLetra[y]+" letras");
		            }
		        }
		    }
		}





