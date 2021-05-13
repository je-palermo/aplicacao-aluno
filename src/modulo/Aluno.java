package modulo;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void Media() {
		// t1 = 30%, t2 = 35%, t3 = 35%
		
		double total = nota1 + nota2 + nota3;
		double media = 60;
		
		if(total >= 60) {
			System.out.println("Total = " + total);
			System.out.println("Aprovado");
		} else {
			System.out.println("Total = " + total);
			System.out.println("reprovado");
			System.out.println("Missing " + (media - total) + " Points");
		}
		
	}

}
