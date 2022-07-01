package questoesEstagio;

import java.util.Iterator;
import java.util.Scanner;

public class Quest5InvertPalavra {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String input = sc.next();
		int i=input.length()-1;
		char s[] = new char[input.length()];
		
		while(i>=0) {
			s[i]=input.charAt(i);
			System.out.print(s[i]);
			i--;
		}
	}
}
