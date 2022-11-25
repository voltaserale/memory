package it.edu.iisvolta;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] campo=new int[6][6];
		String[] lettere= {"A","B","C","D","E",
						   "F","G","H","I","J",
						   "K","L","M","N","O",
						   "P","Q","R"};
		
		Random rnd =new Random();
		int r,c,num; //riga e colonna
		Scanner s =new Scanner(System.in);
		
		//genero la matrice
		for(int i=0;i<=17;i++) {
			for(int j=1;j<=2;j++) {		//per ogni i ripeto due volte
				do {
					r=rnd.nextInt(6);	//genera da 0 a 5
					c=rnd.nextInt(6);	//genera da 0 a 5	
				} while (campo[r][c]!=0);	//se la posizione è occupata genero di nuovo la riga e la colonna
				campo[r][c]=i;		//memorizzo il numero corrente nella posizione r,c
			}			
		}
		
		//stampo la matrice
		for (r=0;r<6;r++)
			for (c=0;c<6;c++) {
				Console.setCursorPosition(r*4+1, c*6+1);
				num=campo[r][c];	//da 0 a 17
				System.out.print(lettere[num]);
				
			}
		s.nextLine();
		//s.close();
	}

}
