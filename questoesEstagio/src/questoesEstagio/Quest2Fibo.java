package questoesEstagio;

import java.util.Scanner;

public class Quest2Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira:");
		int input = sc.nextInt();
		
		int var[] = new int[input];
		String msg = "O numero nao pertence a sequencia";
		
		for(int i=0;i<var.length;i++) {
			var[i]=i;
			if(var[i]>=2) {
				var[i]=var[i-1]+(var[i-2]);
				if(var[i]==input) {
					msg="O numero pertence a sequencia";
					break;
				}
			}
		}
		System.out.println(msg);
	}
}
