package questoesEstagio;

public class Quest4Faturament2 {

	public static void main(String[] args) {
		
		double[] vetFatu = {67.83643,36.67866,29.22988,27.16548,19.84953};
		String[] vetEstd = {"SP","RJ","MG","ES","Outros"};
		double soma = 0;
		String aux;
		double porcent=0;
		for(int i=0;i<vetFatu.length;i++) {
			soma += vetFatu[i];
		}
		for(int i=0;i<vetFatu.length;i++) {
			porcent=(vetFatu[i]*100)/soma;
			System.out.printf(vetEstd[i]+" = %.4f",porcent);
			System.out.println(" %");
		}
	}

}
