package br.com.carlos.projeto;

public class ClasseConta { //Classe
	
	int atributoNumeroConta; //0
	double atributoSaldoConta; //0.0
	
	
	void metodoDepositar(double parametroValor){ //M�todo
	
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
		
	}
	
}
