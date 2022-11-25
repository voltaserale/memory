package it.edu.iisvolta;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] campo=new int[4][4];
		String[] lettere= {"A","B","C","D","E",
						   "F","G","H"};
		
		Random rnd =new Random();
		int r,c; //riga e colonna
		int r1,c1,indovinati=0;
		Scanner s =new Scanner(System.in);
		
		
		//genero la matrice
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=2;j++) {		//per ogni i ripeto due volte
				do {
					r=rnd.nextInt(4);	//genera da 0 a 3
					c=rnd.nextInt(4);	//genera da 0 a 3	
				} while (campo[r][c]!=0);	//se la posizione è occupata genero di nuovo la riga e la colonna
				campo[r][c]=-i;		//memorizzo il numero (negativo) corrente nella posizione r,c
			}			
		}
		do {
			//stampo la matrice
			stampaCampo(campo, lettere);
			
			System.out.println("Inserisci le coordinate della prima casella:");
			System.out.print("riga: ");
			r=Integer.parseInt(s.nextLine());
			System.out.print("colonna: ");
			c=Integer.parseInt(s.nextLine());
			//rendo positivi i numeri corrispondenti alle due caselle indicate
			campo[r][c]=-campo[r][c];	
			stampaCampo(campo, lettere);
			System.out.println("Inserisci le coordinate della prima casella:");
			System.out.print("riga: ");
			r1=Integer.parseInt(s.nextLine());
			System.out.print("colonna: ");
			c1=Integer.parseInt(s.nextLine());
			//rendo positivi i numeri corrispondenti alle due caselle indicate
			campo[r1][c1]=-campo[r1][c1];			
			stampaCampo(campo, lettere);
			System.out.println("Premi Enter per continuare...");
			s.nextLine();
			if (campo[r][c]!=campo[r1][c1]) {
				campo[r][c]=-campo[r][c];		
				campo[r1][c1]=-campo[r1][c1];
			} else 
				indovinati+=2;	//indovinati=indovinati+2
			//stampo
			stampaCampo(campo, lettere);
			System.out.println("Premi Enter per continuare...");
			s.nextLine();
		} while(indovinati<16);
		System.out.println("Complimenti!");
		s.nextLine();
		
		s.close();
	}

	static void stampaCampo(int[][] campo, String[] lettere  ) {
		int r,c,num;
		Console.clear();
		for (r=0;r<4;r++)
			for (c=0;c<4;c++)
				if (campo[r][c]>0)		//stampo solo se positivi
				{
					Console.setCursorPosition(r*4+1, c*6+1);
					num=campo[r][c];	//da 0 a 17
					System.out.print(lettere[num-1]);				
				}
		Console.setCursorPosition(17, 1);
	}
}
