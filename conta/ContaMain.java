package conta;

public class ContaMain {

	public static void main(String[] args) {
		//Conta 
		Conta c = new Conta("banco do Brasil", 132,321,0);
		if(c.deposito(1000))
			System.out.println("Depósito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);
		
		//Contasimples
		Contasimples cs = new Contasimples("Caixa", 456,654,100);
		System.out.println(cs.depositopoupanca(40000));
		System.out.println(cs.saquepoupanca(30000));
		System.out.println(cs.saquepoupanca(30000));
		System.out.println(cs);
		
		//ContaEspecial
		ContaEspecial ce = new ContaEspecial("Bradesco", 234,432,300);
		System.out.println(ce.valorlimite(400));
		System.out.println(ce.saquelimite(400));
		System.out.println(ce);
	}

}
