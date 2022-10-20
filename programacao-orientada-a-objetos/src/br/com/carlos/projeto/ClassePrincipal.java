package br.com.carlos.projeto;

public class ClassePrincipal {

	public static void main(String[] args) {

		ClasseConta objetoConta1 = new ClasseConta(); //Instância um objeto
		
		objetoConta1.atributoNomeConta = "Vitor Hugo";
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 450000.00 + (450000.00 * 0.20); //20%
		//objetoConta1.atributoSaldoConta = 450000.00; //20%
		objetoConta1.metodoDepositar(45000.00);
		
		System.out.println(objetoConta1.atributoNomeConta);
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		
		ClasseConta objetoConta2 = new ClasseConta(); //Instância um objeto
		
		objetoConta2.atributoNomeConta = "Handreya";
		objetoConta2.atributoNumeroConta = 4321;
		//objetoConta2.atributoSaldoConta = 14000.50 + (14000.50 * 0.20);
		objetoConta2.atributoSaldoConta = 14000.50;
		objetoConta2.metodoDepositar(45000.00);
		
		System.out.println(objetoConta2.atributoNomeConta);
		System.out.println(objetoConta2.atributoNumeroConta);
		System.out.println(objetoConta2.atributoSaldoConta);
	}

}
