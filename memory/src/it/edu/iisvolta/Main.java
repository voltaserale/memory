package it.edu.iisvolta;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] campo=new int[6][6];
		Random rnd =new Random();
		int r,c; //riga e colonna
		
		//genero la matrice
		for(int i=1;i<=18;i++) {
			for(int j=1;j<=2;j++) {		//per ogni i ripeto due volte
				do {
					r=rnd.nextInt(6);	//genera da 0 a 5
					c=rnd.nextInt(6);	//genera da 0 a 5	
				} while (campo[r][c]!=0);	//se la posizione è occupata genero di nuovo la riga e la colonna
				campo[r][c]=i;		//memorizzo il numero corrente nella posizione r,c
			}			
		}

	}

}
